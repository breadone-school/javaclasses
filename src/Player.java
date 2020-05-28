import java.util.Random;

public class Player {
    String Name;
    int health = 100;
    int dmg;
    
    Player(String name) {
        this.Name = name;
    }

    public int Attack() {
        Random rnd = new Random();

        if (rnd.nextInt(50) > 35) {
            return (dmg * 2);
        } else {
            return dmg;
        }
    }


}
