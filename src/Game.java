import java.util.Random;

public class Game {
    Random rnd = new Random();
    public static void main(String args[]) {
        System.out.print("enter your character's name: ");
        Player p1 = new Player(System.console().readLine());

        Monster z1 = new Zombie(75, 10);

        //eg attack on player

        
        p1.health -= z1.Attack();


    }
    
}
