import java.util.Scanner;

public class Divisible_by_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        float num = sc.nextFloat();

        if(num == 0){
            System.out.println("The number " + num + " is invalid. Please enter valid number");
        }
        else if(num % 7 ==0){
            System.out.println("The number " + num + " is Divisible by 7");
        }
        else {
            System.out.println("The number " + num + " is not Divisible 7");
        }
    }
}
