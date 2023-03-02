package com.example.springbootcrudauthdemo.service;

import com.example.springbootcrudauthdemo.dto.requestDto.CityRequestDto;
import com.example.springbootcrudauthdemo.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICityService {
    public City addCity(CityRequestDto cityRequestDto);
    public List<City> getCities();
    public City getCity(Long cityId);
    public City deleteCity(Long cityId);
    public City editCity(Long cityId, CityRequestDto cityRequestDto);
}
