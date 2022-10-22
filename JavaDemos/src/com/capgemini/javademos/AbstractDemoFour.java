//This program demonstrates the use of abstract keyword and final keyword
package com.capgemini.javademos;
abstract class BaseClassOne
{
	final void functionOne()// final method is defined using final keyword
	{
		System.out.println("Base functionOne() is called");
	}
}
class DerivedClassOne extends BaseClassOne //inherited abstract base class
{
	
}
public class AbstractDemoFour {

	public static void main(String[] args) {
		DerivedClassOne obj = new DerivedClassOne();
		
		obj.functionOne();

	}

}
