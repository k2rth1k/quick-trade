package com.example.quicktrade.service;



import com.example.quicktrade.entity.User;
import com.example.quicktrade.errors.UserAlreadyExistsException;

import java.util.List;

public interface UserService {
    public User registerUser(User user) throws UserAlreadyExistsException;

    public List<User> getBatchUsers();

    public User getUserByEmail(String email);

    public void deleteUserByEmail(String email);

    public User updateUser(String email, User user);
}
