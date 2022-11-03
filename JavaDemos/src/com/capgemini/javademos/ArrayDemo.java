//This program demonstrates the use of Arrays 
package com.capgemini.javademos;

public class ArrayDemo {

	public static void main(String[] args) {
		int numberArray[]=new int[5];
		
		numberArray[0] = 1;
		numberArray[1] = 45;
		numberArray[2] = 666;
		numberArray[3] = 18;
		numberArray[4] = 179;
	//For loop
		for(int i=0;i<numberArray.length;i++)
		{
			System.out.println(numberArray[i]);
		}
	
	//for each loop
		for(int i:numberArray)
		{
			System.out.println(i);	
		}
		
	}

}
