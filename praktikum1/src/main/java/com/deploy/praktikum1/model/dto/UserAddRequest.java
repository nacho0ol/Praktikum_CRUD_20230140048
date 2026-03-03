package com.deploy.praktikum1.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserAddRequest {
    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;
}
