package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private String id;
    private String message;
    private String userId;
    private String notificationType;
    private LocalDateTime notificationDate;
    @ManyToOne
    @JoinColumn(name = "user_client_id")
    private UserClient userClient;


}
