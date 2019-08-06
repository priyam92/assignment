package com.example.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mysql.api.domain.Employee;
import com.example.spring.mysql.api.serviceimpl.EmployeeTableDetailsServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	EmployeeTableDetailsServiceImpl EmpolyeeTableDetailsService;

	@GetMapping("/employeedetails")
	public List<Employee> getEmployeeDetails() {
		return EmpolyeeTableDetailsService.getEmployeeDetailsInfo();
	}
	@PostMapping("/empdetails")
		public Employee addemp( @RequestBody Employee e) {
		return EmpolyeeTableDetailsService.addemp(e);
	}

	@PutMapping("/empupdate")
	public Employee updateEmp(@RequestBody Employee e) {
		return EmpolyeeTableDetailsService.updateEmp(e);
	}
	
	@DeleteMapping("/empdelete/{id}")
	public void deleteEmp(@PathVariable("id")int id) {
		 EmpolyeeTableDetailsService.deleteEmp(id);
	}
}



