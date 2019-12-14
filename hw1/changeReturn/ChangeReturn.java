//HW-1.2

import java.util.Scanner;

public class ChangeReturn {
	public static void main(String[] args) {
		
		//Declare variable and data types
		int userInput;
		Scanner scan = new Scanner (System.in);
		
		int change;
		int quarters;
		int afterQuarters;
		int dimes;
		int afterDimes;
		int nickels;
		int afterNickels;
		int pennies;
		
		//Ask for user input
		System.out.print("Enter the purchase amount [0-100]: "); //use print for having user input on the same line (no carriage return)
		userInput = scan.nextInt();
		
		/*
		//Test scanner function
		System.out.println("Amount entered: " + userInput + " cents");
		//it works!
		*/
		
		//List logic for producing error if input is out of bounds
		if (userInput < 0 || userInput > 100) {
			System.out.println("ERROR. Value must be between 0 and 100, inclusive. Please restart and try again.");
			System.exit(0); //Exits current program (need an int value within the () for it to work)
		}
		else
			System.out.println("Amount entered: " + userInput + " cents");
		
		//Calculate the amount and types of change from a dollar
		change = 100 - userInput;
		
		quarters = change / 25; //number of whole quarters
		afterQuarters = change % 25; //modulus gives the remaining amount not convertible to quarters
		
		dimes = afterQuarters / 10;
		afterDimes = afterQuarters % 10;
		
		nickels = afterDimes / 5;
		afterNickels = afterDimes % 5;
		
		pennies = afterNickels / 1;
		
		//Print all change types in a list
		System.out.println("Your change of " + change + " cents is given as:");
		System.out.println(quarters + " Quarter(s)");
		System.out.println(dimes + " Dime(s)");
		System.out.println(nickels + " Nickel(s)");
		System.out.println(pennies + " Pennies(/Penny)");
	}
}