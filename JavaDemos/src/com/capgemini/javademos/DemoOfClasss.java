package com.capgemini.javademos;
class CarClass{
	private String doors;
	public int speed;
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
		if(doors.equals("closed") && speed>0)
		{
			return "running";
		}
		else {
			return "not running";
		}
	}
}


public class DemoOfClasss {

	public static void main(String[] args) {
		CarClass car = new CarClass();
		car.setDoors("closed");
		car.setSpeed(10);
		System.out.println(car.run());
	}

}

