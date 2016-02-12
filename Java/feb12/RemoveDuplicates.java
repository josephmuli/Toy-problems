// Using Java, remove duplicate characters in a given string keeping only the first occurrences. 
// For example, if the input is ‘tree traversal’ the output will be "tre avsl". Enjoy:-)

package feb12;

public class RemoveDuplicates {
	
	public static void main(String[] args){
		
		RemoveDuplicates rd = new RemoveDuplicates();
		
		rd.removeDups("tree traversal");
		
	}
	
	public static void removeDups(final String input){
		//create a string builder n reference to 
		final StringBuilder res = new StringBuilder();
		//loop through input for char-set
		for(int i=0; i<input.length(); i++){
			String currentChar = input.substring(i, i+1);
			
			if(res.indexOf(currentChar) < 0){ //checks for presence
				res.append(currentChar);
			}
		}
		System.out.println(res);
	}

}
