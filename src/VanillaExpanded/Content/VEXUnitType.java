package VanillaExpanded.Content;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.game.EventType.TurretAmmoDeliverEvent;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;
import mindustry.content.Bullets;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.UnitType;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

import VanillaExpanded.Content.VEXUnits.Ai.*;

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
