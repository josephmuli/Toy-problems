// Given an array of integers (positive and negative) find the largest continuous sum.

package feb16;

public class LargestContinuousSum {

	public static void main(String[] args){
		int[] a = { 4, -12, 3 ,-2, 9, 3, -1 };
		int count = 0, max = 0;{

		for (int i = 0; i < a.length; i++) {
		    if (a[i] >= 0) {
		        count+=a[i];
		    } else {
		        if (count >= max) {
		            max = count;
		        }
		        count = 0;
		    }
		}

		System.out.println(max);
	}
		}

}
