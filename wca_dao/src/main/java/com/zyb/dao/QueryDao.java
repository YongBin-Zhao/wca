package com.zyb.dao;

import com.github.pagehelper.Page;
import com.zyb.pojo.Persons;
import com.zyb.pojo.FanYi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QueryDao {

    //获取下拉菜单
    List<FanYi> selectCountinents();

    //获取下拉菜单
    List<FanYi> selectCountries();

    /*@Param为参数设置别名 如果只有一个参数时，无需指定*/
    Page<Persons> findPage(@Param("queryString") String queryString,@Param("gender") String gender);

    //地区查询
    Page<Persons> countriesFindPage(@Param("queryString") String queryString,@Param("region") String region,@Param("gender") String gender);

    //州查询
    Page<Persons> countinentsFindPage(@Param("queryString") String queryString,@Param("region") String region,@Param("gender") String gender);



}

