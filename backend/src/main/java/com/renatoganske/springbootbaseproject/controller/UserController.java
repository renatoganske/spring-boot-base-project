package com.renatoganske.springbootbaseproject.controller;

import com.renatoganske.springbootbaseproject.domain.dtos.UserModelResponse;
import com.renatoganske.springbootbaseproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModelResponse> getUserById(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity



}
