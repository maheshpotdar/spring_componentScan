package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	// ya class madhe fakt secondary variable manaje spring ioc container object
	// tayar karnar.
	// <context:annotation-config/>//annotation activate
	// @component component scan
	@Autowired
	@Qualifier(value = "c2")
	private Car car;

	@Autowired
	private Company company;

	@Autowired
	@Qualifier(value = "h2")
	private Home home;

	// Autowire mule no setter and no paramaterised constructor.
	// Baher access karnyasathi getter fakt.
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	public Company getCompany() {
		return company;
	}

	public Home getHome() {
		return home;
	}

	@Override
	public String toString() {
		return "Employee [car=" + car + ", company=" + company + ", home=" + home + "]";
	}

}
