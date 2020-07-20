package com.atossyntel.ems.datasource;

import java.util.HashMap;
import java.util.Map;

import com.atossyntel.ems.model.Employee;

public enum EmployeeMap{
INSTANCE;
private Map<Integer, Employee> map;



	private EmployeeMap() {
	   map=new HashMap<>();
	   
	   Employee e1=new Employee("pradeep", "chinchole", 1200.00, "9158652627", "amxpc9834d");
	   Employee e2=new Employee("sachin", "chinchole", 1200.00, "9158652627", "amxpc9834d");
	   Employee e3=new Employee("rajesh", "chinchole", 1200.00, "9158652627", "amxpc9834d");
	   Employee e4=new Employee("sunil", "chinchole", 1200.00, "9158652627", "amxpc9834d");
	   Employee e5=new Employee("pratap", "chinchole", 1200.00, "9158652627", "amxpc9834d");
	   
	   map.put(e1.getEmployeeId(), e1);
	   map.put(e2.getEmployeeId(), e2);
	   map.put(e3.getEmployeeId(), e3);
	   map.put(e4.getEmployeeId(), e4);
	   map.put(e5.getEmployeeId(), e5);
	     
      	
	}
	
	public Map<Integer, Employee> getMap() {
		return map;
	}
	
	
	
	
}
