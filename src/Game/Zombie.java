package Game;
import java.util.Random;

public class Zombie extends Monster {
    private Random rnd = new Random();
    int SpecialChance = rnd.nextInt(25);
    double SpecialMod = (rnd.nextDouble() * rnd.nextInt(5)); //0-1 * 0-5 special modifier

    Zombie(int health, int dmg) {
        super(health, dmg);
    }

    public double SpecialAttack() {
        return super.damageavg * SpecialMod; //special bypasses armour
    }

    

}