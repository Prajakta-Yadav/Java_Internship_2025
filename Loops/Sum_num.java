import java.util.Scanner;

public class Sum_num{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int cnt = 1, sum =0;
        
        while(true){
            System.out.print("Enter  " + cnt + " Number:");
            int num = scan.nextInt();
            scan.close();
            
            cnt++;
            
            if(num<=0){
                break;
            }
            
            sum = sum + num;
            
        }
        
        
        System.out.println(sum);
    }
}
