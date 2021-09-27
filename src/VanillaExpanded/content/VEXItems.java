package VanillaExpanded.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class VEXItems implements ContentList {
    public static Item
        epicItem, insulator;

    @Override
    public void load(){
        insulator = new Item("item-insulator", Color.valueOf("d42400")){{
            localizedName = "Insulator";
            description = " An item that slows down the effects of electricity and heat";
            flammability = 0f;
        }};

    };
}
