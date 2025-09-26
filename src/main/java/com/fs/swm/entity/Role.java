package com.fs.swm.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.EnumMap;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role extends BaseEntity{

    @Column(name = "name",unique = true, nullable = false)
    private String name;

    private String permissions;

}
