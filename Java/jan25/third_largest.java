// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5,
//but the output should be world because it appeared as the last 5 letter word in the array. 
//If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are
//all 5 letters long, so return the last one. The array will have at least three strings and each string will 
//only contain letters.

// use the main method only for calling the function where your logic lies. :-)

package jan25;

import java.util.Arrays;

public class third_largest {
	
	public String ThirdGreatest(String[] strArr){
		
		int[] words = new int[strArr.length];
		for(int x=0;x<strArr.length;x++){   // loops through array elements(length is number of items)
			words[x]= strArr[x].length(); 	//specifies length of array since elements could be any number
		}
		Arrays.sort(words); 				// sorts in ascending order to ease identifying largest
		String ThrdLargest = "";	
			for(int y=0;y<strArr.length; y++){
			if(strArr[y].length() == words[words.length-3]){
				ThrdLargest = strArr[y];
			}
		}

		return ThrdLargest;
	}

	public static void main(String[] args){
		
		third_largest third = new third_largest();
		
		String[] strArr = {"mwangi", "mainaa","mainia", "kalamashaka", "eat","food"};
		
		
		System.out.println(third.ThirdGreatest(strArr));
		
		
		
	}
}
