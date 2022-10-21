//This program demonstrates method overloading
package com.capgemini.javademos;

public class MethodOverloadingDemo {
	void add(int firstVal,int secondVal)//first method add with two parameters
	{
		System.out.println("Addition is"+(firstVal+secondVal));
	}
	void add(int firstVal, int secondVal,int thirdVal)//add method is overloaded no. of parameters is changed
	{
		System.out.println("Addition is "+(firstVal+secondVal+thirdVal));
	}
	
	public static void main(String[] args)
	{
		MethodOverloadingDemo obj = new MethodOverloadingDemo(); 
		obj.add(5, 4);
		obj.add(5, 5, 4);

	}

}
