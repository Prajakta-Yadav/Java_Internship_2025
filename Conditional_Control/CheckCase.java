import java.util.Scanner;


public class CheckCase
{
	public static void main(String[] args) {
		System.out.print("Enter a Letter: ");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if(ch >= 'A' && ch<='Z'){
		    System.out.println("Given letter " + ch + " is UpperCase");
		}
		
		else if (ch >='a' && ch<='z'){
		    System.out.println("Given letter " + ch + " is LowerCase");
		}
		
		else if(ch >=0 && ch<=9){
		    System.out.println("Given letter " + ch + " is digit");
		}
		else{
		    System.out.println("Given letter " + ch + " is Special Symbol");
		}
	}
}
