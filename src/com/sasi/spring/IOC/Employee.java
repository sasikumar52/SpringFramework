package com.sasi.spring.IOC;

public class Employee {
	String name;
	int id;
	int salary;
	
	public Employee()
	{
		System.out.println("Object created");
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	//custom initialization
	public void myInit()
	{
		System.out.println("Object initialized");
	}
	//custom destroy
	public void myDestroy()
	{
		System.out.println("Object destroyed");
	}
	

}
