package com.javaRestApi.javaRest.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;

    @Column
    public String name;

    @Column
    public String password;

    @Column
    public Date created_at;

    @Column
    public Date updated_at;

    public Admin() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
