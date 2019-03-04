/**
 * Take three numbers from the user and print the greatest number
 */
import java.util.*;
public class GreatestNumber {
	public static void main(String[] args) {
    	int max = 0;
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i < 3; i++){
    		System.out.println("Please give a number");
    		int currentNumber = sc.nextInt();
    		if(i == 0){
    			max = currentNumber;
    		} else {
				if(currentNumber > max){
					max = currentNumber;
				}
    		}
    	}
    	System.out.println("the highest number is " + max);
	}
}