import java.util.Scanner;

public class Positive_Negative_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        float num = sc.nextFloat();

        if(num == 0){
            System.out.println("The number " + num + " is neutral(not positive or negative)");
        }
        else if(num > 0){
            System.out.println("The number " + num + " is Positive");
        }
        else {
            System.out.println("The number " + num + " is Negative");
        }
    }
}
