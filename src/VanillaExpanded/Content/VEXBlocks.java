package VanillaExpanded.Content;

import mindustry.graphics.Pal;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.production.*;
import mindustry.world.draw.*;
import mindustry.entities.bullet.*;
import mindustry.content.Bullets;
import mindustry.gen.Sounds;

import static mindustry.type.ItemStack.*;

public class VEXBlocks implements ContentList{
    public static Block 
    
    //Crafting Blocks
        insulatorPress,
    //Liquid Makers
        supercoolantRefinery, exampleWaterThing,
    //Defense
        insulatorWall, insulatorWallLarge, forceDome,
    //Turrets
        heimdall, heimdall2, heimdall3
    //Reserve
        
        ;

    @Override
    public void load(){
        int wallHealthMultiplier = 4;
        //Crafters
        supercoolantRefinery = new LiquidConverter("supercoolant-refinery"){{
            requirements(Category.crafting, with(Items.surgeAlloy, 25, Items.silicon, 30, Items.titanium, 120));
            outputLiquid = new LiquidStack(VEXLiquid.supercoolant, 0.2f);
            health = 320;
            craftTime = 120f;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;
            drawer = new DrawMixer();

            consumes.power(3f);
            consumes.item(VEXItems.insulator);
            consumes.liquid(Liquids.cryofluid, 0.2f);
        }};

        insulatorPress = new GenericCrafter("insulator-press"){{
            requirements(Category.crafting, with(Items.metaglass, 30, Items.plastanium, 50, Items.titanium, 120));
            outputItem = new ItemStack(VEXItems.insulator, 1);
            health = 120;
            craftTime = 120f;
            size = 2;
            hasItems = true;
            hasPower = true;
            solid = true;
            consumes.items(with(Items.silicon, 1, Items.plastanium, 1));
            consumes.power(1f);
        }};

        //Defense
        
        forceDome = new ForceProjector("force-dome"){{
            requirements(category.effect, with(Items.surgeAlloy, 250, Items.plastanium, 525, VEXItems.insulator, 125));
            size = 5;
            phaseRadiusBoost = 160f;
            radius = 203.4f;
            shieldHealth = 1600f;
            cooldownNormal = 3f;
            cooldownLiquid = 2.4f;
            cooldownBrokenBase = 0.7f;

            consumes.item(Items.phaseFabric).boost();
            consumes.power(17f);
        }};

        insulatorWall = new Wall("insulator-wall"){{
            requirements(Category.defense, with(VEXItems.insulator, 6));
            health = 162 * wallHealthMultiplier;
            
        }};

        insulatorWallLarge = new Wall("insulator-wall-large"){{
            requirements(Category.defense, ItemStack.mult(insulatorWall.requirements, 2));
            health = 162 * 2 * wallHealthMultiplier;
            size = 2;
            
        }};

        //Turret
        heimdall = new LaserTurret("heimdall"){{
            requirements(Category.turret, with(Items.copper, 1200, Items.lead, 350, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 325));
            shootEffect = Fx.shootBigSmoke2;
            shootCone = 40f;
            recoilAmount = 4f;
            size = 6;
            shootShake = 2f;
            range = 500f;
            reloadTime = 1f;
            firingMoveFract = 0.5f;
            shootDuration = 220f;
            powerUse = 17f;
            shootSound = VEXSounds.heimdallDeep;
            loopSound = VEXSounds.heimdallBeam;
            loopSoundVolume = 2f;

            shootType = new ContinuousLaserBulletType(100){{
                length = 500f;
                hitEffect = Fx.hitMeltdown;
                hitColor = Pal.meltdownHit;
                drawSize = 420f;

                incendChance = 0.4f;
                incendSpread = 5f;
                incendAmount = 1;
                ammoMultiplier = 1f;
            }};

            health = 200 * size * size;
        }};

        heimdall2 = new LaserTurret("heimdall2"){{
            requirements(Category.turret, with(Items.copper, 1200, Items.lead, 350, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 325));
            shootEffect = Fx.shootBigSmoke2;
            shootCone = 40f;
            recoilAmount = 4f;
            size = 5;
            shootShake = 2f;
            range = 500f;
            reloadTime = 1f;
            firingMoveFract = 0.5f;
            shootDuration = 220f;
            powerUse = 17f;
            shootSound = VEXSounds.heimdallDeep;
            loopSound = VEXSounds.heimdallBeam;
            loopSoundVolume = 2f;

            shootType = new ContinuousLaserBulletType(100){{
                length = 500f;
                hitEffect = Fx.hitMeltdown;
                hitColor = Pal.meltdownHit;
                drawSize = 420f;

                incendChance = 0.4f;
                incendSpread = 5f;
                incendAmount = 1;
                ammoMultiplier = 1f;
            }};

            health = 200 * size * size;
        }};

        heimdall3 = new LaserTurret("heimdall3"){{
            requirements(Category.turret, with(Items.copper, 1200, Items.lead, 350, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 325));
            shootEffect = Fx.shootBigSmoke2;
            shootCone = 40f;
            recoilAmount = 4f;
            size = 7;
            shootShake = 2f;
            range = 500f;
            reloadTime = 1f;
            firingMoveFract = 0.5f;
            shootDuration = 220f;
            powerUse = 17f;
            shootSound = VEXSounds.heimdallDeep;
            loopSound = VEXSounds.heimdallBeam;
            loopSoundVolume = 2f;

            shootType = new ContinuousLaserBulletType(100){{
                length = 500f;
                hitEffect = Fx.hitMeltdown;
                hitColor = Pal.meltdownHit;
                drawSize = 420f;

                incendChance = 0.4f;
                incendSpread = 5f;
                incendAmount = 1;
                ammoMultiplier = 1f;
            }};

            health = 200 * size * size;
        }};

    };

}
