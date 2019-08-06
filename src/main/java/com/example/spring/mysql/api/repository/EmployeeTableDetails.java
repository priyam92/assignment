package com.example.spring.mysql.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.mysql.api.domain.Employee;

@Repository
public interface EmployeeTableDetails extends JpaRepository<Employee, Integer> {

}