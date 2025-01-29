package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class Rapport {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private String rapportId;
    private String userId;
    private LocalDateTime  periode;
    private Double totalCost;
    private Double  totalSave;


}
