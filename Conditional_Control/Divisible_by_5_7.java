import java.util.Scanner;

public class Divisible_by_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        float num = sc.nextFloat();

        if(num == 0){
            System.out.println("The number " + num + " is invalid. Please enter valid number");
        }
        else if(num % 5 == 0 && num % 7 ==0){
            System.out.println("The number " + num + " is Divisible by 5 & 7");
        }
        else if(num % 5 ==0){
            System.out.println("The number " + num + " is only Divisible by 5");
        }
        else if(num % 7 ==0){
            System.out.println("The number " + num + " is only Divisible by 7");
        }
        else {
            System.out.println("The number " + num + " is not Divisible by 5 & 7");
        }
    }
}
