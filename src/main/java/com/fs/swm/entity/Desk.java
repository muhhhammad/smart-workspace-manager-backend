package com.fs.swm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "desks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Desk extends BaseEntity{

    @Column(name = "desk_code")
    private String code; // D-101

    @Column(name = "desk_location")
    private String location; // floor, zone

    private boolean hotDesk = true;

    @ManyToOne
    @JoinColumn(name = "assigned_to_user_id")
    private User assignedTo;

}
