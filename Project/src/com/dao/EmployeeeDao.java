package com.dao;

import java.util.List;

import com.exception.employeeException;
import com.models.Employee;
import com.models.Problem;

public interface EmployeeeDao {
	
	public String registerEmployee(Employee emp) throws employeeException;
	
	public Employee employeeLogin(String username, String password) throws employeeException;
	
	public String registerComplain(Problem problem, int id) throws employeeException;
	
	public String viewStatus(int id)throws employeeException;
	
	public List<Problem> checkHistory(int id) throws employeeException;
	
	public String updatePassword(String Username ,String password) throws employeeException;

}
