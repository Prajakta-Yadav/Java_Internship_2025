import java.util.Scanner;

public class Day_Of_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Day Number: ");
        int Daynum = scan.nextInt();
        scan.close();

        String dayString;

        switch(Daynum) {
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
                dayString = "Invalid Day number";
            
        }
        System.out.println(dayString);
    }

}
