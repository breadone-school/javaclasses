package Game;
import java.util.Random;
import Game.Items.Item;

public class Player {
    Random rnd = new Random();

   public final String Name;
   public double health = 100;
   public double dmg = rnd.nextInt(20) + 15;
   public int armour = 1; //armour value less than 1
   public int CritChance = rnd.nextInt(25) + 10; //10 to 25 % crit chance
    
    Player(String name) {
        this.Name = name;
        Inv.init();
    }

    public double Attack() {
        if (rnd.nextInt(99) < CritChance) {
            return (dmg * 1.5 * armour);
        } else {
            return dmg;
        }
    }

    public static class Inv {
        static int[] Inventory = new int[19]; //wow im using queues
        private static int invq = 0;
        
        private static void init() {
            try {
                for (int i = 0; i < Inventory.length; i++) {Inventory[i] = -1;}
            } catch (Exception e) {
                System.out.println("error in initialising inventory.");
            }
        }

        public static void Add(int nID) {
            if (invq == Inventory.length) {
                System.out.println("inventory is full!");
            } else {
                Inventory[invq] = nID;
                invq += 1;
            }
        }

        /*public static void Add(String ID) {
            if (invq == Inventory.length) {
                System.out.println("inventory is full!");
            } else {
                int tempID = Item.idtable.get(ID);
            }
        }*/

        public static void Display() {
            System.out.println("your inventory has: ");  
            for (int i = 0; i < Inventory.length; i++) {
                if (Inventory[i] == -1) {
                    continue;
                } else { 
                    System.out.println(Item.idtable.get(Inventory[i])); 
                }
            }
        }
    }
}