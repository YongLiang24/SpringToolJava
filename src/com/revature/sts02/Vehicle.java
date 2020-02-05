package com.revature.sts02;

public class Vehicle {

	private String maker;
	private int year;
	public Vehicle() {
		super();
	}
	public Vehicle(String maker, int year) {
		super();
		this.maker = maker;
		this.year = year;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
