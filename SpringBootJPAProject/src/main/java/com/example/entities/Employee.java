package com.example.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private long id;
	public Employee() {
		super();
		
	}
	private String employeename;
	private String designation;
	public Employee(long id, String employeename, String designation) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeename=" + employeename + ", designation=" + designation + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}