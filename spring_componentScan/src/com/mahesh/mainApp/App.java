package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Company;
import com.mahesh.model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		context.getBean("c2");
		context.getBean(Company.class);
		context.getBean("h2");
		Employee employee = (Employee) context.getBean(Employee.class);
		System.out.println(employee);
	}

}
