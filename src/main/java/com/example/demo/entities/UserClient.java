package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserClient {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int userId;

    @Column(name = "last_name")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name = "first_name")
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("income")
    private Double income;
    @JsonProperty("accountCreation")
    @Column(name = "account_creation")
    private Date accountCreation;
    @OneToMany(mappedBy = "userClient")
    private List<Cost> costs;

    @OneToMany(mappedBy = "userClient")
    private List<Category> categories;

    @OneToMany(mappedBy = "userClient")
    private List<Notification> notifications;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Date getAccountCreation() {
        return accountCreation;
    }

    public void setAccountCreation(Date accountCreation) {
        this.accountCreation = accountCreation;
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
