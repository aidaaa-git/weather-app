package com.weather.models;

public class WeatherPerHour {
    private Integer id;
    private Integer hour;
    private Integer temperature;
    private Integer wind;
    private Integer humidity;
    public WeatherPerHour( Integer id, Integer hour, Integer temperature,Integer wind,  Integer humidity){
        this.id=id;
        this.hour=hour;
        this.temperature=temperature;
        this.wind=wind;
        this.humidity=humidity;
    }

    public Integer getId() {
        return id;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getWind() {
        return wind;
    }

    public Integer getHumidity() {
        return humidity;
    }
}
