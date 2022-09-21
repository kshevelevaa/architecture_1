package practice_1;

public class Thread2 implements Runnable {

    Game game;

    public Thread2(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            game.pong();
        }
    }
}
