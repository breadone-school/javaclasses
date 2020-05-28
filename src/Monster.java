import java.util.Random;

public class Monster {
    Random rnd = new Random();

    int health;
    int damageavg;

    Monster(int health, int damageSeed) {
        this.health = health;
        this.damageavg = damageSeed;
    }

    public int attack() {
        int dmgalt = rnd.nextInt(5);

        if (rnd.nextBoolean() == true) {
            return damageavg + dmgalt;
        } else {
            return damageavg - dmgalt;
        }
    }

}