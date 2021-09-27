package VanillaExpanded.content;

import mindustry.ctype.*;
import mindustry.entities.bullet.*;

public class VEXBullets implements ContentList{
    public static BulletType 
        supercoolantShot, heavySupercoolantShot, autoCannonDense, autoCannonThorium, autoCannonSurge;

        public void load(){
            supercoolantShot = new LiquidBulletType(VEXLiquid.supercoolant){{
                drag = 0.01f;
            }};
            //unused atm
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
            //Autocannon
            autoCannonDense = new BasicBulletType(12f, 80, "bullet"){{
                hitSize = 3;
                width = 7f;
                height = 24f;
                collidesGround =  false;
                ammoMultiplier = 1f;
                knockback = 2f;
            }};
            autoCannonThorium = new BasicBulletType(12f, 150, "bullet"){{
                hitSize = 3;
                width = 9f;
                height = 24f;
                collidesGround =  false;
                ammoMultiplier = 1f;
                knockback = 4f;
                pierce = true;
                pierceCap = 3;
            }};
            autoCannonSurge = new BasicBulletType(12f, 120, "bullet"){{
                hitSize = 3;
                width = 7f;
                height = 24f;
                collidesGround =  false;
                ammoMultiplier = 1f;
                knockback = 4f;
                pierce = true;
                pierceCap = 3;
                splashDamage = 100;
                splashDamageRadius = 3f;
                lightning = 3;
                lightningLength = 15;
            }};
        }
}