package com.microserviceslearning.department_service.service;

import com.microserviceslearning.department_service.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);
}
