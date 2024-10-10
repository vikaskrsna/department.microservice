package com.microservice.Department.microservice.service;

import com.microservice.Department.microservice.entity.Department;
import com.microservice.Department.microservice.repositroy.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService  {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside the method of save-department of department-service");
            return  departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("Inside the method of get-the-department-By-Id of department-service");
        return departmentRepository.findById(departmentId).get();
    }
}
