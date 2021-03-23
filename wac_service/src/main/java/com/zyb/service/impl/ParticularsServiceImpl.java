package com.zyb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyb.dao.ParticularsDao;
import com.zyb.pojo.Items;
import com.zyb.pojo.Persons;
import com.zyb.service.ParticularsService;
import com.zyb.utils.ResultsFormat;
import com.zyb.utils.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = ParticularsService.class)
@Transactional
public class ParticularsServiceImpl implements ParticularsService {

    @Autowired
    private ParticularsDao particularsDao;




    //查询选手详情页项目信息
    @Override
    public List allParticulars(String id) {


        List<Items> list = particularsDao.allParticulars(id);
        for (Items temp:list) {//对17个项目进行格式处理
            if(temp.getEventId().equals("333mbf")||temp.getEventId().equals("333mbo")){//多盲
                temp.setEventId(Translation.events.get(temp.getEventId()));
                temp.setPbBast(ResultsFormat.HowBlind(Integer.parseInt(temp.getPbBast())));
            }else if(!temp.getEventId().equals("333fm")){//如果不是最少步
                //翻译项目名称
                temp.setEventId(Translation.events.get(temp.getEventId()));
                //转化单次成绩格式
                temp.setPbBast(ResultsFormat.velocity(Integer.parseInt(temp.getPbBast())));
                //转换平均成绩格式
                if(temp.getAvgBast()!=null) { //需要进行非空判断
                    temp.setAvgBast(ResultsFormat.velocity(Integer.parseInt(temp.getAvgBast())));
                }
            }else {//最少步无需格式转化
                temp.setEventId("最少步");
            }
        }
        return list;
    }

    //查询选手详情页个人信息
    @Override
    public Persons personsMessage(String id) {

        String date;

        //查询个人信息
        Persons persons = particularsDao.onePerson(id);
        //格式化地区
        persons.setCountryId(Translation.region.get(persons.getCountryId()));
        //格式化性别
        if(persons.getGender().equals("f")){
            persons.setGender("女");
        }else {
            persons.setGender("男");
        }


        //查询参赛经历
        List<Map<String,Object>> list =  particularsDao.experience(id);
        List<String> dateList = new ArrayList<>();

        //参赛次数
        persons.setMatchCount(list.size());

        for (Map temp:list) {
            int month = (int) temp.get("month");
            int day = (int) temp.get("day");
            String sMonth;
            String sDay;


            if(month<10){
                sMonth = ""+0+month;
            }else {
                sMonth = ""+month;
            }

            if(day<10){
                sDay = ""+0+day;
            }else {
                sDay = ""+day;
            }


            String str = ""+temp.get("year")+"."+sMonth+"."+sDay;
            dateList.add(str);
        }
        //判断选手是否只参加过一场比赛
        if(dateList.size()>1){
           date = ""+dateList.get(0)+" - "+dateList.get(dateList.size()-1);
        }else {
            date = ""+dateList.get(0);
        }


        persons.setUndergo(date);
        return persons;

    }

}
