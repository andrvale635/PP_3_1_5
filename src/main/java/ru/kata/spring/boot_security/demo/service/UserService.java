package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    User showUserById(int id);

    User save(User user);

    User update(User updatedUser);

    void delete(int id);

    User showUserByName(String username);
}