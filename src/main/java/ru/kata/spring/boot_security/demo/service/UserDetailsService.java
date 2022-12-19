package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserDetailsService extends org.springframework.security.core.userdetails.UserDetailsService {
    org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
