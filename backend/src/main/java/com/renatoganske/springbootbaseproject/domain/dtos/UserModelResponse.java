package com.renatoganske.springbootbaseproject.domain.dtos;

import com.renatoganske.springbootbaseproject.domain.entities.User;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModelResponse {

    private Long userId;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private boolean status;

    public UserModelResponse(User personEntity) {
        this.userId = personEntity.getUserId();
        this.name = personEntity.getName();
        this.lastname = personEntity.getLastname();
        this.email = personEntity.getEmail();
        this.phone = personEntity.getPhone();
        this.birthDate = personEntity.getBirthDate();
        this.status = personEntity.getAuthentication().getStatus();
    }
}
