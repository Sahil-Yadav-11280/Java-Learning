class car{
    String brand;
    // using static final to define constants
    static final int wheel_count = 4;
    car(String br){ brand=br; }
}

// Passing reference type data in methods:
public class ref {

    // 1. modifying the object (alterations reflect on actual object):
    public static void paintCar(car c){
        c.brand = "Ferrari";
    }

    // 2. Reassigning the reference (original object remains intact):
    public static void swapCar(car c){
        c = new car("BMW");
    }

    public static void main(String[] args) {
        car myCar = new car("Toyota");
        System.out.println("Original: " + myCar.brand);

        paintCar(myCar);
        System.out.println("After paint: " + myCar.brand);
        
        swapCar(myCar);
        System.out.println("After swapCar: " + myCar.brand);
    }
}
