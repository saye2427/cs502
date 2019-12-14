class Triangle {

	int side1;
	int side2;
	int side3;
	
	boolean isScalene() {
		
		if (side1 != side2 && side1 != side3 && side2 != side3)
			return true;
		else
			return false;
	
	}
	
	boolean isIsosceles() {
		
		if (side1 == side2 && side1 != side3 || side1 == side3 && side1 != side2 || side2 == side3 && side1 != side2)
			return true;
		else
			return false;
	
	}
	
	boolean isEquilateral() {
		
		if (side1 == side2 && side1 == side3)
			return true;
		else
			return false;
	
	}
	
	int calculatePerimeter() {
		
		int returnValue;
		
		returnValue = side1 + side2 + side3;
		return returnValue;
	
	}

}
