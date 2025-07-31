import java.util.Scanner;

public class PrintTable
{
	public static void main(String[] args) {
		System.out.println("Enetr a Number: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i =1; i<=10;i++){
		    System.out.println(i*num);
		}
	}
}
