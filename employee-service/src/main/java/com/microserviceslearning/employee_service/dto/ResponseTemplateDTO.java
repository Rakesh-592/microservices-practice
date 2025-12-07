package com.microserviceslearning.employee_service.dto;

import com.microserviceslearning.employee_service.entity.Employee;

public class ResponseTemplateDTO {

    private Employee employee;
    private Department department;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
