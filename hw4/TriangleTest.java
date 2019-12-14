import java.util.Scanner;

class TriangleTest {
	
	public static void main(String[] args) {
		
		//Initialize program
		System.out.println("Welcome to the Triangle Tester!");
		System.out.println("Given the lengths of 3 sides of a triangle, this program will determine if the triangle is Equilateral, Isosceles, or Scalene, and then return the perimeter.");
		
		//Create an instance of the Triangle class to work with
		Triangle t1 = new Triangle();
		//Initialize Scanner and ask for user inputs to set to Triangle class side values
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("Please enter the length of the first side of the triangle: ");
		t1.side1 = scan.nextInt();
		
		while(t1.side1 <= 0) {
			
			System.out.println("Invalid input. Side values must be a positive, non-zero integer.");
			System.out.print("Please try again: ");
			t1.side1 = scan.nextInt();
			
		}
		
		System.out.print("Please enter the length of the second side of the triangle: ");
		t1.side2 = scan.nextInt();
		
		while(t1.side2 <= 0) {
			
			System.out.println("Invalid input. Side values must be a positive, non-zero integer.");
			System.out.print("Please try again: ");
			t1.side2 = scan.nextInt();
			
		}
		
		System.out.print("Please enter the length of the third side of the triangle: ");
		t1.side3 = scan.nextInt();
		
		while(t1.side3 <= 0) {
			
			System.out.println("Invalid input. Side values must be a positive, non-zero integer.");
			System.out.print("Please try again: ");
			t1.side3 = scan.nextInt();
			
		}
		
		System.out.println(" ");
		System.out.println("Sides entered: ");
		System.out.println("Side 1 = " + t1.side1); 
		System.out.println("Side 2 = " + t1.side2); 
		System.out.println("Side 3 = " + t1.side3);
		
		//Test for triangle type
		if (t1.isScalene()==true)
			System.out.println("This is a SCALENE Triangle with a perimeter of " + t1.calculatePerimeter() + ".");
		else if (t1.isIsosceles()==true)
			System.out.println("This is an ISOSCELES Triangle with a perimeter of " + t1.calculatePerimeter() + ".");
		else if (t1.isEquilateral()==true)
			System.out.println("This is an EQUILATERAL Triangle with a perimeter of " + t1.calculatePerimeter() + ".");
		
	}
	
}
