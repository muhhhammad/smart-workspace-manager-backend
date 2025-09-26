package com.fs.swm.repository;

import com.fs.swm.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department  findByDepartmentId(Long id);

}
