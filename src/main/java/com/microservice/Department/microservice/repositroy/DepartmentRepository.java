package com.microservice.Department.microservice.repositroy;

import com.microservice.Department.microservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
