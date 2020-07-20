package com.atossyntel.ems.service;

import java.util.List;

import com.atossyntel.ems.model.Employee;

public interface EmployeeService {

	Employee findEmployee(int employeeId);

	boolean deleteEmployee(int employeeId);

	boolean updateEmployee(Employee employee);

	boolean saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

}
