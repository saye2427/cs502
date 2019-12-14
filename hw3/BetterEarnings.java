public class BetterEarnings {

	public static void main(String[] args) {
		
		int hoursWorked = 1;
		while(hourly(hoursWorked)>=doubled(hoursWorked))
			hoursWorked++;
		// \033[1m TEXTHERE \033[0m -- bolds text in terminal (answer will thus be bolded)
		System.out.println("Having a salary that is doubled each hour becomes more lucrative than one that pays $10/hr \033[1mafter " + hoursWorked + " full hours of work\033[0m.");
		System.out.println(" ");
		System.out.println("In other words, if an employee has worked \033[1m" + hoursWorked + "+\033[0m hours, he or she should opt for an hourly starting wage of $0.10, which then doubles each hour.");
	}
	
	//Method for wages with salary of $10/hr
	public static int hourly(int hoursWorked) {
		
		int wages;
		wages = hoursWorked * 10;
			
		return wages;
	
	}
	
	//Method for wages with salary doubled each hour
	public static double doubled(int hoursWorked) {
		
		double hourlyWage = 0.10;
		double doubledWages = 0.00;
			
		int i = 1;
		while(i <= hoursWorked){
			doubledWages = doubledWages + hourlyWage;
			hourlyWage = hourlyWage	* 2.00;
			i++;
		}
			
		return doubledWages;

	}
	
}