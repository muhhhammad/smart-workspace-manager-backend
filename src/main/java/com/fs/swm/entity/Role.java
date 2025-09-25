package com.fs.swm.entity;


import jakarta.persistence.*;

import java.util.EnumMap;

@Entity
@Table(name = "role")
public class Role extends BaseEntity{

    @Column(name = "role_name", unique = true, nullable = false)
    private String name;

    @Column(name = "permissions")
    private String permissions;

    public Role() {
    }

    public Role(String name, String permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}
