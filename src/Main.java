public class Main {
    
    public static void main(String args[]) {
        System.out.print("enter your character's name: ");
        Player p1 = new Player(System.console().readLine());

        Monster test = new Monster(75, 10);

        //eg attack on player
        p1.health += test.Attack();



    }
}