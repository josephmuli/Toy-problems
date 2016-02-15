// By definition, the first two numbers in the Fibonacci sequence are 0 and 1
//and each subsequent number is the sum of the previous two.
// For example, the first ten Fibonacci numbers are:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

//What to do:
// Write a Java function that accepts a number and returns the number at that position 
//in the fibonnaci sequence.
//in your solution, print out the first 15 numbers of the Fibonacci sequence.


package feb15;

public class Fibonacci {
	
	public int fibby(int x){
		
	int a = 0; 
	int b =1 ;
	int c; //c = a+b
	int count = 15;
	System.out.println(+a+" "+b);
	
	//for the position.
	for(int j=0; j<count; j++){
		if(j == x){
			System.out.println("The position is: "+x);
		}
	}
	
	for(int i=2; i<count;i++){
		c = a+b;
		a = b;
		b = c;
		
		System.out.print(" "+c);
		
	
	}
	return x;
	
	}
	
	
	
	public static void main(String[] args){
		
		Fibonacci fib = new Fibonacci();
		
		fib.fibby(8);
		
		
		
		}

}



//RECURSION

//package fibonacci;
//import java.util.Scanner;
//public class Fibonacci {
//	
//	public static int fibonacciSequence(int number)
//	{
//		if(number == 0){
//            return 0;
//        }
//		else if(number == 1 || number == 2){
//            return 1;
//        }
// 
//        return fibonacciSequence(number-1) + fibonacciSequence(number -2); //tail recursion
//	}
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the position of the number in the fibonnaci sequence: ");
//		int num = input.nextInt();
//		int position = num-1;
//		System.out.println(fibonacciSequence(position));
//		
//		System.out.println("\n\nFibonacci series upto " + num +" numbers : ");
//        //printing Fibonacci series upto number
//        for(int i=0; i<=position; i++){
//            System.out.print(fibonacciSequence(i) +" ");
//        }
//
//	}
//
//}


























