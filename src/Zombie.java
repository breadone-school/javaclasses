import java.util.Random;

public class Zombie extends Monster {
    Random rnd = new Random();
    double SpecialMod = (rnd.nextDouble() * rnd.nextInt(5)); //0-1 * 0-5 special modifier

    Zombie(int health, int dmg) {
        super(health, dmg);
    }

    public double SpecialAttack() {
        return super.damageavg * SpecialMod;
    }

}