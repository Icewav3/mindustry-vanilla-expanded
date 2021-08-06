package VanillaExpanded.Main;


import javax.xml.namespace.QName;

//import VanillaExpanded.Content.ModLoader;
import VanillaExpanded.Content.*;
import arc.Events;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.game.EventType.WorldLoadEvent;
import mindustry.mod.Mod;

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

    @Override
    public void loadContent(){
        //Load Content Here.
        new VEXItems().load();
        new VEXLiquid().load();
        new VEXBlocks().load();
        new VEXSounds().load();
        
}
}