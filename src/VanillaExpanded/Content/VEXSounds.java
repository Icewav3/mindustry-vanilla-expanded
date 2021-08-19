package VanillaExpanded.Content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import mindustry.Vars;

public class VEXSounds{

    public static Sound 
       heimdallDeep = new Sound(),
       heimdallCharge = new Sound(),
       heimdallBeam = new Sound(),
       autoCannonShot = new Sound();

    protected static Sound loadSound (String soundName) {
        if (!Vars.headless) {
            String name = "sounds/" + soundName;
            String path = Vars.tree.get(name + ".ogg").exists() ? name + ".ogg" : name + ".mp3";

            Sound sound = new Sound();

            AssetDescriptor <?> desc = Core.assets.load(path, Sound.class, new SoundLoader.SoundParameter(sound));
            desc.errored = Throwable::printStackTrace;
            return sound;
        } else return new Sound();
    }
    public void load(){
        heimdallDeep = loadSound("heimdalldeep");
        heimdallBeam = loadSound("heimdallsuperlaser");
        autoCannonShot = loadSound("autoCannonShot");
    }
}
