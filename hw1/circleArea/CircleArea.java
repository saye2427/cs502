//HW-1.1

public class CircleArea {
	
	public static void main(String[] args) {
	
	int r;
	double A; //produces error when A is an int
	
	r = 3;
	A = 3.1415*r*r; //Area of a circle = pi*r^2
	
	System.out.println("The area of a circle with a radius of " + r + " is ~" + A + ".");
	
	}

}