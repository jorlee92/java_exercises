/**
 * Write a program to convert temperature from Farenheit to Celsius
 * C=(F-32)*5/9
 * Hint: Use scanner to get user input. Choose the right datatype to hold the temperature value
 * what will you choose? int/long/double/float??
 */
 import java.util.*;
public class TemperatureConversion {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int given = sc.nextInt();
    	System.out.println(given);
    	System.out.println("The celcius version of your temp is " + getConverted(given));
	}
	public static double getConverted(int inp){
		return ((inp - 32) * (5/9));
	}
}