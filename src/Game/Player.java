package Game;
import java.util.Random;

public class Player {
    Random rnd = new Random();

    final String Name;
    double health = 100;
    double dmg = rnd.nextInt(20) + 5;
    int armour = 1; //armour value less than 1
    int CritChance = rnd.nextInt(25) + 10; //10 to 25 % crit chance
    
    Player(String name) {
        this.Name = name;
    }

    public double Attack() {
        if (rnd.nextInt(99) < CritChance) {
            return (dmg * 1.5 * armour);
        } else {
            return dmg;
        }
    }

    public String[] Inventory = new String[19];

}
