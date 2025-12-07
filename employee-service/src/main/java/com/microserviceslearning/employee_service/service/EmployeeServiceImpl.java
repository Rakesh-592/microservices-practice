package com.microserviceslearning.employee_service.service;


import com.microserviceslearning.employee_service.dto.Department;
import com.microserviceslearning.employee_service.dto.ResponseTemplateDTO;
import com.microserviceslearning.employee_service.entity.Employee;
import com.microserviceslearning.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeesById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployee(Long id){
        repository.deleteById(id);
    }

    @Override
    public ResponseTemplateDTO getEmployeewithDepartment(Long employeeId) {
        ResponseTemplateDTO dto = new ResponseTemplateDTO();

        Employee employee = repository.findById(employeeId).orElse(null);
        dto.setEmployee(employee);

        Department department = restTemplate.getForObject(
                "http://localhost:8081/departments/" + employee.getDepartmentId(),
                Department.class
        );

        dto.setDepartment(department);
        return dto;
    }

}
