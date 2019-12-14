public class TimeTest {
	public static void main(String[] args) {
		
		//Create instance of Time class
		Time t1 = new Time();
		//Check the Time construct -> print should yield 00:00:00
		System.out.print("The STARTING TIME is ");
		t1.printTime();
		
		//Test the tick() method for 60 ticks -> should go to "00:01:00"
		int counter = 1;
		while (counter <= 60) {
			t1.tick();
			counter++;
		}
		System.out.print(counter-1 + " ticks later, the CURRENT TIME is ");
		t1.printTime();
		System.out.println("");
		
		
		
		//Create another instance of the Time class
		Time t2 = new Time();
		//Set a time
		t2.setTime(4,15,36);
		System.out.print("The STARTING TIME is ");
		t2.printTime();
		//Increment it: Let's try 6 minutes (360 seconds later) -> Should be 04:21:36
		counter = 1;
		while (counter <= 360) {
			t2.tick();
			counter++;
		}
		System.out.print(counter-1 + " ticks later, the CURRENT TIME is ");
		t2.printTime();
		System.out.println("");
		
		
		
		//Create another instance of the Time class -> let's test the reset after 23:59:59
		Time t3 = new Time();
		//Set a time
		t3.setTime(23,59,59);
		System.out.print("The STARTING TIME is ");
		t3.printTime();
		//Increment it: Let's try 1 second later -> time is technically 24:00, but shows up as 00:00:00 in a military clock
		counter = 1;
		while (counter <= 1) {
			t3.tick();
			counter++;
		}
		System.out.print(counter-1 + " tick later, the CURRENT TIME is ");
		t3.printTime();
		System.out.println("");
		
		
		
		//Create another instance of the Time class -> let's try changing the hour, minutes, and seconds all at once
		Time t4 = new Time();
		//Set a time
		t4.setTime(23,37,15);
		System.out.print("The STARTING TIME is ");
		t4.printTime();
		//Increment it
		counter = 1;
		while (counter <= 10800+180+30) { //3hr,3m,30s -> time should be 02:40:45
			t4.tick();
			counter++;
		}
		System.out.print(counter-1 + " ticks later, the CURRENT TIME is ");
		t4.printTime();
		System.out.println("");
		
	}
	
}
