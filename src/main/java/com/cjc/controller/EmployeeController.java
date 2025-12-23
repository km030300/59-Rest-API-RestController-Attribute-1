package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
     private EmployeeService employeeservice;
	
	
	
  @PostMapping(value = "/addemp", produces = {"application/xml", "application/json"},
		  consumes = {"application/xml","application/json"})
  public Employee addemployee(@RequestBody Employee emp) {
	  Employee saveEmployee = employeeservice.saveEmployee(emp);
	  return saveEmployee;
	  
  }
  
  
  @GetMapping(value = "/getemp/{id}", produces = {"application/xml", "application/json"},
		  consumes = {"application/xml", "application/json"})
  public Employee getemployee(@PathVariable int id) {
	  
	  Employee getidemp= employeeservice.getEmployee(id);
	  return getidemp;
  }
  
  @GetMapping(value = "/getall", produces = {"application/xml", "application/json"},
		  consumes = {"application/xml", "application/json"})
  public List<Employee> liemp(){
	  
	List<Employee> liemp =employeeservice.getAllEmployee();
	return liemp;
  }



}
