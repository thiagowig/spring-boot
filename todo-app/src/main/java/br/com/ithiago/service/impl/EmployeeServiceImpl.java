package br.com.ithiago.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ithiago.model.Employee;
import br.com.ithiago.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final List<Employee> employees;
	
	static {
		employees = new ArrayList<Employee>();
		
		employees.add(createEmployee("Thiago", 10, "Software Engineer"));
		employees.add(createEmployee("Simone", 20, "Dentist"));
		employees.add(createEmployee("Tania", 30, "Journalist"));
	}

	@Override
	public List<Employee> findAll() {		
		return employees;
	}
	
	public void add(Employee employee) {
		employees.add(employee);
	}

	private static Employee createEmployee(String name, Integer age, String role) {
		Employee employee = new Employee();
		
		employee.setName(name);
		employee.setAge(age);
		employee.setRole(role);
		
		return employee;
	}
}
