package com.fs.swm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLogs extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "action")
    private String action;

    @Column(name = "target_entity")
    private String targetEntity; // Asset or Booking

    @Column(name = "target_id")
    private Long targetId;

    @Column(name = "details")
    private String details;

    private Instant at;

}
