package springrest.demo.dao;

import java.util.List;

import springrest.demo.entities.Employee;

public interface IEmployeeDao {
	List<Employee> getAllEmp();
	Employee getEmpById(int id);
}
