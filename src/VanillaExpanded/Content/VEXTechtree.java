package VanillaExpanded.Content;

import arc.struct.Seq;
import mindustry.content.SectorPresets;
import mindustry.content.TechTree;
import mindustry.content.TechTree.TechNode;
import mindustry.ctype.ContentList;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives.Objective;
import mindustry.game.Objectives.*;
import mindustry.type.ItemStack;

import static mindustry.content.Blocks.*;
import static mindustry.content.Items.*;
import static mindustry.content.UnitTypes.*;


    @Override
    public void load() {
        node(cryofluidMixer, () -> {
            node(insulatorPress, () -> {
                node(supercoolantRefinery, Seq.with(new Research(Items.insulator)), () -> {
                    node(insulatorWall, () -> {
                    });

                    node(insulatorWallLarge, () -> {
                    });
                });
            });

        });
    }