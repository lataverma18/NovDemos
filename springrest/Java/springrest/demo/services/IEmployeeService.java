package springrest.demo.services;

import java.util.List;

import springrest.demo.entities.Employee;

public interface IEmployeeService {
	List<Employee> getAll();
	Employee getEmpById(int id);

}
