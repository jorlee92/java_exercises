/**
 * Take any integer input from the user and convert it into a value
 * between 1 and 7 (both inclusive). Depending on the converted value, 
 * print the day of the week. For example, 1=Monday, 2=Tuesday, etc.
 */
import java.util.*;
public class Weekday {
	public static void main(String[] args) {
    	//Convert it how?
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter a number");
    	int num = sc.nextInt();
    	String weekday = "";
    	switch(num){
    		case 1:
    			weekday = "monday";
    			break;
    		case 2:
    			weekday = "tuesday";
    			break;
    		case 3:
    			weekday = "wendsday";
    			break;
    		case 4:
    			weekday = "thursday";
    			break;
    		case 5:
    			weekday = "friday";
    			break;
    		case 6:
    			weekday = "saturday";
    			break;
    		case 7:
    			weekday = "sunday";
    			break;
    	}
    	System.out.println("The selected day is " + weekday);
	}
}