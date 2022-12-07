package com.sasi.spring.AOP;


public class Logging {
	   /** 
	      * This is the method which I would like to execute
	      * before a selected method execution.
	   */
	   
	   public void beforeAdvice(){
	      System.out.println("Going to setup student profile.");
	   }   
	   
	   
	   public void afterAdvice()
	   {
		   System.out.println("Student profile setup successfully");

	   }
	}