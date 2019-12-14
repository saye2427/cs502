import java.text.DecimalFormat;

class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	//Implement a constructor that will set instance variables to zero (whenever a new instance is created)
	public Time() {
		
		hour = 0;
		minute = 0;
		second = 0;
		
	}
	
	//Implement a constructor that will set the time with parameters passed in
	public Time(int hr, int min, int sec) {
		
		hour = hr;
		minute = min;
		second = sec;
		
	}
	
	//Implement a method to set instance variables according to the values passed in
	public void setTime(int hr, int min, int sec) {
		
		hour = hr;
		minute = min;
		second = sec;
		
	}
	
	//Implement a method to print the time in hours:minutes:seconds
	public void printTime() {
	
		//Use DecimalFormat object to always display two digits (i.e. 00:00:00)
		DecimalFormat formatter = new DecimalFormat("00");
		
		System.out.println(formatter.format(hour) + ":" + formatter.format(minute) + ":" + formatter.format(second));
		
	}
	
	//Implement a method that will increment the time object by one second (where max hours is 24)
	//Then need nested if statements to increment h:m:s accordingly
	public void tick() {
		
		second++;
		
		if (second == 60) {
			second = 0;
			minute++;
			if (minute == 60) {
				minute = 0;
				hour++;
				if(hour > 23) {
					hour = 0;
				}
			}
		}

	}
	
}
