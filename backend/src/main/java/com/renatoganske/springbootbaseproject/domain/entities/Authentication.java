//package com.renatoganske.springbootbaseproject.domain.entities;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotEmpty;
//
//@Entity
//@Table(name = "Authentications")
//public class Authentication {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idAuth;
//
//
//
//
//    @OneToOne(mappedBy = "authentication")
//    private User user;
//
//    public Authentication() {
//    }
//
//    public Authentication(String password, Boolean status, User user) {
//        this.password = password;
//        this.status = status;
//        this.user = user;
//    }
//
//    public Long getIdAuth() {
//        return idAuth;
//    }
//
//    public void setIdAuth(Long idAuth) {
//        this.idAuth = idAuth;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Boolean getStatus() {
//        return status;
//    }
//
//    public void setStatus(Boolean status) {
//        this.status = status;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
