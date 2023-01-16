package com.renatoganske.springbootbaseproject.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Table(name = "Authentications")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
