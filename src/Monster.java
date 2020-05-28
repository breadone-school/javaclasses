import java.util.Random;

public class Monster {
    Random rnd = new Random();

    int health;
    int damageavg;

    Monster(int health, int damageSeed) {
        this.health = health;
        this.damageavg = damageSeed;
    }

    public int Attack() {
        int dmgalt = rnd.nextInt(5); //damage to increase/decrease by (+/- 5)

        if (rnd.nextBoolean() == true) { //decide whether alteration is +ve or -ve
            return -(damageavg + dmgalt);
        } else {
            return -(damageavg - dmgalt);
        }
    }

}