package com.sasi.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBeanDependency.xml");

		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);

		((ClassPathXmlApplicationContext) context).close();
	}

}
 