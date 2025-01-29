package com.example.demo.servicesImpl;


import com.example.demo.entities.UserClient;
import com.example.demo.repository.CostRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CostRepository costRepository;
    @Override
    public UserClient saveUserClient(UserClient user) {
        return userRepository.save(user);
    }
    @Override
    public UserClient getUserClient(int id) {
        return  userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'ID : " + id));
    }

    @Override
    public void deleteUser(int id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("Utilisateur non trouvé avec l'ID : " + id);
        }
        userRepository.deleteById(id);

    }

    @Override
    public UserClient updateUserClient(int id,UserClient userClient) {
        return userRepository.findById(id).map(existingUser -> {
            userClient.setUserId(id);
            return userRepository.save(userClient);
        }).orElseThrow(() -> new EntityNotFoundException("User with ID " + id + " not found"));

    }

    @Override
    public List<UserClient> getAllUsers() {
        return userRepository.findAll();
    }


}

