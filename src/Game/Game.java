package Game;
import Game.Story.*;

public class Game {
    public static Player p1;

    public static void main(String args[]) {
        System.out.print("enter your character's name: ");
        p1 = new Player(System.console().readLine());

        Intro.StartGame();
    }
}
