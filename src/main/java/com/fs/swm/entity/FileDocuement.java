package com.fs.swm.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.time.Instant;

@Entity
@Table(name = "file_docuement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileDocuement extends BaseEntity{

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "url")
    private String url;

    @Column(name = "size_bytes")
    private Long sizeBytes;

    @Column(name = "content_type")
    private String contentType;

    @ManyToOne
    @JoinColumn(name = "uploaded_by_user")
    private User uploadedBy;

    private Instant uploadedAt;
}


