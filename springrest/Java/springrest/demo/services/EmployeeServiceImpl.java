package springrest.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springrest.demo.dao.IEmployeeDao;
import springrest.demo.entities.Employee;

@Service("es")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeDao ed;
	
	@Override
	public List<Employee> getAll() {
		return ed.getAllEmp();
	}

	@Override
	public Employee getEmpById(int id) {
		
		return ed.getEmpById(id);
	}

}
