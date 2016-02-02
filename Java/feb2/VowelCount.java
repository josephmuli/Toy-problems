
// VOWEL COUNT

// Using JAVA, create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm and the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

// Given an input of a String sentence, count the number of vowels that occur in the sentence.

// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 8
// vowelMap.get('i'); // 3
// vowelMap.get('e'); // 3
// vowelMap.get('u'); // 3

package feb2;
import java.util.*;



public class VowelCount {

	public static HashMap<Character, Integer> vowelCount(String input){
		
		//makes all characters lowercase.
		input.toLowerCase();
		//counters for the vowels:
		int ca = 0, ce = 0, ci = 0, co = 0, cu = 0;
		
		//loops through input to check for vowels and prints out "vowel added" when vowel is found
		for(int i =0; i<input.length(); i++){
			if(input.charAt(i) == 'a'){
				ca++;
			}else if(input.charAt(i) == 'e'){
				ce++;
			}else if(input.charAt(i) == 'i'){
				ci++;
			}else if(input.charAt(i) == 'o'){
				co++;
			}else if(input.charAt(i) == 'u'){
				cu++;
			}
			
			
		}
		//This one will just display characters with a key value of Integer and String object.
		/* for(int i =0; i<input.length(); i++){
			if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
				i++;
				System.out.println("Vowel added");
			}
			
		}*/
		
		// dummy hashmap to display when method is called, with counters set. 
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		hash.put('a', ca);
		hash.put('e', ce);
		hash.put('i', ci);
		hash.put('o', co);
		hash.put('u', cu);
		
	return hash;	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence");
		String str = scan.nextLine();
		
		
		// creating a Hashmap. 
		HashMap<Character, Integer> hashmap = new HashMap();
		
		// setting the object to method.
		hashmap = vowelCount(str);
		
		// Set will display the hashmap contents
		Set<?> st = hashmap.entrySet();
		
		//iterator will loop through the hashmap and display results
		 Iterator it = hashmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());

	}

}
}
