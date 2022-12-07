package com.sasi.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDb {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		// insert
		/*
		 * int status=dao.saveEmployee(new Employee(101,"Sasi",55000));
		 * System.out.println(status);
		 */ // update

		/*
		 * int updateStatus = dao.updateEmployee(new Employee(102, "Amit", 10000));
		 * System.out.println(updateStatus);
		 */
		// simple jdbc
		/*
		 * int s=dao.updateEmployee(new Employee(23,"Tarun",35000));
		 * System.out.println(s);
		 */
		// delete

		/*
		 * Employee e = new Employee(); e.setId(102); 
		 * int deleteStatus =dao.deleteEmployee(e); 
		 * System.out.println(deleteStatus);
		 */
		//Read
		List<Employee> list=dao.getAllEmployeesRowMapper​();
		for(Employee e:list)
		System.out.println(e);
		
		//Exact search
		Employee employee=dao.findByEmployee((long) 101);
		System.out.println(employee);
	}

}
