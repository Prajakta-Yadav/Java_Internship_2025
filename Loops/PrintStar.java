import java.util.Scanner;

public class PrintStar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        
        int Cnt = scan.nextInt();
        while(Cnt >0){
            System.out.println(" * ");
            Cnt--;
        }
        
        System.out.println("==========================");
        
    }
}
