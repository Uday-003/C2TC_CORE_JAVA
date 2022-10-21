//This program demonstrates the use of abstract keyword
package com.capgemini.javademos;
abstract class BaseClass// abstract class is defined using abstract keyword
{
	abstract void functionOne();//This is the abstract method
}
class DerivedClass extends BaseClass // The abstract class is inherited
{

	@Override
	void functionOne()//abstract method has to be overridden 
	{
		System.out.println("Derived functionOne() is called");
		
	}
	
}

public class AbstractDemoOne {

	public static void main(String[] args) {
		//we cannot create the object of base class as it is abstract
		//therefore 'BaseClass obj = new BaseClass()' is not valid
		//we can have reference of base type
		BaseClass obj = new DerivedClass();
		obj.functionOne();
		

	}

}
