package com.spring_Boot_test.spring.boot.test.app.controller;

import com.spring_Boot_test.spring.boot.test.app.dto.UserDto;
import com.spring_Boot_test.spring.boot.test.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.security.pkcs11.wrapper.Constants;

import java.util.List;

@RequestMapping("/User")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
    @RequestMapping(Constants.GET_ALL_USERS)
    public List< UserDto > getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
