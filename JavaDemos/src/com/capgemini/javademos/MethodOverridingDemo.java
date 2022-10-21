//This program demonstrates method overriding
package com.capgemini.javademos;
class SuperClass
{
	void displayMethod()//display method in superclass
	{
		System.out.println("Super Class");
	}
}
class SubClass extends SuperClass
{

	@Override
	void displayMethod() //display method is overriden in subclass
	{
		
		super.displayMethod();
		System.out.println("This is subclass");
	}
	
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.displayMethod();

	}

}
