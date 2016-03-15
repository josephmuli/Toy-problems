 package march15;
//
//	  //Write a function that accepts an array of random integers and an integer n. 
//	  //Determine the number of times where two integers in the array have the difference of n.
//	  //  
//	  //  e.g: f(4, [1, 1, 5, 6, 9, 16, 27]) // 3 (Due to 2x [1, 5], and [5, 9])
//	  //f(2, [1, 1, 3, 3]) // 4 (Due to 4x [1, 3])
//	  //    
//	  //  parameter includes an array[integers] and an integer n
//
	  public class RandomInteger {

	  	public static void main(String[] args){
	  		int[] array = {1, 1, 5, 6, 9, 16, 27};
	  		System.out.println(random(array, 4));
	  	}
	  	
	  	public static int random(int[] array, int n){
	  		
	  		
	  		int counter = 0;
	  		
	  		for(int i =0; i<array.length; i++){
	  			for(int k=i; k<array.length; k++){
	  				if(i==k){
	  					continue;
	  				}else{
	  					if(Math.abs(array[i]-array[k])==n){
	                          counter++;
	                      }
	  				}
	  				
	  			}
	  		}
	  		
	  		
	  		return counter;
	  	}


	  }

		
		
