package com.cjc.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repositiory.EmployeeRepository;
import com.cjc.service.EmployeeService;
@Service
public class ServiceImplimentation implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
		Employee saveemployee = employeeRepository.save(emp);
		return saveemployee;
	}

	@Override
	public Employee getEmployee(int id) {
	 Employee byidemployee = employeeRepository.findById(id).get();
		return byidemployee;
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRepository.findAll();
	}

}
