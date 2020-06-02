package Game;
import java.util.Random;

public class Player {
    Random rnd = new Random();

   public final String Name;
   public double health = 100;
   public double dmg = rnd.nextInt(20) + 15;
   public int armour = 1; //armour value less than 1
   public int CritChance = rnd.nextInt(25) + 10; //10 to 25 % crit chance
    
    Player(String name) {
        this.Name = name;
        invinit();
    }

    public double Attack() {
        if (rnd.nextInt(99) < CritChance) {
            return (dmg * 1.5 * armour);
        } else {
            return dmg;
        }
    }

     public int[] Inventory = new int[19]; //wow im using queues
     public int invq = 0;

     void invinit() {
        try {
            for (int i = 0; i < Inventory.length; i++) {Inventory[i] = -1;}
        } catch (Exception e) {
            System.out.println("error in initialising inventory.");
        }
    }

    public void invAdd(int itemid) {
        if (invq == Inventory.length) {
            System.out.println("inventory is full!");
        } else {
            Inventory[invq] = itemid;
            invq += 1;
        }
    }
}
