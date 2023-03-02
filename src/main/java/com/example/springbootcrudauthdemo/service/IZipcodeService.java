package com.example.springbootcrudauthdemo.service;

import com.example.springbootcrudauthdemo.dto.requestDto.ZipcodeRequestDto;
import com.example.springbootcrudauthdemo.model.Zipcode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IZipcodeService {
    public Zipcode addZipcode(ZipcodeRequestDto zipcodeRequestDto);
    public List<Zipcode> getZipcodes();
    public Zipcode getZipcode(Long zipcodeId);
    public Zipcode deleteZipcode(Long zipcodeId);
    public Zipcode editZipcode(Long zipcodeId, ZipcodeRequestDto zipcodeRequestDto);
    public Zipcode addCityToZipcode(Long zipcodeId, Long cityId);
    public Zipcode removeCityFromZipcode(Long zipcodeId);
}
