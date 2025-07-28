import java.util.Scanner;
 
//Arithmetic Operator

public class AddTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two num:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        sc.close();
        float Sum = num1 + num2;
        System.out.println(Sum);

 }

}
