package com.weather.services;


import com.weather.models.City;
import com.weather.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private CityRepository cityRepository;
    public CityService(CityRepository repository){
        cityRepository = repository;
    }
  /*  public List<City> getCities() {
        List<City> cities = new ArrayList<>();
        City gornjiVakuf = new City(1, "Gornji Vakuf");
        City bugojno = new City(2, "Bugojno");
        cities.add(gornjiVakuf);
        cities.add(bugojno);
        return cities;
    }*/
    public List<City> getCities(){
        return cityRepository.getAllCities();
    }

}
