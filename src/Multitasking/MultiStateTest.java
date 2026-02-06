package Multitasking;

public class MultiStateTest {
    public static void main(String[] args){
        Thread t4 = new Thread(() -> {
           System.out.println("Thread 4: Starting heavy work!!");
           try{
               Thread.sleep(3000);
           } catch(InterruptedException e){
               System.out.println("Issued found: Thread 4");
           }
           System.out.println("Thread 4: Heavy task finished");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2: Waiting for thread 4 to finish its work...");
            try{
                t4.join();
            } catch(InterruptedException e) {
                System.out.println("Issued found: Thread 2");
            }
            System.out.println("Thread 2: Thread 4 has finished task and now I can do my work...");
        });

        Thread t3 = new Thread(()->{
           System.out.println("Thread 3: Independent Thread -> free to do its work!");
        });

        t4.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread: Also free to do my work!!");
    }
}
