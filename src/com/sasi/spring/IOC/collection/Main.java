package com.sasi.spring.IOC.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansCollection.xml");
		JavaCollection jc=(JavaCollection) context.getBean("javaC");
		
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();

	}

}
