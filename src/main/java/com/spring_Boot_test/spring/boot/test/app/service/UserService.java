package com.spring_Boot_test.spring.boot.test.app.service;

import com.spring_Boot_test.spring.boot.test.app.converter.UserConverter;
import com.spring_Boot_test.spring.boot.test.app.dto.UserDto;
import com.spring_Boot_test.spring.boot.test.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List< UserDto > getAllUsers();
}

