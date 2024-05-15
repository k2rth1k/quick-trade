package com.example.quicktrade.service;


import com.example.quicktrade.entity.User;
import com.example.quicktrade.errors.UserAlreadyExistsException;
import com.example.quicktrade.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepo;
    @Override
    public User registerUser(User user) throws UserAlreadyExistsException {
        Optional<User> record = userRepo.findById(user.getEmail());
        if(record.isPresent()){
            throw new UserAlreadyExistsException();
        }
        return userRepo.save(user);
    }

    @Override
    public List<User> getBatchUsers() {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public void deleteUserByEmail(String email) {

    }

    @Override
    public User updateUser(String email, User user) {
        return null;
    }
}
