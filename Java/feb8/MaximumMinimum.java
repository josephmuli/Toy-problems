// Using java solve the problem below:
// Given an array of integers, find the maximum and minimum of this array.
// create a variable to hold the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest

package feb8;
import java.util.*;


public class MaximumMinimum {
	//gets maximum value in array
	public static int maxValue(int[] x){
		int max = x[0];
		for(int i =0; i<x.length;i++){
		if(x[i]> max){
			max = x[i];
		}
			
		}
		return max;}
	
	//gets min value in array
	public static int minValue(int[]x){
		int min = x[0];
		for(int j =0; j<x.length;j++){
			if(x[j]<min){
				min = x[j];
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		
		int[] array = {1,2,3,4,5};
		MaximumMinimum mm = new MaximumMinimum();
		mm.maxValue(array);
		System.out.println("Max value be: "+mm.maxValue(array));
		System.out.println("Min Value be: "+mm.minValue(array));
		
	
}
	
	
}




	
	

