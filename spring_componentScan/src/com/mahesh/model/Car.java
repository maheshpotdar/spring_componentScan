package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carName;
	private String carmodelyear;
	@Autowired
	@Qualifier(value = "h2")
	private Home home;

	private String carPinNo;
	private String cartype;
	// Eak jari class madhe primitive variable asel tar object malacha tayar
	// karayala lagnar

	public String getCarmodelyear() {
		return carmodelyear;
	}

	@Required
	public void setCarmodelyear(String carmodelyear) {
		this.carmodelyear = carmodelyear;
	}

	public String getCarPinNo() {
		return carPinNo;
	}

	public void setCarPinNo(String carPinNo) {
		this.carPinNo = carPinNo;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarName() {
		return carName;
	}

	@Required
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carmodelyear;
	}

	public void setCarModel(String carModel) {
		this.carmodelyear = carModel;
	}

	public Home getHome() {
		return home;
	}

}
