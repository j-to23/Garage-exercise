package com.qa.garage;

public class Vehicle {
	
	int wheels;
	int enginesize;
	int seats;
	
	public int wheelscost(int wheels) {
		this.wheels = wheels;
		int wheelscost = wheels * 100;
		return wheelscost;
	}
	
	public int Enginecost(int enginesize) {
		this.enginesize = enginesize;
		int enginecost = enginesize * 1000;
		return enginecost;
	}
	
	public int seatscost(int seats) {
		this.seats = seats;
		int seatscost = seats * 99;
		return seatscost;
	}
}
