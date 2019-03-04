/**
 * Write a program to reads a number between 0 and 1000, and adds all the digits in the integer
 * HINT: use the modulud (%) and division opertors. For example, if you take the number 849
 * and do a modulus 10 (849%10), you'll get the last digit 9. Next you try to reduce the number
 * to '84' so that 84%10 will give you the current last digit 4. Hope you got the idea!
 */
 import java.util.*;
public class AddAllDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a number");
		int number = sc.nextInt();
		int sum = 0;
    	String str = Integer.toString(number);
    	for (int i = 0; i < str.length(); i++){
    		char c = str.charAt(i);
    		sum += Character.getNumericValue(c);
    	}
    	System.out.println("Total " + sum);
	}
}