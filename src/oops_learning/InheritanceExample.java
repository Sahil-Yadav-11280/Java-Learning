@SuppressWarnings("unused")
class Pirate{
    private String name;
    Pirate(String name){
        this.name = name;
        System.out.println("[A] A pirate has been born");
    }

    void exist(){
        System.out.println(this.name + " exists in world!");
    }

    void occupy(){
        System.out.println("This pirate occupies huge territory");
    }

    public String getName(){
        return this.name;
    }
}

interface Swordsman{
    void swordAttack();
}

interface Haki{
    void armamentHaki();
    void observationHaki();
    void conquerorsHaki();
}

class Yonko extends Pirate implements Swordsman , Haki{
    private String crew;
    public Yonko(String name , String crew){
        super(name);
        this.crew = crew;
    }

    public String getCrew(){
        return this.crew;
    }

    @Override
    void exist(){
        System.out.println(this.crew + " crew exists");
    }

    @Override
    public void swordAttack(){
        System.out.println(super.getName() + " attacks with a sword");
    }

    @Override
    public void armamentHaki(){
        System.out.println(super.getName() + " uses armament Haki to strengthen his sword");
    }

    @Override
    public void observationHaki(){
        System.out.println(super.getName() + " uses advanced observation haki to know enemy location and their future plan");
    }

    @Override
    public void conquerorsHaki(){
        System.out.println("Yonko uses Conqueror's Haki");
    }

    void occupyTerritory(){
        super.occupy();
    }

    void originalExist(){
        super.exist();
    }
}

@SuppressWarnings("unused")
class Shanks extends Yonko{
    private long bounty;

    public long getBounty(){
        return this.bounty;
    }

    public void setBounty(long value){
        if(value > this.bounty){
            this.bounty = value;
            System.out.println("Bounty updated succesfully!");
        }
        else{
            System.out.println("Bounty can't be updated!");
        }
    }

    public Shanks(){
        super("Shanks" , "Red Hair's");
        this.bounty = 4048900000L;
    }
    public Shanks(long bounty) {
        super("Shanks", "Red Hair's");
        this.bounty = bounty;
    }

    @Override
    public void swordAttack(){
        System.out.println("His sword is Gryphon." + super.getName() + " strikes the sword once and even the strongest back down");
    }

    @Override
    public void conquerorsHaki(){
        System.out.println(super.getName() + " has greatest haki, it trembles even the admiral's. Its guranteed hit effect is upto 15Km");
    }

    void bountyDisplay(){
        System.out.println("The most fearsome pirate aomng the Yonko's. The one who possesses the greatest haki, Red Haired Shanks'. His current bounty is...");
        System.out.println(this.bounty + " Berry");
    }

    void arrival(){
        System.out.println(super.getCrew() + " crew has shown up!!!!!");
        this.bountyDisplay();

        this.observationHaki();
        this.armamentHaki();
        this.conquerorsHaki();

        this.swordAttack();

        super.occupyTerritory();
    } 

    void arrival(String location){
        System.out.println(super.getCrew() + " crew has shown up at " + location + "!!!!!");
        this.bountyDisplay();

        this.observationHaki();
        this.armamentHaki();
        this.conquerorsHaki();

        this.swordAttack();

        super.occupyTerritory();
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Shanks shanks = new Shanks();
        shanks.originalExist();
        shanks.arrival();
    }
}