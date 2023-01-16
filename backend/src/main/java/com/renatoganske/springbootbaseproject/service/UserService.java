package com.renatoganske.springbootbaseproject.service;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelResponse;
import com.renatoganske.springbootbaseproject.domain.entities.User;
import com.renatoganske.springbootbaseproject.domain.mapper.UserMapper;
import com.renatoganske.springbootbaseproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public ResponseEntity<List<UserModelResponse>> getAll() {
        var roleEntity = userRepository.findAll()
                .stream()
                .map(user -> userMapper.convert(user));
        return ResponseEntity.ok().body(roleEntity.collect(Collectors.toList()));
    }

    public ResponseEntity<UserModelResponse> findById(Long id) {

        var userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(userMapper.convert(userOptional.get()));
    }

    public User execute(User user) throws Exception {
        return userRepository.save(user);
    }
}
