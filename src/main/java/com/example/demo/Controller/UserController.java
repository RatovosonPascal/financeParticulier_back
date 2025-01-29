package com.example.demo.Controller;

import com.example.demo.entities.UserClient;
import com.example.demo.servicesImpl.UserSeviceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    private UserSeviceImpl userSeviceImpl;

    @GetMapping("/getAllUser")
    public List<UserClient> getAllUser() {
        return userSeviceImpl.getAllUsers();
    }

    @GetMapping("/getUser{id}")
    public UserClient getUser(@PathParam("id") int id) {
        return userSeviceImpl.getUserClient(id);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<UserClient> saveUser(@RequestBody UserClient user) {
        try {
            UserClient savedUser = userSeviceImpl.saveUserClient(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<UserClient> updateUser(@PathVariable("id") int id, @RequestBody UserClient user) {


            UserClient updatedUser = userSeviceImpl.updateUserClient(id,user);

            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

}