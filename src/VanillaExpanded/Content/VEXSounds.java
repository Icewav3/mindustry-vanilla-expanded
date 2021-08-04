package VanillaExpanded.Content;
import arc.audio.Sound;

public class VEXSounds extends Sound {
    public static Sound heimdall_deep = new arc.audio.Sound();
    public static Sound heimdall_super_laser = new arc.audio.Sound();
    public static Sound heimdall_charge = new arc.audio.Sound();

    public void load(){
        arc.Core.assets.load("sounds/heimdalldeep.ogg", arc.audio.Sound.class).loaded = a -> heimdall_deep = (arc.audio.Sound)a;
        arc.Core.assets.load("sounds/heimdallsuperlasercharge.ogg", arc.audio.Sound.class).loaded = a -> heimdall_charge = (arc.audio.Sound)a;
    }
}
