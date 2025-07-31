import java.util.Scanner;

public class PrintDay
{
	public static void main(String[] args) {
	    
	    
		System.out.print("Enter day num: ");
		String dayString = " ";
		
		Scanner scan = new Scanner(System.in);
		int Day = scan.nextInt();
		
		switch(Day){
		    case 1: 
		        dayString = "Monday";
		        break;
		        
		     case 2: 
		        dayString = "Tuesday";
		        break;
		        
		     case 3: 
		        dayString = "Wednesday";
		        break;
		        
		     case 4: 
		        dayString = "Thursday";
		        break;
		        
		     case 5: 
		        dayString = "Friday";
		        break;
		        
		     case 6: 
		        dayString = "Saturday";
		        break;
		        
		      case 7: 
		        dayString = "Sunday";
		        break;
		        
		      default: 
		        System.out.println("Invalid Day Num");
		        
	    	}
		
	        System.out.println(dayString);
	}
}
