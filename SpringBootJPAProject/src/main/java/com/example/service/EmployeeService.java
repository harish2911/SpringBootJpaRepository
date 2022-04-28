package com.example.service;

import java.util.List;

import com.example.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public Employee getEmployeeById(long employeeid);
	//public Employee addEmployee(Employee employee);
	public Employee addEmployee(Employee employee);
	public void deleteEmployee(long employeeid);
	public Employee updateEmployee(Employee employee);
}