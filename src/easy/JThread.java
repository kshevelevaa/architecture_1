package easy;

public class JThread  extends Thread{
    JThread(String name){
        super(name);
    }

    public void run(){

        System.out.println(currentThread().getName() + "started\n");
        int counter = 0;
        while (!isInterrupted()){
            System.out.println("loop " + counter);
            counter++;
        }
//        try{
//            Thread.sleep(500);
//        }
//        catch (InterruptedException e){
//            System.out.println("thread has been interrupted");
//        }
        System.out.println(currentThread() + "finish");
    }
}
