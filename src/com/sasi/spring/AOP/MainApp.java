package com.sasi.spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("BeansAOP.xml");

      Student student = (Student) context.getBean("student");
      student.getName();
      student.getAge();     
   }
}
