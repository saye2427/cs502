//HW-2.1

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int input;
	
	System.out.print("Enter a number greater than 1 to generate the sum of all even numbers between 2 and itself: ");
	input = scan.nextInt();
	
	//System.out.println("User input: " + input);

	//Logic for producing an error if the number entered is less than 2
	if (input < 2) {
		System.out.println("ERROR: Number cannot be less than 2. Please restart and try again.");
		System.exit(0);
	} else {
		System.out.println("User input: " + input);
	}
	
	//Logic for looping through all EVEN numbers between 2 (incl.) and the number and adding them together
	int num = 2;
	long evenSum = 0; //use type 'long' to allow for correct sum when user input is a larger number - larger numbers take more bits, and will show negative sums when bits are exceeded
	while (num <= input) {
		evenSum = evenSum + num;
		num = num + 2;
	}
	System.out.println("Even sum = " + evenSum);

	}
	
}
