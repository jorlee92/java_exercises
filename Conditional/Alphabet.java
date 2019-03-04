/**
 * Take a single character from the alphabet as user input. Check if that
 * character is a vowel or consonant and print a suitable message. If the 
 * character is not an alphabet or a string with length greater than 1, print
 * an error message to the console.
 * HINT: use the charAt() method in the String class to find the ASCII code 
 * for a character. It should be in the range for the english alphabet (65 to 122).
 * Anything outside this range is not an alphabet.
 */
import java.util.*;
public class Alphabet {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char c = sc.nextLine().charAt(0);
    	if(c > 'z' || c < 'a'){
    		System.out.println("Not a letter");
    	}
    	else {
    		System.out.println("Is a letter");
    	}
	}
}