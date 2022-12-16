package com.dao;

import java.util.List;

import com.exception.engineerException;
import com.models.Engineer;
import com.models.Problem;

public interface EngineerDao {
	
	public Engineer loginToSystem(String username,String password) throws engineerException;
	
	public List<Problem> viewAssignedProblem(int id) throws engineerException;
	
	public String updateProblem(String update,int engId, int problemId) throws engineerException;
	
	public List<Problem> viewAttendProblem(int id) throws engineerException;
	
	public String updatePassword(String username,String password) throws engineerException;

}
