package com.microserviceslearning.department_service.controller;


import com.microserviceslearning.department_service.entity.Department;
import com.microserviceslearning.department_service.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        return service.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id){
        return service.getDepartmentById(id);
    }

}
