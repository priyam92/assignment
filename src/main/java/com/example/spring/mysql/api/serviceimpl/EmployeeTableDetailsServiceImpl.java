package com.example.spring.mysql.api.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.mysql.api.domain.Employee;
import com.example.spring.mysql.api.repository.EmployeeTableDetails;
import com.example.spring.mysql.api.service.EmployeeTableDetailsService;

@Service
public class EmployeeTableDetailsServiceImpl  implements EmployeeTableDetailsService {
	
	@Autowired
	EmployeeTableDetails EmployeeTableDetails; 
	
	@Override
	public List<Employee> getEmployeeDetailsInfo() {
		
		return  EmployeeTableDetails.findAll();
	}

	@Override
	public Employee addemp(Employee e) {
		return EmployeeTableDetails.save(e);
		
	}
	
     @Override
public Employee updateEmp(Employee e) {
    return EmployeeTableDetails.saveAndFlush(e);
    }
     
     @Override
public void deleteEmp(int id) {
		 EmployeeTableDetails.deleteById(id);
	}
     
}	   

