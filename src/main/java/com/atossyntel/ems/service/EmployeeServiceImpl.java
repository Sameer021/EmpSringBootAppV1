package com.atossyntel.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atossyntel.ems.dao.EmployeeDao;
import com.atossyntel.ems.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee findEmployee(int employeeId) {
		// TODO Auto-generated method stub

		return employeeDao.findEmployee(employeeId);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {

		return employeeDao.deleteEmployee(employeeId);

	}

	@Override
	public boolean updateEmployee(Employee employee) {

		return employeeDao.updateEmployee(employee);

	}

	@Override
	public boolean saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDao.findAllEmployees();
	}

}
