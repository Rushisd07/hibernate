package com.demo;

public class StudentBean {
	
	private Integer stdId;
	private String stdName;
//	private float stdMks;
	
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentBean(Integer stdId, String stdName, float stdMks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		//this.stdMks = stdMks;
	}


	public Integer getStdId() {
		return stdId;
	}


	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


//	public float getStdMks() {
//		return stdMks;
//	}


//	public void setStdMks(float stdMks) {
//		this.stdMks = stdMks;
//	}


	@Override
	public String toString() {
		return "StudentBean [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	
	

	
	
}
