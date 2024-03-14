package com.weather.models;

import java.util.List;

public class Weather {
    private Integer currentTemp;
    private Integer minTemp;
    private Integer maxTemp;
    private Integer currentWind;
    private Integer currentHumidity;
    private List<WeatherPerHour> weatherPerHours;
    
    public Weather(Integer currentTemp, Integer minTemp, Integer maxTemp, Integer currentWind, Integer currentHumidity, List<WeatherPerHour> weatherPerHours){
        this.currentHumidity=currentHumidity;
        this.currentTemp=currentTemp;
        this.maxTemp=maxTemp;
        this.currentWind=currentWind;
        this.minTemp=minTemp;
        this.weatherPerHours=weatherPerHours;
    }

    public Integer getCurrentHumidity() {
        return currentHumidity;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public Integer getCurrentWind() {
        return currentWind;
    }

    public Integer getMaxTemp() {
        return maxTemp;
    }

    public Integer getMinTemp() {
        return minTemp;
    }

    public List<WeatherPerHour> getWeatherPerHours() {
        return weatherPerHours;
    }
    public void setMaxTemp(Integer maxTemp){
        this.maxTemp = maxTemp;
    }
    public void setMinTemp(Integer minTemp){
        this.minTemp = minTemp;
    }
    public void setWeatherPerHours(List<WeatherPerHour> weatherPerHours){
        this.weatherPerHours = weatherPerHours;
    }
}
