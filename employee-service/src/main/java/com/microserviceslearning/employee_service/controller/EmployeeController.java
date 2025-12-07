package com.microserviceslearning.employee_service.controller;

import com.microserviceslearning.employee_service.dto.ResponseTemplateDTO;
import com.microserviceslearning.employee_service.entity.Employee;
import com.microserviceslearning.employee_service.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){

        return service.saveEmployee(employee);

    }

    @GetMapping()
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    //read by id
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return service.getEmployeesById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
         service.deleteEmployee(id);
         return "Employee deleted Successfully";
    }

    @GetMapping("/with-dept/{id}")
    public ResponseTemplateDTO getEmployeeWithDepartment(@PathVariable Long id) {
        return service.getEmployeewithDepartment(id);
    }

}
