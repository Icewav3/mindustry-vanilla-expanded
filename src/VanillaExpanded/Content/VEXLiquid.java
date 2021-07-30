package VanillaExpanded.Content;

import mindustry.content.StatusEffects;
import mindustry.ctype.ContentList;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class VEXLiquid implements ContentList{
    public static Liquid supercoolant;

    @Override 
    public void load(){
        //Supercoolant 
        supercoolant = new Liquid("supercoolant", Color.valueOf("48cd9e")){{
            heatCapacity = 1.8f; 
            temperature = 0.1f; 
            effect = StatusEffects.freezing;
            lightColor = Color.valueOf("48cd7d").a(0.5f);
        }};

    };
}
