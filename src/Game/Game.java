package Game;
import java.util.Random;
import Game.Items.*;

public class Game {

    public static void main(String args[]) {
        Random rnd = new Random();
        System.out.print("enter your character's name: ");
        Player p1 = new Player(System.console().readLine());
        Zombie z1 = new Zombie(75, 10);
        Item sword = new sword_stone();

        //eg attack on player

        if (rnd.nextInt(99) < z1.SpecialChance) {
            p1.health -= z1.Attack();
        } else {
            p1.health -= z1.SpecialAttack();
        }


        System.out.println(p1.health);
        System.out.println(sword.ID);

    }
    
}
