package VanillaExpanded.Content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.graphics.*;

public class VEXBullets implements ContentList{
    public static BulletType 
        supercoolantShot, heavySupercoolantShot;

        public void load(){
            supercoolantShot = new LiquidBulletType(VEXLiquid.supercoolant){{
                drag = 0.01f;
            }};

            heavySupercoolantShot = new LiquidBulletType(VEXLiquid.supercoolant){{
                lifetime = 49f;
                speed = 4f;
                knockback = 1.3f;
                puddleSize = 8f;
                orbSize = 4f;
                drag = 0.001f;
                ammoMultiplier = 0.4f;
                statusDuration = 60f * 8f;
                damage = 0.2f;
            }};
        }
}