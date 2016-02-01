//Using Java, declare an int named month whose value represents a month. Your code should display the name of the month, based on the value of
//month,using the switch statement.

package feb1;

public class TheSwitch {
	
	public static void main (String[] args){
		
		int month = 8;
		
		String monthString;
		
		switch(month){
		
		case 1: monthString = "January";
		System.out.println(monthString);
		break;
		case 2: monthString = "February";
		System.out.println(monthString);
		break;
		case 3: monthString = "March";
		System.out.println(monthString);
		break;
		case 4: monthString = "April";
		System.out.println(monthString);
		break;
		case 5: monthString = "May";
		System.out.println(monthString);
		break;
		case 6: monthString = "June";
		System.out.println(monthString);
		break;
		case 7: monthString = "July";
		System.out.println(monthString);
		break;
		case 8: monthString = "August";
		System.out.println(monthString);
		break;
		case 9: monthString = "September";
		System.out.println(monthString);
		break;
		case 10: monthString = "October";
		System.out.println(monthString);
		break;
		case 11: monthString = "November";
		System.out.println(monthString);
		break;
		case 12: monthString = "December";
		System.out.println(monthString);
		break;
		
		default:
			System.out.println("You are not of this world!!");
			break;
		}
			
		}
		
		
	}

	

