package practice_1;

public class Program {
    public static void main(String[] args) {
        Thread1 tread = new Thread1();
        Thread ping = new Thread(tread);
        Thread pong = new Thread(tread);
        ping.setName("ping");
        pong.setName("pong");
        ping.start();
        pong.start();
    }
}
