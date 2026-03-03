package com.deploy.praktikum1.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserAddRequest {
    private String name;
    private int age;
}
