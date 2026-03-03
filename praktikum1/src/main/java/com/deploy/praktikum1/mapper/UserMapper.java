package com.deploy.praktikum1.mapper;

import com.deploy.praktikum1.model.dto.UserDto;
import com.deploy.praktikum1.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
