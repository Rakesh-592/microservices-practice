package com.microserviceslearning.department_service.service;


import com.microserviceslearning.department_service.entity.Department;
import com.microserviceslearning.department_service.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository){
        this.repository = repository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);

    }

    @Override
    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id){
        return repository.findById(id).orElse(null);
    }
}
