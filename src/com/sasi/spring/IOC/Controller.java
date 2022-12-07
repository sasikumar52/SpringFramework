package com.sasi.spring.IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {

	public static void main(String[] args) {

		// Traditional way to create object and set values
		Employee e = new Employee();
		e.setId(101);
		e.setName("sasi");
		e.setSalary(30000);

		System.out.println(e);

		// Using Spring container
		// Two types--1.Bean factory 2.Application context
		
		  System.out.println("------SPTING IOC--------"); 
		  Resource resource = new ClassPathResource("EmployeeBeanIOC.xml"); 
		  BeanFactory factory = new XmlBeanFactory(resource); 
		  Employee e1 = (Employee) factory.getBean("emp1");
		//  Employee e2 = (Employee) factory.getBean("emp2");
		  
		  System.out.println("------Bean factory container------");

		System.out.println("Employee 1 details" + e1);
	//	System.out.println("Employee 2 details" + e2);
		
		((XmlBeanFactory)factory).destroySingletons();

		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBeanIOC.xml");
		Employee e3 = (Employee) context.getBean("emp1");
	//	Employee e4 = (Employee) context.getBean("emp2");
		
		System.out.println("-----Application context----------");

		System.out.println(e3);
	//	System.out.println(e4);
		
		//Closing the spring container
		//When closing the spring container it will destroy all objects
		((ClassPathXmlApplicationContext)context).close();

	}

}
