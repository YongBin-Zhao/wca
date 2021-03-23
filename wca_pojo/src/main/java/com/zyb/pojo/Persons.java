package com.zyb.pojo;



import java.io.Serializable;


//实现序列化
public class Persons implements Serializable {

    private String   id;//wcaId
    private String   name;//姓名
    private String   countryId;//地区
    private String   gender;//性别
    private Integer  matchCount;//比赛次数
    private String   undergo;//参赛经历

    public Persons() {
    }

    public Persons(String id, String name, String countryId, String gender) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.gender = gender;
    }

    public Persons(String id, String name, String countryId, String gender, Integer matchCount, String undergo) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.gender = gender;
        this.matchCount = matchCount;
        this.undergo = undergo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
    }

    public String getUndergo() {
        return undergo;
    }

    public void setUndergo(String undergo) {
        this.undergo = undergo;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", countryId='" + countryId + '\'' +
                ", gender='" + gender + '\'' +
                ", matchCount=" + matchCount +
                ", undergo='" + undergo + '\'' +
                '}';
    }
}
