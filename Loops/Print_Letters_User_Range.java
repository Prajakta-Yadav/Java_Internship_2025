import java.util.Scanner;

public class Print_Letters_User_Range{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start letter: ");
        char Sch = scan.next().charAt(0);
        
        System.out.print("Enter end letter: ");
        char Ech = scan.next().charAt(0);
        
        System.out.println("Printing " + Sch + " to " + Ech + " = ");
        
        if(Sch <= Ech){
            while(Sch <= Ech){
                System.out.println(Sch);
                Sch++;
                
            }
        }
        
        else{
            while(Sch>=Ech){
                System.out.println(Sch);
                Sch--;
            }
        }
       
    }
}
