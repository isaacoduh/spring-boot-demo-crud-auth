package com.example.springbootcrudauthdemo.repository;

import com.example.springbootcrudauthdemo.model.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
}
