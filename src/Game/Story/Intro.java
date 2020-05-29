package Game.Story;
import java.util.Scanner;

public class Intro {
    public static void StartGame() {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("you awaken. dazed, aching, and hungry. The ground around you soaked in the frigid afternoon sun, the only sign of humanity is a cabin in the distance.");
        System.out.println("1. make your way to the cabin \n2. forage around for something to eat, then head to the cabin \n3. open inventory \n4. stats: ");
        choice = scan.nextInt();

        System.out.println(choice);
    }
}