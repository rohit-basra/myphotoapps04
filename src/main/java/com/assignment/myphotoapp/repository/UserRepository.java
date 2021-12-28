package com.assignment.myphotoapp.repository;

import com.assignment.myphotoapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository <User, String >{
    List<User> findAllById(String id);
}
