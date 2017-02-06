package br.com.ithiago.service;

import java.util.List;

import br.com.ithiago.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	void add(Employee employee);
}
