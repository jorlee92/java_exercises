/**
 * Write a program to find the sum of values in an integer array
 */
public class ArraySum {
	public static void main(String[] args) {
    	int[] arr = {1,4,6,2,5,7};
    	int total = 0;
    	for(int a: arr){
    		total+=a;
    	}
    	System.out.println(total);
	}
}