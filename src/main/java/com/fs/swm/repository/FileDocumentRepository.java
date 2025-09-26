package com.fs.swm.repository;

import com.fs.swm.entity.FileDocuement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDocumentRepository extends JpaRepository<FileDocuement, Long> {
}
