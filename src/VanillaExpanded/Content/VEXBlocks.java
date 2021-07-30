package VanillaExpanded.Content;

import arc.graphics.Color; //Idk what this is 

import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.UnitType;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.GenericSmelter;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.production.LiquidConverter;
import mindustry.world.draw.*;
import mindustry.type.*;

import static mindustry.type.ItemStack.with;

public class VEXBlocks implements ContentList{
    public static Block 
    
    //Crafting Blocks
        insulatorPress,
    //Liquid Makers
        supercoolantRefinery,
    //Walls
        insulatorWall, insulatorWallLarge;


    @Override
    public void load(){
        //Insert objects here.
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
    };
}
