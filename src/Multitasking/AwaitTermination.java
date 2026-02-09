package Multitasking;


//Await termination is join(), equivalent of threadpool. It pauses main thread until all tasks are performed

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Shutdown -> tells the manager to stop taking new tasks
// awaitTermination(time) -> blocks main thread, it waits until all tasks are done or time runs out
public class AwaitTermination {
    public static void main(String[] args) {
        ExecutorService manager = Executors.newFixedThreadPool(16);

        for(int i=0;i<10;i++){
            manager.execute(()->{
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
                System.out.println("Task finished on "+Thread.currentThread().getName());
            });
        }

        //1. Stop accepting new tasks:
        manager.shutdown();
        try{
            boolean finished = manager.awaitTermination(1, TimeUnit.HOURS);
            if(finished){
                System.out.println("All tasks are done, Main thread is moving...");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main Thread: Program about to end....");
    }
}
