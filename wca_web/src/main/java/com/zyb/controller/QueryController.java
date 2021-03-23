package com.zyb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyb.pojo.PageResult;
import com.zyb.pojo.QueryPageBean;
import com.zyb.pojo.Result;
import com.zyb.service.QueryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/Query")
public class QueryController {

    @Reference//远程调用
    QueryService queryService;

    /*查询下拉菜单*/
    @RequestMapping("/menuData")
    public Result menuData(){

        List list = queryService.menuData();
        return new Result(true,"查询下拉列表数据成功",list);
    }


    /*根据条件查询选手列表*/
    @RequestMapping("/findPage")
    /*RequestBody获取请求体的数据并按类来封装*/
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){

        PageResult pageResult = queryService.findPage(queryPageBean.getCurrentPage(),
                                queryPageBean.getPageSize(),
                                queryPageBean.getQueryString(),
                                queryPageBean.getRegion(),
                                queryPageBean.getGender());
        return  pageResult;
    }




}
