package Multitasking;

class PizzaFranchise{
    static int totalPizzaSold =0;
    public static synchronized void addSale(){
        totalPizzaSold++;
    }
}

public class StaticSynchronization {
    public static void main(String[] args){
        PizzaFranchise dominosNYC = new PizzaFranchise();
        PizzaFranchise dominosLA = new PizzaFranchise();

        Thread t1 = new Thread(()->{
           for(int i=0;i<10000;i++) dominosNYC.addSale();
        });

        Thread t2 = new Thread(()->{
           for(int i=0;i<10000;i++) dominosLA.addSale();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e){}
        System.out.println("Total Sales: "+PizzaFranchise.totalPizzaSold);
    }
}
