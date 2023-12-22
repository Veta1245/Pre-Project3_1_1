package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "first_name_user")
    private String firstName;

    @Column(name = "last_name_user")
    private String lastName;

    @Column(name = "email_user")
    private String emailUser;

    public User() {
    }

    public User(Long userId, String firstName, String lastName, String emailUser) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailUser = emailUser;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailUser=" + emailUser +
                '}';
    }

}
