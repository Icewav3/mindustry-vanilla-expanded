package VanillaExpanded.Main;


import javax.xml.namespace.QName;

import VanillaExpanded.Content.ModLoader;
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
        
        new ModLoader().load(); //Need to create a mod loader class for this one.
                                //This is still incomplete.
    }
}