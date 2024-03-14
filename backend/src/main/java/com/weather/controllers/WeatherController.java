package com.weather.controllers;

import com.weather.models.City;
import com.weather.models.Weather;
import com.weather.models.WeatherPerHour;
import com.weather.services.CityService;
import com.weather.services.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController(WeatherService service) {
        weatherService = service;
    }


    @GetMapping("/getTodaysWeather")
    public Weather getTodaysWeather(){
        Weather result = weatherService.getTodaysWeather(1);
        return result;
} }
