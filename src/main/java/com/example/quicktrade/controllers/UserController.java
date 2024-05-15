package com.example.quicktrade.controllers;


import com.example.quicktrade.entity.User;
import com.example.quicktrade.errors.UserAlreadyExistsException;
import com.example.quicktrade.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    /* if @service is not used in import com.example.quicktrade.Service.UserServiceimpl we get "Could not autowire. No beans of 'UserService' type found."*/
    private UserService userService;
    private final Logger LOGGER =
            LoggerFactory.getLogger(UserController.class);

    @PostMapping("/v1/users")
    public User saveDepartment(@RequestBody User user) throws UserAlreadyExistsException {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return userService.registerUser(user);
    }
}
