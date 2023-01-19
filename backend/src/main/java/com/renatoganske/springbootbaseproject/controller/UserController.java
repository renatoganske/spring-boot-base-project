package com.renatoganske.springbootbaseproject.controller;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelRequest;
import com.renatoganske.springbootbaseproject.domain.dtos.UserModelResponse;
import com.renatoganske.springbootbaseproject.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@ControllerAdvice
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserModelResponse>> get() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModelResponse> getUserById(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserModelResponse> saveUser(@Valid @RequestBody UserModelRequest userModelRequest) {
        var newUser = userService.save(userModelRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }



}
