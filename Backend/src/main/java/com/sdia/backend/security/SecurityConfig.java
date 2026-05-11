package com.sdia.backend.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@AllArgsConstructor
public class SecurityConfig {


    private PasswordEncoder passwordEncoder;



    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("amine").password(passwordEncoder.encode("1234")).roles("ADMIN").build(),
                User.withUsername("hassane").password(passwordEncoder.encode("1234")).roles("ADMIN", "USER").build()
        );
    }
}
