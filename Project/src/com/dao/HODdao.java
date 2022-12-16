package com.dao;

import java.util.List;

import com.exception.engineerException;
import com.exception.problemException;
import com.models.Engineer;
import com.models.Problem;

public interface HODdao {
//	public String loginIntoTheSystem(String email, String password) ;
	public String registerEngineer2(String name, String department , String email, String password);
	
	public String registerEngineer(Engineer engineer);
	
	public List<Engineer> getAllEngineerDetails() throws engineerException;
	
	public String deleteEngineerById(int id) throws engineerException;
	
	public List<Problem> getAllProblems() throws problemException;
	
	public String assignProblem(int engineerId,int problemId) throws engineerException;
	

}
