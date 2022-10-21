//This program demonstrates multilevel inheritance
package com.capgemini.javademos;
class ParentOne//Parent class
{
	void displayOne()
	{
		System.out.println("One");
	}
}
class ChildTwoDemo extends ParentOne //first child class inherits parent
{
	void displayTwo()
	{
		System.out.println("Two");
	}
}
class ChildThreeDemo extends ChildTwoDemo // second child class inherits childtwo
{
	void displayThree()
	{
		System.out.println("Three");
	}
}
class ChildFourDemo extends ChildThreeDemo//Third child inherits childthree
{
	void displayFour()
	{
		System.out.println("Four");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		ChildFourDemo objOne = new ChildFourDemo();
		//only one object can access all the methods
		objOne.displayOne();
		objOne.displayTwo();
		objOne.displayThree();
		objOne.displayFour();

	}

}
