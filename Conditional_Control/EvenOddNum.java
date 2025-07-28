import java.util.Scanner;

public class EvenOddNum {

    // If else conditional Statement 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num = sc.nextFloat();
        sc.close();
        if(num == 0){
             System.out.println("The number " + num + " is a neutral.");
        }
        else if(num % 2 ==0){
            System.out.println("The number " + num + " is Even.");
        }
        else {
            System.out.println("The number " + num + " is Odd.");
        }
    }
}
