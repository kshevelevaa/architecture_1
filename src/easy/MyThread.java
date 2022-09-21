package easy;

public class MyThread implements Runnable{

    private boolean isActive;

    void disable(){
        isActive = false;
    }

    MyThread(){
        isActive = true;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started\n");
        int counter = 0;
        while(isActive){
            System.out.println("loop " + counter);
            counter++;
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("thread has been interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finish");
    }
}
