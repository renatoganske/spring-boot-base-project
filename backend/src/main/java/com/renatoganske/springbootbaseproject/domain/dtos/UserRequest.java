package com.renatoganske.springbootbaseproject.domain.dtos;

import com.renatoganske.springbootbaseproject.domain.entities.Authentication;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class UserRequest {

    private Long personId;
    @NotEmpty(message = "required.name.validation")
    @Size(min = 3, max = 45, message = "user.size.validation")
    private String name;

    @NotEmpty(message = "required.lastname.validation")
    @Length(min = 3, max = 45, message = "user.size.validation")
    private String lastname;

    @NotEmpty(message = "required.email.validation")
    @Length(min = 3, max = 45)
    @Email(regexp = ".+[@].+[\\.].+", message = "{user.size.validation}")
    private String email;

    @NotEmpty(message = "required.phone.validation")
    @Length(min = 3, max = 14, message = "user.size.validation")
    private String phone;

    @NotNull(message = "required.birth_date.validation")
    private LocalDate birthDate;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$", message = "{password.rule}")
    @Length(min = 6, max = 50, message = "{size.validation}")
    private String password;

    private Boolean status;

    private Authentication auth;
}
