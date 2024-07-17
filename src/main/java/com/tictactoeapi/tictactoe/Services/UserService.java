package com.tictactoeapi.tictactoe.Services;

import com.tictactoeapi.tictactoe.db_classes.User;
import com.tictactoeapi.tictactoe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers() {
        System.out.println(userRepository.findAll().toString());
        return userRepository.findAll();
    }
}
