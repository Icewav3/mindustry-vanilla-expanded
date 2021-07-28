package VanillaExpanded.Content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.graphics.Pal;
import mindustry.type.*;

public class VEXItems implements ContentList {
    public static Item 
        insulator;

    @Override
    public void load(){
        insulator = new Item("insulator", Color.valueOf("d42400")){{
            flammability = 0f;
        }};
    }
}
