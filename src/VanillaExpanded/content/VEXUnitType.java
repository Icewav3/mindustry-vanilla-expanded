package VanillaExpanded.content;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.content.Bullets;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.UnitType;

public class VEXUnitType implements ContentList{
    public static UnitType 
        //Hovercraft
            ranger;

    @Override 
    public void load(){
        ranger = new UnitType("ranger"){{
            health = 300;
            hitSize = 15;
            speed = 1.8f;
            accel = 0.9f;
            drag = 0f;
            ammoType = new ItemAmmoType(Items.copper);
            flying = false;
            range = 100;
            circleTarget = true;

            weapons.add(
                new Weapon("large-weapon"){{
                    reload = 7f;
                    top = false;
                    ejectEffect = Fx.casing1;
                    bullet = Bullets.standardCopper;
                }}
            );
        }};
}

}
