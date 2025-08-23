// Class Object

class car{
    String brand;
    String model;
    int year;
    
    void startEngine(){
        System.out.println("The " + brand + " " + model + " engine is starting.");
        
    }
    
    void honkHorn(){
        System.out.println("Beep beep! The horn of the " + brand + " is sounding.");
    }
}

public class main{
    public static void main(String[] args){
        car myCar = new car(); // create object here automatically call default constructor
        
        //set properties
        
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        //call method 
        
        myCar.startEngine();
        myCar.honkHorn();
        
        System.out.println(" ");
        System.out.println("Another object is created.....");
        System.out.println(" ");
        car newCar = new car();
        
        newCar.brand ="Honda";
        newCar.model ="Civic";
        newCar.year = 2022;
        
        
        newCar.startEngine();
        newCar.honkHorn();
    }
}
