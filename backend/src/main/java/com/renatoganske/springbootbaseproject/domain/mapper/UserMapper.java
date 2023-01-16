package com.renatoganske.springbootbaseproject.domain.mapper;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelRequest;
import com.renatoganske.springbootbaseproject.domain.dtos.UserModelResponse;
import com.renatoganske.springbootbaseproject.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastname", source = "lastname")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "birthDate", source = "birthDate")
    @Mapping(target = "status", source = "authentication.status")
    UserModelResponse convert(User user);

    User convert(UserModelResponse userModelResponse);

    User convert(UserModelRequest userModelRequest);

    List<UserModelResponse> map(List<User> user);
}
