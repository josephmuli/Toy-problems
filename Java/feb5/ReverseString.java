// Write a java algorithm to reverse a string, and print it's output
// For instance, "CodeNinja" returns: 'ajniNedoC'

package feb5;
import java.util.*;
//imported String buffer class.

public class ReverseString {
	
	public StringBuffer reverse(String a){
	
		StringBuffer rev = new StringBuffer(a).reverse();
		return rev;
	}
	
	
public static void main(String[] args){
	ReverseString rv = new ReverseString();
	
	System.out.println(rv.reverse("killer"));
}

}

/*
 * David's method.
public static void main(String[] args){
	System.out.println("String");
	
	Scanner sc = new Scanner(System.in);
	String word = sc.next();
	for(int i=word.length(); i>=0; i-- ){
		Char ch = word.charAt(i-1);
		System.out.println(ch);
	}
	}
}
*/

