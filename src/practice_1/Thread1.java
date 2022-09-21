package practice_1;

public class Thread1 implements Runnable {
    Game game;
    public Thread1(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        for (int i = 1; i<10; i++){
            game.ping();
        }
    }
}
