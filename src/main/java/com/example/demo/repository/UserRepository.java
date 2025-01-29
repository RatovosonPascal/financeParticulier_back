package com.example.demo.repository;
import com.example.demo.entities.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<UserClient, Integer> {
    Optional<UserClient> findByEmail(String email);
}
