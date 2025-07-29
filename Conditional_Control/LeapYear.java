import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int Year = scan.nextInt();
        scan.close();
        
        if(Year < 1000 || Year >9999){
            System.out.println("Enter valid Year");
        }
        else if(Year % 4 ==0){
            System.out.println("The " + Year + " is a Leap year");
        }
        else{
            System.out.println("The " + Year + " is a not Leap year");
        }
    }
}
