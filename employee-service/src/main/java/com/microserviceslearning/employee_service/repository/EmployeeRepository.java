package com.microserviceslearning.employee_service.repository;

import com.microserviceslearning.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
