package com.weather.repositories;

import com.weather.models.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepository {
    private JdbcTemplate jdbcTemplate;
    public CityRepository (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<City> getAllCities(){
        List<City> cities = new ArrayList<>(

        jdbcTemplate.query("SELECT id, name FROM cities", (rs, rowNum) -> {
            return new City(rs.getInt("id"), rs.getString("name"));
        }));




        return cities;
    }
}
