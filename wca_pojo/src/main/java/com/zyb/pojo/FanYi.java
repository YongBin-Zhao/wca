package com.zyb.pojo;

public class FanYi {
    private String id;
    private String china;



    public FanYi(String id, String china) {
        this.id = id;
        this.china = china;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChina() {
        return china;
    }

    public void setChina(String china) {
        this.china = china;
    }

    @Override
    public String toString() {
        return "fanYi{" +
                "id='" + id + '\'' +
                ", china='" + china + '\'' +
                '}';
    }
}
