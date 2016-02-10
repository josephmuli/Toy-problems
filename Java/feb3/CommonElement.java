/* Using Java, come up with an algorithm to identify common elements in an array or 
numbers between two given arrays. Do NOT use any inbuilt methods.*/


package feb3;
import java.util.Scanner;

public class CommonElement {
	
	public static void main(String[] args) {
		
		int[] array1 = {10,2,3,4,8,16,5,6};
		int[] array2 = {1,6,7,8,9,16,1};
		
		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j< array2.length; j++){
				if(array1[i] == array2[j]){
					System.out.println(array1[i]);
				}
				}
			}
		}

	}


