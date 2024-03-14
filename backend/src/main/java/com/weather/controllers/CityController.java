package com.weather.controllers;

import com.weather.models.City;
import com.weather.services.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    private CityService cityService;
    public CityController(CityService service){
        cityService=service;

    }
    @GetMapping("/getCities")
    public List<City> getCities(){
        List<City> result = cityService.getCities();
        return result;



    }
}
