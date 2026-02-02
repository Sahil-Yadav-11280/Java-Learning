class Car{
    // class attributes
    String brand;
    int year;
    int speed;

    // 1. No-arg constructor:
    public Car(){
        brand = "Generic Brand";
        year = 2026;
        speed=0;
        System.out.println("Created a default car.");
    }
    
    // 2. Single argument constructor:
    public Car(String brandInput){
        brand = brandInput;
        year = 2026;
        speed=0;
        System.out.println("Created class with brand name: " + brand);
    }
    
    // 3. Multiple argument constructor:
    public Car(String brandInput , int yearInput){
        brand = brandInput;
        year = yearInput;
        speed=0;
        System.out.println("Created fully custom car!");
    }

    // Method definition:
    public void accelerate(int increase){
        if(increase>0){
            if (brand == "Nissan") {
                System.out.println("Nismo activated!!!!!");
            }
            speed+=increase;
            System.out.println("Accelerating. Current speed: " + speed);
        }
        else{
            System.out.println("Invalid acceleration.");
        }
    }

    public void applyBrakes(int decrease){
        if(decrease <= speed){
            speed-=decrease;
            System.out.println("Applying brakes. Current speed: " + speed);
        }
        else{
            System.out.println("Current speed is less than decrement!");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.accelerate(120);
        Car car2 = new Car("Nissan");
        car2.accelerate(340);
        Car car3 = new Car("Honda" , 2018);
        car3.accelerate(150);
    }
}
