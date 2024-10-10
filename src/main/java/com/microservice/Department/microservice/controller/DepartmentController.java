package com.microservice.Department.microservice.controller;

import com.microservice.Department.microservice.entity.Department;
import com.microservice.Department.microservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside the method of save-department of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside the method of get-the-department-By-Id ");
        return departmentService.getDepartmentById(departmentId);
    }
}
