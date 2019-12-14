import java.util.Scanner;
import java.text.DecimalFormat;

public class Earnings {

	public static void main(String[] args) {
		
		//Initialize menu
		divider();
		System.out.println("\t\t\t\t    Menu"); //Add a few tabs and spaces to center Menu
		divider();
		System.out.println(" ");
		System.out.println("Please choose from one of the options below:");
		System.out.println("1)\tCalculate earnings at a wage of $10/hr");
		System.out.println("2)\tCalculate earnings at a wage of $.10, doubled with each hour of work");
		System.out.println("3)\tExit");
		System.out.println(" ");
		divider();
		
		//Wait for user input with Scanner
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		//Create conditions for implementing the correct method, based on the user's input, with escape condition that exits the program if the user inputs 3
		while(input!=3) {
			if(input == 1) {
				hourly(0); //need to initiate method with some integer (will be reassigned when method is run
			} else if(input == 2) {
				doubled(0);
			} else {
				System.out.println("Invalid input. Please try again");
			}
		input = sc.nextInt();
		}
			
	} //end main
	
	//Create a method to create a divider made up of asterisks
	static void divider() {
	
		for(int i=0; i<=80; i++)
			System.out.print("*");
		System.out.print("\n"); //This line ensures that anything printed after a divider will be printed on the next line
		
	} //end divider
	
	//Create a method for calculating the wage if the user chooses a wage of $10/hr
	static int hourly(int hoursWorked) {
		
		System.out.print("Enter number of full hours worked: ");
		Scanner sc = new Scanner(System.in);
		hoursWorked = sc.nextInt();
		
		int wages;
		wages = hoursWorked * 10;
		
		System.out.println("In " + hoursWorked + " hours, you would earn a total of $" + wages);
		System.out.println(" ");
		
		return wages;
	
	}
	
	//Create a method for calculating the wage if the user chooses to have wages that double each hour
	static double doubled(int hoursWorked) {
		
		System.out.print("Enter number of full hours worked: ");
		Scanner sc = new Scanner(System.in);
		hoursWorked = sc.nextInt();
		
		double hourlyWage = 0.10;
		double doubledWages = 0.00;
		
		int i = 1;
		while(i <= hoursWorked){
			doubledWages = doubledWages + hourlyWage;
			hourlyWage = hourlyWage	* 2.00;
			i++;
		}
		
		System.out.println("In " + hoursWorked + " hours, you would earn a total of $" + new DecimalFormat("#,##0.00").format(doubledWages)); //use decimal format with 0s to display only 2 decimal places
		System.out.println(" ");
		
		return doubledWages;

	}
	
}
