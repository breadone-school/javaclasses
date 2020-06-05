package Game.Items;

public class wood extends Item {
    
    public wood() {
        ID = "wood";
        nID = 1;
        lootchance = 60;
        Classification = 0;

        idtable.put(nID, ID);
    }


}