package VanillaExpanded.Content;

import mindustry.content.*;
import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.graphics.Pal;
import mindustry.content.Liquids;

public class VEXLiquid implements ContentList{
    public static Liquid
            explosiveRocketBeam, supercoolant, epicWater;

    @Override 
    public void load() {

        explosiveRocketBeam = new Liquid("ehe", Color.valueOf("596ab8")){{
            heatCapacity = 0.4f;
            alwaysUnlocked = true;
            effect = StatusEffects.wet;
        }};

        supercoolant = new Liquid("liquid-supercoolant", Color.valueOf("48cd9e")){{
            heatCapacity = 1.8f; 
            temperature = 0.1f; 
            effect = StatusEffects.freezing;
            lightColor = Color.valueOf("48cd7d").a(0.5f);
        }};

        epicWater = new Liquid("epicwater", Color.valueOf("48cd9e")){{
            heatCapacity = 1.8f;
            temperature = 0.1f;
            effect = StatusEffects.wet;
            
        }};

    }
}
