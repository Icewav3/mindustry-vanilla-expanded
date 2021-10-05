package VanillaExpanded.Main;


//import VanillaExpanded.Content.ModLoader;
import VanillaExpanded.content.*;
        import arc.Events;
import arc.struct.Seq;
import mindustry.ctype.ContentList;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.game.EventType.WorldLoadEvent;
import mindustry.mod.Mod;


public class Main extends Mod {

    private final Seq<ContentList> contents = Seq.with(
            //Load Content Here.
            //DO NOT REARRANGE
            new VEXSounds(),
            new VEXLiquid(),
            new VEXItems(),
            new VEXBullets(),
            new VEXBlocks(),
            new VEXFunctions(),
            new VEXTechtree()
    );

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
        contents.each(ContentList::load);
    }
}