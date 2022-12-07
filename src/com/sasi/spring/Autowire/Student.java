package com.sasi.spring.Autowire;

public class Student {
	private String sname;
	private Department department;
	
	//Autowire by Constructor
	public Student(Department department)
	{
		this.department=department;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
