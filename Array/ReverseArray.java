/**
 * Write a program to reverse an array of integers
 */
public class ReverseArray {
	public static void main(String[] args) {
    	int[] initial = {1,4,5,6};
    	for(int num: initial){
    		System.out.print(num + " ");
    	}
    	System.out.println("");

    	int len = initial.length;
    	int[] two = new int[len];
    	for (int i = 0; i < len; i++){
    		two[i] = initial[len - 1 - i];
    	}
    	for(int num: two){
    		System.out.print(num + " ");
    	}
    	System.out.println("");
	}
}