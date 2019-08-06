package com.example.spring.mysql.api.service;

import java.util.List;

import com.example.spring.mysql.api.domain.Employee;

public interface EmployeeTableDetailsService {
	
	 List<Employee> getEmployeeDetailsInfo() ;
	 Employee addemp(Employee e);
	 Employee updateEmp(Employee e);
	void deleteEmp(int id);
}
