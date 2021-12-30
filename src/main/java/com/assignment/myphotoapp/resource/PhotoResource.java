package com.assignment.myphotoapp.resource;

import com.assignment.myphotoapp.model.Photo;
import com.assignment.myphotoapp.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo savePhoto(@RequestBody @Valid Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping("/findPhoto")
    public List<Photo> getById(@RequestParam(name="photoId") String phototId){
        return photoService.getById(phototId);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody @Valid Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name="photoId") String photoId){
        photoService.deletePhoto(photoId);
    }

}
