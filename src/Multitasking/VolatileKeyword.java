package Multitasking;

class TaskRunner{
    volatile boolean stopLoop = false;
    public void runTask(){
        while(!stopLoop){}
        System.out.println("Loop stopped!");
    }
}

public class VolatileKeyword {
    public static void main(String[] args) throws InterruptedException{
        TaskRunner taskRunner = new TaskRunner();
        Thread t1 = new Thread(()-> taskRunner.runTask());
        t1.start();
        Thread.sleep(3000);
        System.out.println("Main Thread: Time to Stop!");
        taskRunner.stopLoop=true;
    }
}
