package com.example.demo.services;

import com.example.demo.entities.UserClient;
import com.example.demo.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.UUID;


public interface UserService {
    public UserClient saveUserClient(UserClient userClient);
    public UserClient getUserClient(int id);
    public void deleteUser(int id);
    public UserClient updateUserClient(int id,UserClient userClient);
    public List<UserClient> getAllUsers();
    public void registerUser(UserClient user) ;

}
