package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService employeeService;

 @RequestMapping("/home")
public String home() {
return "This is home page for testing";
}
@GetMapping("/employee")
public List<Employee> getEmployees() {
return this.employeeService.getEmployees();
}
@GetMapping("/employee/{employeeid}")
public Employee getEmployeeById(@PathVariable long employeeid) {
return this.employeeService.getEmployeeById(employeeid);
}
@PostMapping("/employee")
public Employee addEmployee(@RequestBody Employee employee)
{
	return this.employeeService.addEmployee(employee);
}
@DeleteMapping("/employee/{employeeid}")
public void deleteEmployee(@PathVariable long employeeid)
{
	this.employeeService.deleteEmployee(employeeid);
}
@PutMapping("/employee")

public Employee updateEmployee(@RequestBody Employee employee)
{
	return this.employeeService.updateEmployee(employee);
}

}