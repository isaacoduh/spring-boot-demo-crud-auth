package com.example.springbootcrudauthdemo.service;

import com.example.springbootcrudauthdemo.model.User;

import java.util.List;

public interface IUserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);

}
