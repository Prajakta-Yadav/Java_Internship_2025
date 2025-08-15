import java.util.Scanner;

public class Sum_of_Digit{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = scan.nextInt();
        scan.close();   
        
        int sum = 0;
        
            while (num > 0) {
                int digit = num % 10; // Get the last digit
                    sum = sum + digit;
                    num /= 10; // Remove the last digit
            }
        
            System.out.println(sum); 
       
      }
}
