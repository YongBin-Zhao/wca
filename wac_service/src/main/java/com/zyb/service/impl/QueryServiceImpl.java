package com.zyb.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zyb.dao.QueryDao;
import com.zyb.pojo.FanYi;
import com.zyb.pojo.PageResult;
import com.zyb.pojo.Persons;
import com.zyb.service.QueryService;
import com.zyb.utils.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service(interfaceClass = QueryService.class )
@Transactional//开启事务
public class  QueryServiceImpl implements QueryService {

    @Autowired
    private QueryDao queryDao;



    //获取下拉列表数据
    @Override
    public List menuData() {
        //返回的list
        List list = new ArrayList();


        //世界分组
        Map world = new HashMap();
        world.put("value","");
        world.put("label","世界");

        List worldList = new ArrayList();
        worldList.add(world);

        Map mapWorld = new HashMap();
        mapWorld.put("options",worldList);

        //洲分组
        List<FanYi> countinentsList = queryDao.selectCountinents();
        List listCountinents = new ArrayList();
        for (FanYi fanYi:countinentsList) {
            Map map = new HashMap();
            map.put("value",fanYi.getId());
            map.put("label",fanYi.getChina());
            listCountinents.add(map);
        }
        Map mapCountinents = new HashMap();
        mapCountinents.put("label","洲");
        mapCountinents.put("options",listCountinents);



        //地区分组
        List<FanYi> countriesList = queryDao.selectCountries();
        List listCountries = new ArrayList();

        /*Map mapChina = new HashMap();
        mapChina.put("value","China");
        mapChina.put("label","中国");
        listCountries.add(mapChina);*/

        for (FanYi fanYi:countriesList) {
            Map map = new HashMap();
            map.put("value",fanYi.getId());
            map.put("label",fanYi.getChina());
            listCountries.add(map);
        }
        Map mapCountries= new HashMap();
        mapCountries.put("label","地区");
        mapCountries.put("options",listCountries);



        //把三个Map放进总list
        list.add(mapWorld);
        list.add(mapCountinents);
        list.add(mapCountries);

        return list;
    }




    //根据条件查询选手信息,并分页返回
    @Override
    public PageResult findPage(Integer currentPage, Integer pageSize, String queryString,String region,String gender) {



        //初始化分页操作
        PageHelper.startPage(currentPage,pageSize);

        Page<Persons>  page= null;


        if("".equals(region)){//如果地区为空，说明查询的是世界所有
            //返回查询结果
            page=  queryDao.findPage(queryString,gender);

        } else if(Translation.continent.get(region)!=null){//说明查寻的是州 需要先关联查询

            page = queryDao.countinentsFindPage(queryString,region,gender);


        }else {//如果地区不为空，且不匹配州，说明查询的是某一地区
            page=  queryDao.countriesFindPage(queryString,region,gender);

        }


        //循环处理返回值
        if(page.getResult()!=null&&page.getResult().size()>0){
            for (Persons persons:page.getResult()) {
                //把地区翻译为中文
                persons.setCountryId(Translation.region.get(persons.getCountryId()));
                if(persons.getGender().equals("f")){//判断是否为f
                    persons.setGender("女");//修改为女
                }else {//否则为男
                    persons.setGender("男");
                }
            }
        }
        //封装为自己的类型
        return new PageResult(page.getTotal(),page.getResult());

    }



}
