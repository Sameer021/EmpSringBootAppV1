package com.atossyntel.ems.dao;

import java.util.List;

import com.atossyntel.ems.model.Employee;

public interface EmployeeDao {

	public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int employeeId);
	public Employee findEmployee(int employeeId);
	public List<Employee> findAllEmployees();
	
	
	
	
}
