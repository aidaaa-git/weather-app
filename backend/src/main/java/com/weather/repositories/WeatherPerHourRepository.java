package com.weather.repositories;

import com.weather.models.City;
import com.weather.models.Weather;
import com.weather.models.WeatherPerHour;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WeatherPerHourRepository {
    private JdbcTemplate jdbcTemplate;
    public WeatherPerHourRepository (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<WeatherPerHour> getWeatherPerHourForCityAndDate(Integer cityId){
        List<WeatherPerHour> weathersPerHour = new ArrayList<>(

                jdbcTemplate.query("SELECT id, HOUR(dayTime) as hour, humidity, wind, temperature" +
                        " FROM weatherPerHour WHERE cityId=" + cityId.toString() + " AND date(dayTime)= date(current_timestamp)" , (rs, rowNum) -> {
                    return new WeatherPerHour(rs.getInt("id"), rs.getInt("hour"), rs.getInt("temperature"), rs.getInt("wind"), rs.getInt("humidity"));
                }));
        return weathersPerHour;
    }
    public Weather getWeatherForCity(Integer cityId){
        Weather currentWeather = jdbcTemplate.queryForObject("SELECT humidity, wind, temperature \n" +
                " FROM weatherPerHour wph \n" +
                " WHERE YEAR(dayTime)=YEAR(CURRENT_TIMESTAMP) AND MONTH(dayTime)=MONTH(CURRENT_TIMESTAMP) \n" +
                " AND DAY(dayTime)=DAY(CURRENT_TIMESTAMP)AND HOUR(dayTime)=HOUR(CURRENT_TIMESTAMP) AND cityId=" + cityId,
                (rs, rowNum) -> {return new Weather(rs.getInt("temperature"), null, null, rs.getInt("wind"), rs.getInt("humidity"), null);});
        return currentWeather;
    }
    public Integer getMaxTemp(Integer cityId){
        Integer maxTemp = jdbcTemplate.queryForObject("SELECT max(temperature) as max_temp FROM  weatherPerHour WHERE cityId="+ cityId + " AND date(dayTime)=DATE(CURRENT_TIMESTAMP)",
                (rs, rowNum) ->{return new Integer(rs.getInt("max_temp"));});
        return maxTemp;
    }
    public Integer getMinTemp(Integer cityId) {
        Integer minTemp = jdbcTemplate.queryForObject("SELECT min(temperature) as min_temp FROM  weatherPerHour WHERE cityId=" + cityId + " AND date(dayTime)=DATE(CURRENT_TIMESTAMP)",
                (rs, rowNum) -> {
                    return new Integer(rs.getInt("min_temp"));
                });
        return minTemp;
    }
}
