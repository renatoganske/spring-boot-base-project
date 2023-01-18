package com.renatoganske.springbootbaseproject.domain.mapper;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelRequest;
import com.renatoganske.springbootbaseproject.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapperRequest {
//    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastname", source = "lastname")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "birthDate", source = "birthDate")
    @Mapping(target = "authentication.status", source = "status")
    @Mapping(target = "authentication.password", source = "password")
//    @Mapping(target = "authentication.user",
//            expression = "java(userModelRequest.getUserId())")
    User convert(UserModelRequest userModelRequest);

}
