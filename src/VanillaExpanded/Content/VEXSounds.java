package VanillaExpanded.Content;


import arc.*;
import arc.assets.*;
import arc.assets.loaders.*;
import arc.audio.*;
import mindustry.Vars;

public class VEXSounds{
  

    public static Sound 
       heimdallDeep = new Sound(),
       heimdallCharge = new Sound(),
       heimdallBeam = new Sound()
        
    ;

    public void load(){
        heimdallDeep = getSound("heimdalldeep");
        heimdallBeam = getSound("heimdallsuperlaser");

    }

    public static Sound getSound(String soundName){
        if(!Vars.headless){
            String name = "sounds/" + soundName;
            String dir = name + ".ogg";
            
            Sound sound = new Sound();
            AssetDescriptor<?> desc = Core.assets.load(dir, Sound.class, new SoundLoader.SoundParameter(sound));
            desc.errored = Throwable::printStackTrace;

            return sound;
        } else {
            return new Sound();
        }

    }
}
