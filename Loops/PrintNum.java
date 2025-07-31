import java.util.Scanner;

 class PrintNum
{
	public static void main(String[] args) {
		System.out.println("Enter the two number");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int times  = scan.nextInt();
		
		for(int i=1; i<=times; i++){
		    System.out.println(num);
		  
		}
	}
}
