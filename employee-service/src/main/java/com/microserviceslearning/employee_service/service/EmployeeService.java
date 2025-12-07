package com.microserviceslearning.employee_service.service;

import com.microserviceslearning.employee_service.dto.ResponseTemplateDTO;
import com.microserviceslearning.employee_service.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeesById(Long id);

    void deleteEmployee(Long id);

    ResponseTemplateDTO getEmployeewithDepartment(Long id);

}
