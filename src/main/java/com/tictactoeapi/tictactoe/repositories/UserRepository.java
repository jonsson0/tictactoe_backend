package com.tictactoeapi.tictactoe.repositories;

import com.tictactoeapi.tictactoe.db_classes.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {

    Optional<User> findUserByUsername(String username);
}
