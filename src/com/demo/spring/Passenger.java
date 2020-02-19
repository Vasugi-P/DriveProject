package com.demo.spring;

public class Passenger {
	private String name;
	private Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Passenger(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
		
	}
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("passanger name : "+name);
		vehicle.move();
		
	}
	
	
	
	
}

	