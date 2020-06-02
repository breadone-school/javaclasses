package Game.Story;
import java.util.Scanner;
import Game.*;

public class Intro {
    public static void StartGame() {
        Scanner scan = new Scanner(System.in);
        int usrchoice = -1;
        System.out.println("you awaken. dazed, aching, and hungry. The ground around you soaked in the frigid afternoon sun, the only sign of humanity is a cabin in the distance.");
        System.out.println();
        usrchoice = choice.makechoice("make your way to the cabin", "forage around for something to eat, then head to the cabin");

        switch (usrchoice) {
            case 1:
                //TODO
                break;
            case 2:
                System.out.println("you find some meager berries. Stuffing them in your pockets, you begin the journey to the cabin.");
                //Player.invAdd(3);
                Game.p1.Inventory[0] = 3;
                break;
        }

    }
}