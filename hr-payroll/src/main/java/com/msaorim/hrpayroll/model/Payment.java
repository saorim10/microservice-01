package com.msaorim.hrpayroll.model;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyincome;
	private Integer days;
	
	public Payment() {
	}

	public Payment(String name, Double dailyincome, Integer days) {
		super();
		this.name = name;
		this.dailyincome = dailyincome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyincome() {
		return dailyincome;
	}

	public void setDailyincome(Double dailyincome) {
		this.dailyincome = dailyincome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public Double getTotal() {
		return this.dailyincome * this.days;
	}
}
