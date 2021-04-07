package com.javaRestApi.javaRest.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private int password;

    @Column
    public Date created_at;

    @Column
    public Date updated_at;




    public User(String username, String email, int password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public int getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
