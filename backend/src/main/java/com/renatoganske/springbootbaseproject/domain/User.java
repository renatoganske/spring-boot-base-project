package com.renatoganske.springbootbaseproject.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "userId", nullable = false)
        private Long userId;

        @Column(nullable = false, length = 45)
        @NotEmpty
        private String name;

        @Column(nullable = false, length = 45)
        @NotEmpty
        private String lastname;

        @Column(nullable = false, unique = true, length = 45)
        @NotEmpty
        private String email;

        @Column(nullable = false, length = 14)
        @NotEmpty
        private String phone;

        @Column(nullable = false)
        @NotNull
        private LocalDate birthDate;

        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
        private Authentication authentication;
}
