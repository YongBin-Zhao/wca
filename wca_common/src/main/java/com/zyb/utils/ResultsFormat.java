package com.zyb.utils;

//转换数据库中成绩的工具类
public class ResultsFormat {


    //转换多盲成绩
     public static String HowBlind(Integer DbValue) {

        int n = DbValue % 1000000;//时间及失败个数
        int lost = n % 100;//失败个数
        int totalTime = (n - lost) / 100;//用时时间总秒数
        int min = 0;//分
        String sec;//秒

         //如果秒大于60
        if (totalTime > 60) {
            //获取分钟
            min = totalTime / 60;
        }
        //获取不足一分的秒
        int intSec = totalTime % 60;//整数秒
         //秒如果不满10进行补位
        if (intSec < 10) {
            sec = 0 + "" + intSec;
        } else {
            sec = "" + intSec;
        }

        int difference = (DbValue - n) / 10000000;//成功个数与99的差值
        int succeed = 99 - difference + lost;//还原个数
        int sum  = succeed + lost;//挑战个数

        return succeed + "/" + sum  + " " + min + ":" + sec;
    }

    //转换速拧成绩
    //思路 速拧成绩的时间是秒单位的100倍 得到秒以后换算成时间单位即可 注意补位
    public static String velocity(Integer DbValue) {
        int min = 0;//分
        int intSec;//没补位的秒
        int intMs;//没补位的毫秒
        String sec;//秒
        String ms;//毫秒

        //先判断时间是否大于一分钟
        if (DbValue > 6000) {
            //计算分钟数
            min = DbValue / 6000;
        }

        //通过取模除一百获取不足一分的秒
        intSec = DbValue % 6000 / 100;//秒

        //如果秒小于10并且分不为0进行补位
        if (intSec < 10 && min != 0) {
            sec = 0 + "" + intSec;
        } else {
            sec = "" + intSec;
        }

        //取模一百获取不足一秒的毫秒
        intMs = DbValue % 100;
        //小于100毫秒进行补位
        if (intMs < 10) {
            ms = 0 + "" + intMs;
        } else {
            ms = "" + intMs;
        }

        //判断有没有分单位
        if (min == 0) {
            return sec + "." + ms;
        }
        return min + ":" + sec + "." + ms;
    }
}
