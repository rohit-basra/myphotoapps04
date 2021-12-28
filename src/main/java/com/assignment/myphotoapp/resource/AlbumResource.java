package com.assignment.myphotoapp.resource;

import com.assignment.myphotoapp.model.Album;
import com.assignment.myphotoapp.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping
    public List<Album>getAllAlbums(){
        return albumService.getAllAlbum();
    }

    @GetMapping("/findAlbum")
    public List<Album> getById(@RequestParam (name="albumId") String albumId){
        return albumService.getById(albumId);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name="albumId") String albumId){
        albumService.deleteAlbum(albumId);
    }

}
