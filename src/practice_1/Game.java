package practice_1;

public class Game {
    String word="ping";
    public synchronized void ping(){
        while (word.equals("ping")==true) {
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
        while (word.equals("ping")==false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        word = "pong";
        System.out.println(word);
        notify();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
