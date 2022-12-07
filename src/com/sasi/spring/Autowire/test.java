package com.sasi.spring.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Autowire_byName.xml");
		Student student= (Student) context.getBean("student");
		System.out.println(student.getSname());
		System.out.println(student.getDepartment().getname());

	}

}
