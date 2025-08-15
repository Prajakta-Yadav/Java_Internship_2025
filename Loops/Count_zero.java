import java.util.Scanner;

public class Count_zero{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = scan.nextInt();
        scan.close();   
        
        int zero_count = 0;
        
            while (num > 0) {
                int digit = num % 10; // Get the last digit
                    if (digit == 0) {
                        zero_count++;
                    }
                    num /= 10; // Remove the last digit
            }
        
            System.out.println(zero_count); 
       
      }
}
