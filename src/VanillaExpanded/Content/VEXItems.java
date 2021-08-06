package VanillaExpanded.Content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.graphics.Pal;
import mindustry.type.*;

public class VEXItems implements ContentList {
    public static Item
        epicItem, insulator;

    @Override
    public void load(){
        insulator = new Item("item-insulator", Color.valueOf("d42400")){{
            flammability = 32f;
        }};

    };
}
