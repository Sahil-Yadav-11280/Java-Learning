package Multitasking;
// To create a thread using this method, first we create a class which inherits the Thread class
class Worker extends Thread{
    @Override
    public void run(){
        System.out.println("Worker is running...");
    }
}
public class ThreadLearn {
    public static void main(String[] args) {
        Worker myWorker = new Worker();
        myWorker.start();
    }
}
