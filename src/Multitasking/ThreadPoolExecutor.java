package Multitasking;
import java.util.concurrent.*;

public class ThreadPoolExecutor{
    public static void main(String[] args){
        ExecutorService manager = Executors.newFixedThreadPool(16);

        for(int i=0;i<100;i++){
            int taskId = i;
            manager.execute(()->{
               System.out.println("Task "+taskId+" is running on "+Thread.currentThread().getName());
               try{Thread.sleep(100);}catch (Exception e){};
            });
        }

        manager.shutdown();
        System.out.println("Main thread finished submitting tasks!");
    }
}
