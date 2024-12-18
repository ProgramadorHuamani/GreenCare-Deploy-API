package com.example.agricorp.users.domain.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("admin".equals(username)) {
            return org.springframework.security.core.userdetails.User
                    .withUsername("admin")
                    .password("{noop}password")
                    .roles("USER")
                    .build();
        }
        throw new UsernameNotFoundException("Usuario no encontrado: " + username);
    }
}
