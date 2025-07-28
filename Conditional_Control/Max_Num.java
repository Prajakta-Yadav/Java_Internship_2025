import java.util.Scanner;

public class Max_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        if(num1 == num2){
            System.out.println("The number " + num1 + " is equal to " + num2);
        }
        else if(num1 > num2) {
            System.out.println("The number " + num1 + " is greater than " + num2);
        }
        else {
            System.out.println("The number " + num2 + " is greater than " + num1);
        }
    }
}
