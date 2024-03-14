package com.weather.models;

public class City {
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
    public City(Integer id,String name){
        this.id=id;
        this.name=name;

    }
}
