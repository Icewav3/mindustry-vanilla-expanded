package VanillaExpanded.Content;

import arc.*;
import mindustry.Vars;
import mindustry.ctype.*;
import mindustry.game.EventType.FileTreeInitEvent;

public class ModLoader implements ContentList{
    private final ContentList[] contents = {
        new VEXBlocks(),
        new VEXItems(),
        new VEXLiquid(),
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }

    public ModLoader() {
        if (Vars.headless) {
            Events.on(FileTreeInitEvent.class, e -> {
                VEXSounds.load();
            });
        } else {
            VEXSounds.load();
        }
}
}
