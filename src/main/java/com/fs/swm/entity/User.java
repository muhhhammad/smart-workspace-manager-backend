package com.fs.swm.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user")
public class User{

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

//    @Column(name = "role")
    @ManyToOne(
        fetch = FetchType.LAZY,
        optional = false,
        cascade = {CascadeType.ALL},
        targetEntity = Role.class
    )
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "enabled")
    private String enabled;

    @Column(name = "created_at")
    private Date createdAt;

    public User(){

    }

    public User(Long id, String username, String password, String enabled, Date createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
//        this.role = role;
        this.enabled = enabled;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getRole() {
//        return role;
//    }

//    public void setRole(String role) {
//        this.role = role;
//    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

