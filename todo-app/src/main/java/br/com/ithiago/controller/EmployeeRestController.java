package br.com.ithiago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ithiago.model.Employee;
import br.com.ithiago.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path="/employee", method=RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeService.findAll();
	}
	
	@RequestMapping(path="/employee/{name}", method=RequestMethod.GET)
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		List<Employee> employees = employeeService.findAll();
		
		for (Employee employee : employees) {
			if (employee.getName().equals(name)) {
				return employee;
			}
		}
		
		return null;
	}
	
}
