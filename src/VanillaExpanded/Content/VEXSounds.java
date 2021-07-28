package VanillaExpanded.Content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import mindustry.Vars;

public class VEXSounds {
    public static Sound 
    Heimdall_Deep = new Sound(),
    Heimdall_Super_Laser = new Sound(),
    Heimdall_Super_Laser_Charge = new Sound();

    protected static Sound loadSound(String soundName) {
        if (!Vars.headless) {
            String name = "sounds/" + soundName;
            String path = Vars.tree.get(name + ".ogg").exists() ? name + ".ogg" : name + ".mp3";

            Sound sound = new Sound();

            AssetDescriptor<?> desc = Core.assets.load(path, Sound.class, new SoundLoader.SoundParameter(sound));
            desc.errored = Throwable::printStackTrace;
            return sound;
        } else return new Sound();
    }

    public static void load(){
        Heimdall_Deep = loadSound("heimdaldeep");
        Heimdall_Super_Laser = loadSound("heimdallsuperlaser");
        Heimdall_Super_Laser_Charge = loadSound("heimdallsuperlasercharge");
    }
}
