package VanillaExpanded.Content;

import arc.*;
import mindustry.Vars;
import mindustry.core.ContentLoader;
import mindustry.ctype.*;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.world.modules.LiquidModule;

public class ModLoader extends ContentLoader{
    private final ContentList[] contents = {
        new VEXBlocks(),
        new VEXItems(),
        new VEXLiquid()       
    };

    @Override
    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }

}
