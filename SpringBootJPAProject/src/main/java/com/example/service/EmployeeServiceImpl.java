package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService { @Autowired
private EmployeeDAO employeeDao; @Override
public List<Employee> getEmployees() {
return employeeDao.findAll();
} @Override
public Employee getEmployeeById(long employeeid) {
return employeeDao.getOne(employeeid);
} @Override
public Employee addEmployee(Employee employee) {
employeeDao.save(employee);
return employee;
} @Override
public void deleteEmployee(long employeeid) {
Employee obj= employeeDao.getOne(employeeid);
employeeDao.delete(obj);
} @Override
public Employee updateEmployee(Employee employee) {
employeeDao.save(employee);
return employee;
}
}



/*import com.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
List<Employee>lst;

public EmployeeServiceImpl() {
	lst=new ArrayList<Employee>();
	lst.add(new Employee(1,"charani","software developer"));
	lst.add(new Employee(2,"Madhu","software developer"));
	lst.add(new Employee(3,"Bhargav","software developer"));
	lst.add(new Employee(4,"Harish","software developer"));
	
}
@Override
public List<Employee> getEmployees(){
	return lst;
	
}
@Override
public Employee getEmployeeById(long employeeid) {
Employee emp=null;

for(Employee e : lst) {
if(e.getId()==employeeid) {
emp=e;
break;
}

}
return emp;
}
public Employee addEmployee(Employee employee)
{
	lst.add(employee);
	return employee;
}
@Override
public void deleteEmployee(long employeeid)
{
	lst=this.lst.stream().filter((x)->x.getId()!=employeeid).collect(Collectors.toList());
	
}
@Override
public Employee updateEmployee(Employee employee)
{
	lst.forEach((t)->{
		if(t.getId()==employee.getId()) {
			t.setEmployeename(employee.getEmployeename());
			t.setDesignation(employee.getDesignation());
		}
		
	});
return null;
}
}*/

