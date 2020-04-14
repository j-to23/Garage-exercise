package com.qa.garage;

public class Car extends Vehicle{
	
	int area;
	int airbags;
	int windows;
	
	public int wheelscost(int wheels) {
		return super.wheelscost(wheels);
	}
	
	public int Enginecost(int enginesize) {
		return super.Enginecost(enginesize);
	}
	
	public int seatscost(int seats) {
		return super.seatscost(seats);
	}
	
	public int areaCost(int area) {
		return area*10;
	}
	
	public int airbagsCost(int airbags) {
		return airbags*10^2;
	}
	
	public int windowsCost(int windows) {
		return windows * 255;
	}
	
}
