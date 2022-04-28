package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{



}