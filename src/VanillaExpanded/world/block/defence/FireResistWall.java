package VanillaExpanded.world.block.defence;

import mindustry.world.blocks.defense.Wall;
import mindustry.entities.Fires;
import mindustry.gen.Fire;
import mindustry.game.EventType.*;
import arc.Events;



public class FireResistWall extends Wall {
    public FireResistWall (String name){
        super(name);
        this.update = true;
    }

    public class build extends WallBuild{
        @Override
        public void update()
        {super.update();

            for(int x = 0; x < size; x++){
                for(int y = 0; y < size; y++){
                    if(Fires.has( tile.x + x, tile.y + y)){
                        Fire fire = Fires.get (tile.x + x, tile.y + y);
                        fire.time(fire.lifetime);
                        Events.fire(Trigger.fireExtinguish);

                    }
                }
            }
        }
    }
}