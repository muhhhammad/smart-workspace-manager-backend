package com.fs.swm.entity;

import com.fs.swm.enums.AssetStatus;
import com.fs.swm.enums.AssetType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "assets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Asset extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private AssetType type;

    @Column(unique = true)
    private String serialNumber;

    @Column(name = "asset_name")
    private String name;

    @Enumerated(EnumType.STRING)
    private AssetStatus status = AssetStatus.AVAILABLE;

    @ManyToOne
    @JoinColumn(name = "assigned_to_user_id")
    private User assignedTo;

    @Column(name = "location")
    private String location; // floor

    @Column(name = "notes")
    private String notes;
}
