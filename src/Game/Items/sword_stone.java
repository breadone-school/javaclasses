package Game.Items;

public class sword_stone extends Item {

    public sword_stone() {
        ID = "stone_sword";
        nID = 2;
        durability = 64;
        lootchance = 15;
        Classification = 2;
                    
        recepie[0] = 0;
        recepie[1] = 0;
        recepie[2] = 1;

        idtable.put(nID, ID);   
    }

}