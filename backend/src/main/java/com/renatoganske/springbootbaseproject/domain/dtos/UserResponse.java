package com.renatoganske.springbootbaseproject.domain.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserResponse {

    private Long personId;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Boolean status;
}
