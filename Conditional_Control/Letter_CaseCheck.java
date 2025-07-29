import java.util.Scanner;

public class Letter_CaseCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = scan.next().charAt(0);

        scan.close();

        if(!Character.isLetter(ch)){
            System.out.println("Invalid character. Please enter valid character");
        }
        else if(Character.isUpperCase(ch)){
             System.out.println("The " + ch + " is a UpperCase Letter");
        }
        else{
             System.out.println("The " + ch + " is a LowerCase Letter");
        }
    }
    
}
