package com.example.demo.repository;

import com.example.demo.entities.Cost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostRepository extends JpaRepository<Cost, String> {
}
