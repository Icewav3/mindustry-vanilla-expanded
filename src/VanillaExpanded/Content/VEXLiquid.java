package VanillaExpanded.Content;

import mindustry.content.*;
import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.graphics.Pal;
import mindustry.content.Liquids;

public class VEXLiquid implements ContentList{
    public static Liquid
            supercoolant;

    @Override 
    public void load() {

        supercoolant = new Liquid("liquid-supercoolant", Color.valueOf("48cd9e")){{
            localizedName = "Supercoolant";
            description = "A fluid with extremely high thermal conductivity, perfect for cooling things that produce a lot of heat";
            heatCapacity = 1.8f; 
            temperature = 0.25f;
            effect = StatusEffects.freezing;
            lightColor = Color.valueOf("48cd7d").a(0.5f);
        }};
    }
}
