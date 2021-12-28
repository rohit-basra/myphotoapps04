package com.assignment.myphotoapp.repository;

import com.assignment.myphotoapp.model.Album;
import com.assignment.myphotoapp.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

public interface PhotoRespository extends MongoRepository<Photo, String> {
    List<Photo> findAllById(String id);
}
