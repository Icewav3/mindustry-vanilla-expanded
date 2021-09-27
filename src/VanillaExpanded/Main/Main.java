package VanillaExpanded.Main;


import javax.xml.namespace.QName;

//import VanillaExpanded.Content.ModLoader;
import VanillaExpanded.Content.*;
import VanillaExpanded.world.*;
import arc.Events;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.game.EventType.WorldLoadEvent;
import mindustry.mod.Mod;
import arc.Events;
import mindustry.Vars;
import mindustry.ctype.ContentList;
import mindustry.game.EventType.FileTreeInitEvent;


public class Main extends Mod {
    public Main(){
        Events.on(ClientLoadEvent.class, e -> {
        });

        Events.on(WorldLoadEvent.class, e -> {
        });
    }

    @Override
    public void init(){
    }

    public void loadContent(){
        //Load Content Here.
        //DO NOT REARRANGE
        new VEXSounds().load();
        new VEXLiquid().load();
        new VEXItems().load();
        new VEXBullets().load();
        new VEXBlocks().load();
        new VEXFunctions().load();
        //new VEXUnitType().load();
        new VEXTechtree().load();
        
}
}