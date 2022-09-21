package easy;

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread started \n");
//        №1
//        easy.JThread t = new easy.JThread("thread");
//        t.start();
//        try{
//            t.join();
//        }
//        catch (InterruptedException e){
//            System.out.printf("%s has been interrupted", t.getName());
//        }

//        #2
//        Thread myThread = new Thread(new easy.MyThread(), "easy.MyThread");
//        myThread.start();

//        #3
//            easy.MyThread myThread = new easy.MyThread();
//            new Thread(myThread, "easy.MyThread").start();
//            try{
//                Thread.sleep(2200);
//                myThread.disable();
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e){
//                System.out.println("thread has been interrupted");
//            }

//        #4
//        easy.JThread t = new easy.JThread("thread");
//        t.start();
//        try{
//            Thread.sleep(10);
//            t.interrupt();
//        }
//        catch (InterruptedException e){
//            System.out.println("thread has been interrupted");
//        }
        System.out.println("main thread finished");
    }
}
