import java.util.Random;

public class Player {
    Random rnd = new Random();

    String Name;
    int health = 100;
    int dmg = rnd.nextInt(20) + 5;
    int CritChance = rnd.nextInt(49) + 1;
    
    Player(String name) {
        this.Name = name;
    }

    public int Attack() {

        if (rnd.nextInt(99) < CritChance){
            return (dmg * 2);
        } else {
            return dmg;
        }
    }

}