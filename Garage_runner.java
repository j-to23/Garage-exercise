package com.qa.garage;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Garage_runner {
	public static void main(String[] args) {
//		int wheels;			//number
//		int enginesize;		//cm2
//		int seats;			//number
//		int area;			//cm2
//		int airbags;	
//		int windows;	
//		int height; 		//cm
//		int helmets;	
//		int gloves;	
//		int storagespace; 	//m^2
//		int weight;			//kg
//		int height;			//cm
		
		List<Integer> Car1 = Arrays.asList(4,80,5,500,2,6);
//		List<Integer> Car2 = Arrays.asList(4,90,5,550,1,5);
//		List<Integer> Car3 = Arrays.asList(3,60,4,400,2,4);
		
		List<Integer> Motorcycle1 = Arrays.asList(2,40,1,80,1,2);
//		List<Integer> Motorcycle2 = Arrays.asList(2,30,1,120,2,4);
//		List<Integer> Motorcycle3 = Arrays.asList(2,50,2,150,2,4);
		
		List<Integer> Truck1 = Arrays.asList(8,130,2,10,2700,1300);
//		List<Integer> Truck2 = Arrays.asList(10,130,3,10,2700,1200);
//		List<Integer> Truck3 = Arrays.asList(12,130,4,10,2700,1360);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vehicle Type? (1 = Car, 2 = Motorcycle, 3 = Truck)");
		int type = sc.nextInt();
		System.out.println(type);
		
		if (type == 1) {
			Car c = new Car();
			int wheels = c.wheelscost(Car1.get(0));
			int engine = c.Enginecost(Car1.get(1));
			int seats = c.seatscost(Car1.get(2));
			int area = c.areaCost(Car1.get(3));
			int abags = c.airbagsCost(Car1.get(4));
			int windows = c.windowsCost(Car1.get(5));
			int total = wheels+engine+seats+area+abags+windows;
			System.out.println("Service cost = £"+total);
			
		}else if(type == 2) {
			Motorcycle m = new Motorcycle();
			int wheels = m.wheelscost(Motorcycle1.get(0));
			int engine = m.Enginecost(Motorcycle1.get(1));
			int seats = m.seatscost(Motorcycle1.get(2));
			int height = m.heightcost(Motorcycle1.get(3));
			int helmets = m.helmetscost(Motorcycle1.get(4));
			int gloves = m.glovescost(Motorcycle1.get(5));
			int total = wheels+engine+seats+height+helmets+gloves;
			System.out.println("Service cost = £"+total);

		}else if (type == 3) {
			Truck t = new Truck();
			int wheels = t.wheelscost(Truck1.get(0));
			int engine = t.Enginecost(Truck1.get(1));
			int seats = t.seatscost(Truck1.get(2));
			int storage = t.storagecost(Truck1.get(3));
			int weight = t.weightcost(Truck1.get(4));
			int height = t.heightcost(Truck1.get(5));
			int total = wheels+engine+seats+storage+weight+height;
			System.out.println("Service cost = £"+total);
		}
		
		
		sc.close();
		
	}
}
