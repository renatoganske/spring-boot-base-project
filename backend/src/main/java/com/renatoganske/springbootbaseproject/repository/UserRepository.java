package com.renatoganske.springbootbaseproject.repository;

import com.renatoganske.springbootbaseproject.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
