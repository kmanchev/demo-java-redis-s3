package com.kmanchev.caching.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String name;
    private String lastname;
    private String email;

    // Constructors, Getters, and Setters
    public User() {
    }

    public User(String nickname, String name, String lastname, String email) {
        this.nickname = nickname;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    // Getters and setters
}
