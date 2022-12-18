package com.models;

public class Problem {

	private int problemId;
	private String type;
	private String description;
	private String date;
	private String status;
	public Problem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Problem(int problemId, String type, String description, String date, String status) {
		super();
		this.problemId = problemId;
		this.type = type;
		this.description = description;
		this.date = date;
		this.status = status;
	}
	public int getProblemId() {
		return problemId;
	}
	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date2) {
		this.date = date2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Problem [problemId=" + problemId + ", type=" + type + ", description=" + description + ", date=" + date
				+ ", status=" + status + "]";
	}
	
	
}
