package com.renatoganske.springbootbaseproject.config.seeders;

import com.renatoganske.springbootbaseproject.domain.entities.User;
import com.renatoganske.springbootbaseproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserSeeder implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        databaseSeederUser();
    }

    private void databaseSeederUser() {
        if (userRepository.count() == 0) {
            User seeder = new User();
            seeder.setUserId(1L);
            seeder.setName("Admin");
            seeder.setLastname("User");
            seeder.setEmail("admin@admin.com");
            seeder.setPhone("(47)99999-9999");
            seeder.setBirthDate(LocalDate.now());
            //senha temporária
            seeder.setPassword("admin123");
            seeder.setStatus(true);
            userRepository.save(seeder);
        }
    }
}
