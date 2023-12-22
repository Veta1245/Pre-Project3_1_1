package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserById(long id);

    void removeUser(long id);

    void updateUser(User user);
}
