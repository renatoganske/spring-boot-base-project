package com.renatoganske.springbootbaseproject.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "Users")
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

        @NotEmpty
        @Column(length = 255, nullable = false)
        private String password;

        @Column(nullable = false)
        private Boolean status;

        public Long getUserId() {
                return userId;
        }

        public void setUserId(Long userId) {
                this.userId = userId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getLastname() {
                return lastname;
        }

        public void setLastname(String lastname) {
                this.lastname = lastname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public LocalDate getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
                this.birthDate = birthDate;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public Boolean getStatus() {
                return status;
        }

        public void setStatus(Boolean status) {
                this.status = status;
        }
}
