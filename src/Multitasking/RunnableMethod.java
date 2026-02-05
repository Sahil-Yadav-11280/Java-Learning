package Multitasking;

class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Task is being executed...");
    }
}
public class RunnableMethod {
    public static void main(String[] args){
        MyTask task = new MyTask();
        Thread worker = new Thread(task);
        worker.start();
    }
}
