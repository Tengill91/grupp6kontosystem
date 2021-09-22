package com.grupp6.grupp6kontosystem.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "users_tbl")
public class Customer {
    @Id @GeneratedValue
    private long id;
    @Column(unique = true)
    private String email;
    private String password;
    private String name;
    private String cover;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    public Customer() {}

    public Customer(String email, String password, String name, String cover){
        this.email = email;
        this.password = password;
        this.name = name;
        this.cover = cover;
    }
}

