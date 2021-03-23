package com.zyb.pojo;

import java.io.Serializable;

/**封装选手个人成绩的类*/
public class Items implements Serializable {
    private String wcaId;
    private String eventId;//项目名称
    private String pbBast;
    private Integer pbWorld;
    private Integer pbContinent;//单次洲排名
    private Integer pbCountry;//单次地区排名
    private String avgBast;
    private Integer avgWorld;
    private Integer avgContinent;//平均洲排名
    private Integer avgCountry;//平均地区排名

    public String getWcaId() {
        return wcaId;
    }

    public void setWcaId(String wcaId) {
        this.wcaId = wcaId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getPbBast() {
        return pbBast;
    }

    public void setPbBast(String pbBast) {
        this.pbBast = pbBast;
    }

    public Integer getPbWorld() {
        return pbWorld;
    }

    public void setPbWorld(Integer pbWorld) {
        this.pbWorld = pbWorld;
    }

    public Integer getPbContinent() {
        return pbContinent;
    }

    public void setPbContinent(Integer pbContinent) {
        this.pbContinent = pbContinent;
    }

    public Integer getPbCountry() {
        return pbCountry;
    }

    public void setPbCountry(Integer pbCountry) {
        this.pbCountry = pbCountry;
    }

    public String getAvgBast() {
        return avgBast;
    }

    public void setAvgBast(String avgBast) {
        this.avgBast = avgBast;
    }

    public Integer getAvgWorld() {
        return avgWorld;
    }

    public void setAvgWorld(Integer avgWorld) {
        this.avgWorld = avgWorld;
    }

    public Integer getAvgContinent() {
        return avgContinent;
    }

    public void setAvgContinent(Integer avgContinent) {
        this.avgContinent = avgContinent;
    }

    public Integer getAvgCountry() {
        return avgCountry;
    }

    public void setAvgCountry(Integer avgCountry) {
        this.avgCountry = avgCountry;
    }
}
