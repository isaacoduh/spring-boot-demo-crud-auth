package com.example.springbootcrudauthdemo.repository;

import com.example.springbootcrudauthdemo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
