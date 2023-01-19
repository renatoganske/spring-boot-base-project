package com.renatoganske.springbootbaseproject.domain.mapper;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelResponse;
import com.renatoganske.springbootbaseproject.domain.entities.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapperResponse {

    UserModelResponse convert(User user);

    User convert(UserModelResponse userModelResponse);

    List<UserModelResponse> map(List<User> user);
}
