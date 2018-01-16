package com.employeeproject.EmployeeProjApp;

import java.io.File;

import com.employeeproject.EmployeeProjectLib.CollectionEmployeeOperations;
import com.employeeproject.EmployeeProjectLib.EmployeeUtil;

public class EmployeeOperationsApp {
	public static void main(String[] args)throws Exception {
		
	CollectionEmployeeOperations collImpl = new CollectionEmployeeOperations ();
	

	File file = new File("C:/Users/ameya/Desktop/testcsv.csv");
	collImpl.readEmployees(file);
	EmployeeUtil.menuOptions(collImpl);
	collImpl.writeEmployees(CollectionEmployeeOperations.list);
	
	}
}
		
		
	