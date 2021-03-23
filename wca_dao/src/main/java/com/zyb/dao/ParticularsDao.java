package com.zyb.dao;

import com.zyb.pojo.Items;
import com.zyb.pojo.Persons;

import java.util.List;
import java.util.Map;

public interface ParticularsDao {


    //选手所有项目成绩
     List<Items> allParticulars(String id);

    Persons onePerson(String id);




    List<Map<String,Object>> experience(String id);

}
