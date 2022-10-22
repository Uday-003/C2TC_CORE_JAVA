//This program demonstrates the decision making
package com.capgemini.javademos;

public class DecisionMakingUsingOperator {

	public static void main(String[] args) {
		 int firstVar = 10; int secondVar= 11;
		  
		  if(!(firstVar < secondVar) || (firstVar == secondVar))//use of OR("||") operator
		  { 
			  System.out.println("Condition is TRUE");
		  }
		  else
		  { 
			  System.out.println("Condition is FALSE"); 
		}
		 


		 int ageOfBoy = 36;
		int ageOfGirl = 25;

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) //use of AND("&&") operator
		{
			System.out.println("ready to get married!");
		} 
		else 
		{
			System.out.println("Wait for it kiddo!");
		}

		
	}

}
