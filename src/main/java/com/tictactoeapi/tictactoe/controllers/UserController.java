package com.tictactoeapi.tictactoe.controllers;

import com.tictactoeapi.tictactoe.Services.UserService;
import com.tictactoeapi.tictactoe.db_classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable String username) {
        return new ResponseEntity<Optional<User>>(userService.getUserByUsername(username), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody String bodyUsername) {

        Optional<User> newUser = userService.getUserByUsername(bodyUsername);

        // if user already exists in db
        if (newUser.isPresent()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            return new ResponseEntity<User>(userService.createUser(bodyUsername), HttpStatus.CREATED);
        }
    }
}