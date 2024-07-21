package com.tictactoeapi.tictactoe.Services;

import com.tictactoeapi.tictactoe.db_classes.User;
import com.tictactoeapi.tictactoe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Used to create queries
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> getAllUsers() {
        System.out.println(userRepository.findAll().toString());
        return userRepository.findAll();
    }

    public Optional<User> getUserByUsername(String username) {
        System.out.println("getUserByUsername()");
        System.out.println(userRepository.findUserByUsername(username).toString());
        return userRepository.findUserByUsername(username);
    }

    public User createUser(User user) {

        return userRepository.insert(user);
    }
}