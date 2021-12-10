package springrest.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springrest.demo.entities.Employee;
import springrest.demo.services.IEmployeeService;

@RestController
public class MyRestController {

	@Autowired
	IEmployeeService es;
	
	@GetMapping("/greet")
	List<Employee> greet()								//handler Method
	{
		return es.getAll();
	}
	@GetMapping("/greet/{eid}")
	Employee getById(@PathVariable("eid") int id)
	{
		return es.getEmpById(id);
	}

}
