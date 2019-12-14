//HW-2.2

import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = -1; //input must be otherwise defined for the while portion of the do while loop
		
		//Generate two random numbers
		Random myRandomNumber = new Random();
		int x = Math.abs(myRandomNumber.nextInt() % 10);
		int y = Math.abs(myRandomNumber.nextInt() % 10);
		
		//Check user input against correct answer and respond accordingly...
		do {
			//System.out.println("Random numbers generated: " + x + ", " + y);
			System.out.println("How much is " + x + " times " + y + "?");
			System.out.println("Enter your answer or -1 to exit: ");
			
			//Read user input
			input = scan.nextInt(); //Reassignment of input based on user input
			//System.out.println("User input: " + input);
			
			if (input == x*y) {
				System.out.println("Very Good!");
				System.out.print("Let's try another one! ");
				//Generate a new random numbers with reassignment
				x = Math.abs(myRandomNumber.nextInt() % 10);
				y = Math.abs(myRandomNumber.nextInt() % 10);
				
			} else if (input == -1) {
				System.out.println("Goodbye.");
				System.exit(0);
				
			} else {
				System.out.println("No. Please try again or enter -1 to exit: ");
			}	

		} while (input != -1);

	}

}
