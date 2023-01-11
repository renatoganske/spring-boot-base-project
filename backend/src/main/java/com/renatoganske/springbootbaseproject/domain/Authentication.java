package com.renatoganske.springbootbaseproject.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Authentications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuth;

    @NotEmpty
    @Column(length = 255, nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean status;

    @OneToOne
    @JoinColumn(name = "personId", nullable = false)
    private User user;
}
