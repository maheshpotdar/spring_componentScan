package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	@Qualifier(value = "c2")
	private Car car;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "Company [car=" + car + "]";
	}

}
