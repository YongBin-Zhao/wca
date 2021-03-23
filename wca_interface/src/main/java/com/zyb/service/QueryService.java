package com.zyb.service;

import com.zyb.pojo.PageResult;
import com.zyb.pojo.Persons;

import javax.swing.*;
import java.util.List;

public interface QueryService {

    List menuData();


    PageResult findPage(Integer currentPage, Integer pageSize, String queryString,String region,String gender);


}
