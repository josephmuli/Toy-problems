// Given a number, find the next higher number using only the digits 
//in the given number. For example if the given number is 1508, 
//the next higher number with same digits is 8510.

package feb10;
import java.util.*;

public class nextHighestNumber {
	public static void main(String[] args){
		
		int x = 1080;
		char[] y = String.valueOf(x).toCharArray();
		Arrays.sort(y);
		for(int i = y.length-1; i>=0;i--){
			
			System.out.print(y[i]);
		}
		
		
		//System.out.println("The largest value be: "+y);
			
		}
	}


