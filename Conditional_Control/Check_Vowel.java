import java.util.Scanner;

public class Check_Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = scan.next().charAt(0);
        scan.close();

        if(ch>= '0' && ch<='9'){
            System.out.println("Invalid character. Please enter valid character");
        }
        
        else if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))){
            System.out.println("Invalid character. Please enter valid character");
        }
        
        else if(ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch =='U' || ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch =='u'){
            System.out.println("The " + ch + " is a Vowel");
        }
        else{
            System.out.println("The " + ch + " is not a Vowel");
        }

    }
}
