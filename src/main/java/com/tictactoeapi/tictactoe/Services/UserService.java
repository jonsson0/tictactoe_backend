package com.tictactoeapi.tictactoe.Services;

import com.tictactoeapi.tictactoe.db_classes.User;
import com.tictactoeapi.tictactoe.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers() {
        System.out.println(userRepository.findAll().toString());
        return userRepository.findAll();
    }

    public Optional<User> singleUser(int userId) {
        System.out.println(userRepository.findUserByUserId(userId).toString());
        return userRepository.findUserByUserId(userId);
    }
}
