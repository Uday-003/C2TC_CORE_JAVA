//This program demonstrates the class and objects
package com.capgemini.javademos;

class Car{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

public class DemoClassAndObj {

	public static void main(String[] args) {
			Car car = new Car();//creates the object of car class
			car.setSpeed(10);
			System.out.println(car.getSpeed());

	}

}
