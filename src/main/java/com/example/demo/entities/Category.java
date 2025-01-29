package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String categoryId;
    private CategoryEnum categoryName;

    private String userId;
    @ManyToOne
    @JoinColumn(name = "user_client_id")
    private  UserClient userClient;


}
