package Game;
import java.util.Random;
import Game.Items.*;
import Game.Story.*;

public class Game {
    public static Player p1;

    public static void main(String args[]) {
        Random rnd = new Random();
        Zombie z1 = new Zombie(75, 10);
        Item sword = new sword_stone();

        System.out.print("enter your character's name: ");
        p1 = new Player(System.console().readLine());

        //eg attack on player
        /*if (rnd.nextInt(99) < z1.SpecialChance) {
            p1.health -= z1.SpecialAttack();
        } else {
            p1.health -= z1.Attack();
        }*/
        
        Intro.StartGame();

    }
    
}
