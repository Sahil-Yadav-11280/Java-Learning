package Multitasking;

public class SleepTest {
    public static void main(String[] args){
        try{
            System.out.println("Taking a nap...");
            Thread.sleep(2000);
            System.out.println("I'm awake!!");
        } catch(InterruptedException e){
                System.out.println("Hattt thaariiii");
        }
    }
}
