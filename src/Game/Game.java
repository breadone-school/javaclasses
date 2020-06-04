package Game;
import Game.Items.*;
import Game.Story.*;

public class Game {
    public static Player p1;
    public static Item STONE = new stone();
    public static Item BERR = new berries();
    public static Item SWORD_STONE = new sword_stone();
    public static Item WOOD = new wood();
    

    public static void main(String args[]) {
        System.out.print("enter your character's name: ");
        p1 = new Player(System.console().readLine());

        Intro.StartGame();
    }
}
