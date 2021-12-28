package com.assignment.myphotoapp.repository;

import com.assignment.myphotoapp.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {
    List<Album> findAllById(String id);
}
