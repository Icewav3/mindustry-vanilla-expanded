package VanillaExpanded.world.block.defence;
import VanillaExpanded.Content.VEXBullets;
import VanillaExpanded.Content.VEXLiquid;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.ctype.ContentList;
import mindustry.ctype.Content;
import mindustry.content.Blocks;
import mindustry.entities.bullet.BulletType;
import mindustry.type.Liquid;
import mindustry.world.Block;


public class VEXFunctions implements ContentList {

    public static void addLiquidAmmo(Block Turret, Liquid liquid, BulletType bullet) {
        ((LiquidTurret) Turret).ammoTypes.put(liquid, bullet);
    }
    @Override
    public void load(){
    addLiquidAmmo(Blocks.tsunami, VEXLiquid.supercoolant, VEXBullets.heavySupercoolantShot);
    addLiquidAmmo(Blocks.wave, VEXLiquid.supercoolant, VEXBullets.supercoolantShot);
    }
}