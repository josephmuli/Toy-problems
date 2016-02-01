package jan20;
import java.util.Arrays;
import java.lang.Math;

//THREESORT
//LANGUAGE: JAVA

//Create a ThreeSort class with a threeSort method and a main method.
//The threeSort method should contain the algorithm and the main method
//should be used for testing your algorithm. To make that easier, make the
//threeSort method static.

//Given three numbers as input, find the min, middle and max of the three.
//Return an array of the numbers in ascending order.
//Hint: to easily see your output, import java.util.Arrays
//and use the Arrays.toString(array) method to convert the Array to a string 
//and then log it using System.out.println();

//Example:
//ThreeSort.threeSort(9,4,6); // [4,6,9]
//ThreeSort.threeSort(3,2,1); // [1,2,3]


public class ThreeSort {

	public static int[] threeSort(int a,int b,int c){
		int min = Math.min(Math.min(a,b),c);
		int max = Math.max(Math.max(a, b), c);
		int mid = (a+b+c)-(max+min);
		int[] math = {min, mid, max};
		System.out.println("The min, mid and max respectively: "+Arrays.toString(math));
		
		
		//part 2
		int[] numbers={a,b,c}; 
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		return numbers;
	}
	
	public static void main (String[] args){
		
		ThreeSort tr = new ThreeSort();
		
		tr.threeSort(9, 4, 6);
		tr.threeSort(3, 2, 1);
		
	}

	}
