//This program demonstrates the use of abstract class using inheritance
package com.capgemini.javademos;

abstract class AbstractBaseClass
{
	void funtionOne()//abstract class can contain non-abstract method
	{
		System.out.println("Base functionOne() is called");
	}
}

class ADerivedClass extends AbstractBaseClass //abstract class is inherited
{
	
}

public class AbstractDemoThree {

	public static void main(String[] args) {
		ADerivedClass obj = new ADerivedClass();//object of derived class can access all the members
		obj.funtionOne();

	}

}
