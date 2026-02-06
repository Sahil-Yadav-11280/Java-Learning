package Multitasking;

public class StateTest {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            try{
                System.out.println("Thread is going to sleep...");
                Thread.sleep(2000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        System.out.println("State before start: " + t1.getState());
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e){

        }
        System.out.println("State after start: " + t1.getState());
    }
}
