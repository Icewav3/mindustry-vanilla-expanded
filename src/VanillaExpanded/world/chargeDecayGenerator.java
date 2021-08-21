package VanillaExpanded.world;

import mindustry.world.blocks.power.*;
import mindustry.type.*;

public class chargeDecayGenerator extends ItemLiquidGenerator {

    public chargeDecayGenerator(String name){
        super(true, false, name);
        hasItems = true;
        hasLiquids = false;
    }

    @Override
    protected float getItemEfficiency(Item item){
        return item.charge;
    }
}
