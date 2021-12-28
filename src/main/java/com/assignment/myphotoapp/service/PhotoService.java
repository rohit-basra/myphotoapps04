package com.assignment.myphotoapp.service;

import com.assignment.myphotoapp.model.Photo;
import com.assignment.myphotoapp.repository.PhotoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRespository photoRespository;

    public Photo savePhoto(Photo photo) {
        return photoRespository.save(photo);
    }

    public List<Photo> getAllPhotos() {
        return photoRespository.findAll();
    }

    public Photo updatePhoto(Photo photo) {
        return photoRespository.save(photo);
    }

    public void deletePhoto(String photoId) {
        photoRespository.deleteById(photoId);
    }

    public List<Photo> getById(String phototId) {
        return photoRespository.findAllById(phototId);
    }
}
