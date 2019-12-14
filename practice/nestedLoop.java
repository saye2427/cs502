public class nestedLoop {
	public static void main(String[] args) {
	
	int prod = 1; //must be initialized
	
	for(int x=2; x<=4; x++)
		//System.out.println(prod); - would print 1, 8, 12 because only prints prod as init, and then prod 2 more times after it has been re-eval
		for(int y=1; y<=4; y++)
			prod = x*y;
			System.out.println(prod); //will print one output
	}
}