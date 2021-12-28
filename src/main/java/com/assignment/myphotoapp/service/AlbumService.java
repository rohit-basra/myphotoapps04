package com.assignment.myphotoapp.service;

import com.assignment.myphotoapp.model.Album;
import com.assignment.myphotoapp.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);
    }

    public List<Album> getById(String albumId) {
        return albumRepository.findAllById(albumId);
    }
}
