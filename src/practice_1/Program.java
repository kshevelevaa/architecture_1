package practice_1;

public class Program {
    public static void main(String[] args) {
        Game game = new Game();
        Thread ping = new Thread(new Thread1(game));
        Thread pong = new Thread(new Thread2(game));
        ping.start();
        pong.start();
    }
}
