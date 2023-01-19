package com.renatoganske.springbootbaseproject.service;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelRequest;
import com.renatoganske.springbootbaseproject.domain.dtos.UserModelResponse;
import com.renatoganske.springbootbaseproject.domain.entities.User;
import com.renatoganske.springbootbaseproject.domain.mapper.UserMapperRequest;
import com.renatoganske.springbootbaseproject.domain.mapper.UserMapperResponse;
import com.renatoganske.springbootbaseproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapperResponse userMapperResponse;

    @Autowired
    private UserMapperRequest userMapperRequest;


    public ResponseEntity<List<UserModelResponse>> findAll() {
        var roleEntity = userRepository.findAll()
                .stream()
                .map(user -> userMapperResponse.convert(user));
        return ResponseEntity.ok().body(roleEntity.collect(Collectors.toList()));
    }

    public ResponseEntity<UserModelResponse> findById(Long id) {
        var userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(userMapperResponse.convert(userOptional.get()));
    }

    public UserModelResponse save(@RequestBody UserModelRequest userModelRequest) {
        User user = userMapperRequest.convert(userModelRequest);
        userRepository.save(user);
        return userMapperResponse.convert(user);
    }
}
