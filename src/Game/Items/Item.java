package Game.Items;
import java.util.HashMap;

public class Item {
    public static String ID;
    public int nID = 0;
    public int durability;
    int lootchance;

    //public static Map<Integer, String> idtable = new Map<>();
    public static HashMap<Integer, String> idtable = new HashMap<>();
    public int[] recepie = new int[9];
    
    public static final Item STONE = new stone();
    public static final Item BERR = new berries();
    public static final Item SWORD_STONE = new sword_stone();
    public static final Item WOOD = new wood();

}