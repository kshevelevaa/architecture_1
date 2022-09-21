package practice_1;

public class Thread1 implements Runnable {
    String word="ping";

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            if (Thread.currentThread().getName().equals("ping")) {
                ping();
            }
            else {
                pong();
            }
        }
    }

    public synchronized void ping(){
        while (word.equals("ping")) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        word = "ping";
        System.out.println(word);
        notify();
    }

    public synchronized void pong(){
        while (!word.equals("ping")) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        word = "pong";
        System.out.println(word);
        notify();
    }
}
