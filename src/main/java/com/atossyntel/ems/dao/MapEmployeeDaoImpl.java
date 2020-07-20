package com.atossyntel.ems.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.atossyntel.ems.datasource.EmployeeMap;
import com.atossyntel.ems.model.Employee;


@Repository
public class MapEmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return EmployeeMap.INSTANCE.getMap().put(employee.getEmployeeId(), employee) == employee;
	}

	@Override
	public boolean updateEmployee(Employee employee) {

		if (EmployeeMap.INSTANCE.getMap().containsKey(employee.getEmployeeId())) {
			return EmployeeMap.INSTANCE.getMap().put(employee.getEmployeeId(), employee) == employee;

		}

		return false;

	}

	@Override
	public boolean deleteEmployee(int employeeId) {

		if (EmployeeMap.INSTANCE.getMap().containsKey(employeeId)) {
			EmployeeMap.INSTANCE.getMap().remove(employeeId);
			return true;
		}

		return false;
	}

	@Override
	public Employee findEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return EmployeeMap.INSTANCE.getMap().get(employeeId);

	}

	@Override
	public List<Employee> findAllEmployees() {
		return new ArrayList<>(EmployeeMap.INSTANCE.getMap().values());
	}

}
