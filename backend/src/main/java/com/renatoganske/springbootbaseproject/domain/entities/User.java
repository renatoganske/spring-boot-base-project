package com.renatoganske.springbootbaseproject.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
