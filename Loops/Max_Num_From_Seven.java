import java.util.Scanner;

public class Max_Num_From_Seven{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        int Max_Num =0;
        
        for(int Cnt =1; Cnt <=7; Cnt++){
            
            System.out.println("Enter " + Cnt + " Num: ");
            int Amount = scan.nextInt();
            
            if((Cnt ==1) || (Amount > Max_Num)){
                Max_Num = Amount;
            }
        }
        
        System.out.println("Maximum Num is = " + Max_Num);
        
        scan.close();
    }
}
