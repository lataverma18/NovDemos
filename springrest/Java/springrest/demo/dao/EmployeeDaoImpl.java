package springrest.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import springrest.demo.entities.Employee;

@Repository("ed")
public class EmployeeDaoImpl implements IEmployeeDao{
	List<Employee> list;
	
	public EmployeeDaoImpl()
	{
		list=new ArrayList<>();
		list.add(new Employee(101,"Ronit",45000));
		list.add(new Employee(102,"Rohit",42000));
		list.add(new Employee(103,"Rita",35000));
	}
	
	@Override
	public List<Employee> getAllEmp() {
		return list;
	}

	@Override
	public Employee getEmpById(int id) {
		Optional<Employee> emp=list.stream().filter(obj->obj.getId()==id).findAny();
		if(emp.isPresent())
			return emp.get();
		else
			return null;
	}

}