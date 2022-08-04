package com.springMongo2.SpringMongo2.Controller;

import Modal.Employee;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private EmployeeRepository employeerepository;

    @PostMapping("/addemployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeerepository.save(employee);
        return "employee added";
    }

    @GetMapping("/findallemployee")
    public List<Employee> getEmployee(){
        return employeerepository.findAll();
    }

    @GetMapping("/findallEmployee/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return employeerepository.findById(id);
    }
}
