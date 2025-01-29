package com.example.demo.repository;

import com.example.demo.entities.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepository extends JpaRepository<Rapport, String> {
}
