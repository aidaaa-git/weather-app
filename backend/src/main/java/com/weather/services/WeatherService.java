package com.weather.services;

import com.weather.models.City;
import com.weather.models.Weather;
import com.weather.models.WeatherPerHour;
import com.weather.repositories.WeatherPerHourRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    private WeatherPerHourRepository repository;
    public WeatherService(WeatherPerHourRepository repository){
        this.repository=repository;
    }
    public Weather getTodaysWeather(Integer cityId){
        Weather todaysWeather=repository.getWeatherForCity(cityId);
        todaysWeather.setMinTemp(repository.getMinTemp(cityId));
        todaysWeather.setMaxTemp(repository.getMaxTemp(cityId));
        todaysWeather.setWeatherPerHours(repository.getWeatherPerHourForCityAndDate(cityId));
        return todaysWeather;
    }


    }

