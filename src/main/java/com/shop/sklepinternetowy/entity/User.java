package com.shop.sklepinternetowy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String name;
    private String password;
    private int wallet = 0;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
