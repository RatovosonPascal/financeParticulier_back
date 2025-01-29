package com.example.demo.services;

import com.example.demo.entities.UserClient;
import org.apache.catalina.User;

import java.util.List;
import java.util.UUID;


public interface UserService {
    public UserClient saveUserClient(UserClient userClient);
    public UserClient getUserClient(int id);
    public void deleteUser(int id);
    public UserClient updateUserClient(int id,UserClient userClient);
    public List<UserClient> getAllUsers();



}
