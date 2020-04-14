package com.qa.garage;

public class Motorcycle extends Vehicle{
	
	int height; 	//cm
	int helmets;	
	int gloves;		
	
	public int wheelscost(int wheels) {
		return super.wheelscost(wheels)/2;
	}
	
	
	public int Enginecost(int enginesize) {
		return super.Enginecost(enginesize)/2;
	}
	
	public int seatscost(int seats) {
		return super.seatscost(seats)/2;
	}
	
	public int heightcost(int height) {
		if (height<=120) {
			int heightcost = height*6;
			return heightcost;
		}else {
			int heightcost = height*8;
			return heightcost;
		}
	}
	
	public int helmetscost(int helmets) {
		return helmets*10;
	}
	public int glovescost(int gloves) {
		return gloves*100;
	}
}
