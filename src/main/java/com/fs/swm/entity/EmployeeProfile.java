package com.fs.swm.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "employee_profile")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeProfile extends BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

//    @Column(name = "avatar_url")
//    private String avatarUrl;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}