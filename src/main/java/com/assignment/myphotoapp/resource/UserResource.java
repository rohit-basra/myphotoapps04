package com.assignment.myphotoapp.resource;

import com.assignment.myphotoapp.model.User;
import com.assignment.myphotoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping//("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/findUser")
    public List<User> getById(@RequestParam(name="userId") String userId){
        return userService.getById(userId);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name="userId") String userId){
         userService.deleteUser(userId);
    }


}
