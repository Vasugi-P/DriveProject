package com.demo.spring;

public class Demo {
	public static void main(String[] args) {
		Passenger passenger=new Passenger();
		Vehicle vehicle=new Car();
		passenger.setName("Monk");
		passenger.setVehicle(vehicle);
		
		passenger.travel();
	}

}
