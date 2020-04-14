package com.qa.garage;

public class Truck extends Vehicle{
	
	int storagespace; //m^2
	int weight;
	int height;
	
	public int wheelscost(int wheels) {
		return super.wheelscost(wheels)*3;
	}
	
	
	public int Enginecost(int enginesize) {
		return super.Enginecost(enginesize)*2;
	}
	
	public int seatscost(int seats) {
		return super.seatscost(seats);
	}
	
	public int storagecost(int storagespace) {
		int s = storagespace;
		if (s <= 10) {
			int storagecost = s*10;
			return storagecost;
		}else if (s<=20) {
			int storagecost = s*11;
			return storagecost;
		}else {
			int storagecost = s*13;
			return storagecost;
		}
	}
		
	public int weightcost(int weight) {
		int w = weight;
		if(w <2722) {
			int weightcost=w*10;
			return weightcost;
		}else if(w<=3856) {
			int weightcost = w*15;
			return weightcost;
		}else {
			int weightcost= w*20;
			return weightcost;
		}
	
	}
	
	public int heightcost(int height) {
		return height*10;
	}
}
