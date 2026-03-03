package com.deploy.praktikum1.services;

import com.deploy.praktikum1.model.dto.UserAddRequest;
import com.deploy.praktikum1.model.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto create(UserAddRequest request);

    List<UserDto> findAll();

    UserDto findById(Long id);

    void delete(Long id);
}