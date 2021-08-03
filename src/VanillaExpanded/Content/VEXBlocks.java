package VanillaExpanded.Content;

import arc.graphics.Color; 



import mindustry.content.*;
import mindustry.ctype.Content;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.GenericSmelter;
import mindustry.world.blocks.production.LiquidConverter;
import mindustry.world.draw.*;
import mindustry.type.*;

import static mindustry.type.ItemStack.*;
import static mindustry.Vars.*;

public class VEXBlocks implements ContentList{
    public static Block 
    
    //Crafting Blocks
        insulatorPress,
    //Liquid Makers
        supercoolantRefinery, exampleWaterThing,
    //Walls
        insulatorWall, insulatorWallLarge;


    @Override
    public void load(){
        int wallHealthMultiplier = 4;
        //Crafters
        supercoolantRefinery = new GenericCrafter("supercoolant-refinery"){{
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

        //Walls
        insulatorWall = new Wall("insulator-wall"){{
            requirements(Category.defense, with(VEXItems.insulator, 6));
            health = 162 * wallHealthMultiplier;
            
        }};

        insulatorWallLarge = new Wall("insulator-wall-large"){{
            requirements(Category.defense, ItemStack.mult(insulatorWall.requirements, 2));
            health = 162 * 2 * wallHealthMultiplier;
            size = 2;
            
        }};
    };

}
