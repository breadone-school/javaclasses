package Game.Story;
import java.io.IOError;
import java.util.Scanner;
import Game.*;

public class choice {
    //Scanner read = new Scanner(System.in);

    public static int makechoice(String c1, String c2) {
        int choice = -1;
        System.out.println("1. " + c1 + "\n" + "2. " + c2 + "\n" + "3. open inventory" + "\n" + "4. stats");
        
        try {
            choice = Integer.parseInt(System.console().readLine());
        } catch (IOError e) {
            System.out.println("enter a number");
        }

        if (choice == 3) {
            DispInv();
            return choice;
        } else if (choice == 4) {
            System.out.println(Game.p1.Name + "'s health is at " + Game.p1.health);
            return choice;
        } else {
            return choice;
        }
    }

    public static int makechoice(String c1, String c2, String c3) {
        int choice = -1;
        System.out.println("1. " + c1 + "\n" + "2. " + c2 + "\n" + "3. " + c3 + "\n" + "4. open inventory" + "\n" + "5. stats");
        
        try {
            choice = Integer.parseInt(System.console().readLine());
        } catch (IOError e) {
            System.out.println("enter a number");
        }

        if (choice == 4) {
            DispInv();
            return choice;
        } else if (choice == 5) {
            System.out.println(Game.p1.health);
            return choice;
        } else {
            return choice;
        }
    }

    public static int makechoice(String c1, String c2, String c3, String c4) {
        int choice = -1;
        System.out.println("1. " + c1 + "\n" + "2. " + c2 + "\n" + "3. " + c3 + "\n" + c4 + "\n" + "5. open inventory" + "\n" + "6. stats");
        
        try {
            choice = Integer.parseInt(System.console().readLine());
        } catch (IOError e) {
            System.out.println("enter a number");
        }

        if (choice == 4) {
            DispInv();
            return choice;
        } else if (choice == 5) {
            System.out.println(Game.p1.health);
            return choice;
        } else {
            return choice;
        }
    }
    

    static void DispInv() {
        for (int i = 0; i < Game.p1.Inventory.length; i++) {
            if (Game.p1.Inventory[i] == -1) {
                continue;
            } else {
                System.out.println(Game.p1.Inventory[i]);
            }
        }
    }


}