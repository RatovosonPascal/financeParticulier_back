package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Cost {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private String costId;
    private Double amount;
    private CategoryEnum category;
    private Date date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_client_id")
    private UserClient userClient;

}
