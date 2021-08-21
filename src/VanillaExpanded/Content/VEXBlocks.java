package VanillaExpanded.Content;

import VanillaExpanded.world.*;
import mindustry.graphics.Pal;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.*;
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
        supercoolantRefinery,
    //Power generators
        surgeCatalyzer,
    //Defense
        insulatorWall, insulatorWallLarge, forceDome,
    //Turrets
        heimdall, thunderbird, tsunami
    //Reserve
        
        ;
    //LOCALIZED NAME USES CAPITAL CASE

    @Override
    public void load(){
        int wallHealthMultiplier = 4;
        //Crafters
        supercoolantRefinery = new LiquidConverter("supercoolant-refinery"){{
            localizedName = "Supercoolant Refinery";
            description = "Uses Insulator to cool down cryofluid into Supercoolant";
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
            localizedName = "Insulator Press";
            description = "Creates Insulators from silicon and plastanium";
            requirements(Category.crafting, with(Items.metaglass, 30, Items.plastanium, 50, Items.titanium, 120));
            outputItem = new ItemStack(VEXItems.insulator, 1);
            craftEffect = Fx.smeltsmoke;
            health = 120;
            craftTime = 120f;
            size = 2;
            hasItems = true;
            hasPower = true;
            solid = true;
            consumes.items(with(Items.silicon, 1, Items.plastanium, 1));
            consumes.power(1f);
        }};

        //Power generators

        surgeCatalyzer = new chargeDecayGenerator("surge-catalyzer"){{
            localizedName = "Surge Catalyzer";
            description = "A device that provides an optimal enviroment for surge to react within it to provide power, it's very efficient but produces little power at a time";
            requirements(category.effect, with(Items.titanium, 75, Items.lead, 250, VEXItems.insulator, 15));
            size = 2;
            health = 60 * 9;
            hasItems = true;
            hasPower = true;
            solid = true;
            powerProduction = 2.5f;
            consumes.itemswith(Items.surgeAlloy, 1);
            itemDuration = 60 * 27;
            ambientSound = Sounds.smelter; //need sound file
            ambientSoundVolume = 0.06f;
        }};

        //Defense
        
        forceDome = new ForceProjector("force-dome"){{
            localizedName = "Force Dome";
            description = "Leaps in shield technology allows for further ranges and increased shield durability, as long as its cooled";
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
            localizedName = "Insulator Wall";
            description = " A wall that protects against fire and electricity";
            requirements(Category.defense, with(VEXItems.insulator, 6));
            health = 162 * wallHealthMultiplier;
            insulated = true;
        }};

        insulatorWallLarge = new Wall("insulator-wall-large"){{
            localizedName = "Large Insulator Wall";
            description = " A wall that protects against fire and electricity";
            requirements(Category.defense, ItemStack.mult(insulatorWall.requirements, 4));
            health = 162 * 4 * wallHealthMultiplier;
            size = 2;
            insulated = true;
        }};

        //Turrets

        thunderbird = new ItemTurret("thunderbird"){{
            localizedName = "Thunderbird";
            description = "A high caliber autocannon that fires high velocity projectiles against air units";
            requirements(Category.turret, with(Items.graphite, 75, Items.titanium, 250, Items.thorium, 125, Items.lead, 175));
            ammo(
                Items.thorium, VEXBullets.autoCannonThorium,
                Items.graphite, VEXBullets.autoCannonDense,
                Items.surgeAlloy, VEXBullets.autoCannonSurge
            );
            maxAmmo = 10;
            ammoPerShot = 5;
            coolantMultiplier = 0.9f;
            targetGround = false;
            rotateSpeed = 1.5f;
            ammoUseEffect = Fx.casing3;
            recoilAmount = 4f;
            restitution = 0.1f;
            reloadTime = 20f;
            spread = 8f;
            alternate = true;
            shootShake = 3f;
            shootSound = VEXSounds.autoCannonShot;
            shots = 2;
            size = 3;
            range = 425f;
            shootCone = 18f;
            inaccuracy = 1f;
            health = size * size * 100;
        }};

       /* heimdall = new LaserTurret("heimdall"){{
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
        }};*/

    };

}
