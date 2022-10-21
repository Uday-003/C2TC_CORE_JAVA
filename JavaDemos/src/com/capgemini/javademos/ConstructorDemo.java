//This program demonstrates the constructor
package com.capgemini.javademos;

class FourWheeler
{
	private String doors;
	private int speed;
	
	public FourWheeler() {
		doors = "opened";
		speed = 0;
	}

	public FourWheeler(String doors, int speed) {
		this.doors = doors;
		this.speed = speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed")&&speed>0) {
			return "running";
		}
		else {
			return "not running";
		}
	}	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		FourWheeler car = new FourWheeler("closed",10);
		System.out.println(car.run());
	}

}
