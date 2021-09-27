package VanillaExpanded.world.block.defence;

import mindustry.world.blocks.distribution.Conveyor;
import mindustry.entities.Fires;
import mindustry.gen.Fire;
import mindustry.game.EventType.*;
import arc.Events;



public class FireResistConveyor extends Conveyor {
    public FireResistConveyor (String name){
        super(name);
    }

    public class build extends ConveyorBuild{
        @Override
        public void update()
        {super.update();
            if(Fires.has( tile.x, tile.y)){
                Fire fire = Fires.get (tile.x, tile.y);
                fire.time(fire.lifetime);
                Events.fire(Trigger.fireExtinguish);

            }
        }
    }
}