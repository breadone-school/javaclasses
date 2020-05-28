import java.util.Random;

public class Player {
    Random rnd = new Random();

    String Name;
    int health = 100;
    int dmg = rnd.nextInt(20) + 5;
    
    Player(String name) {
        this.Name = name;
    }

    public int Attack() {
        if (rnd.nextInt(50) > 35) {
            return (dmg * 2);
        } else {
            return dmg;
        }
    }

    

}
