package com.zyb.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zyb.pojo.Persons;
import com.zyb.pojo.Result;
import com.zyb.service.ParticularsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/particulars")
public class ParticularsController {


    @Reference
    ParticularsService particularsService;

    //查询选手详情页
    @RequestMapping("/all")
    public Result allParticulars(String id){

        //查询选手项目详情信息
       List list =  particularsService.allParticulars(id);

       //查询选手个人信息
        Persons persons =particularsService.personsMessage(id);

        return new Result(true,"查询成功",list,persons);
    }

}
