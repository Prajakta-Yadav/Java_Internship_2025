        // Using Built in function find Max number from seven values
        
import java.util.Scanner;

public class MaxNumFromSeven{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int Max_num = Integer.MIN_VALUE;
        
        for(int Cnt =1; Cnt<=7; Cnt++){
            System.out.println("Enter " + Cnt + " Num: ");
            int num = scan.nextInt();
            
            if((Cnt ==1) || (num > Max_num)){
                Max_num = num;
            }
        }
        
        System.out.println("The Maximum number is: " + Max_num);
    }
}
