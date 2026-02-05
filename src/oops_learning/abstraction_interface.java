interface WifiNetwork{
    void ConnectToNetwork(String networkName);
}

@SuppressWarnings("unused")
abstract class Device{
    String brand;

    Device(String brand){
        this.brand = brand;
    }

    // Concrete method:
    void TurnOn() {
        System.out.println(brand + " device is powering up.");
    }

    // Abstract Method:
    abstract void Operate();
}

class Smartphone extends Device implements WifiNetwork{
    
    Smartphone(String brand){
        super(brand);
    }

    @Override
    void Operate(){
        System.out.println("Opening apps and checking Notifications...");
    }

    @Override
    public void ConnectToNetwork(String networkName){
        System.out.println("Connecting to " + networkName + "...");
        System.out.println("Successfully connected!");
    }

}

// MAIN class:
public class abstraction_interface {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung");
        
        myPhone.TurnOn();
        myPhone.ConnectToNetwork("VITBPL");
        myPhone.Operate();
    }
    
}
