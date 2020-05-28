package TeamChager;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.type.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.plugin.Plugin;
import mindustry.Vars;
import mindustry.core.World;
import mindustry.world.Tile;
import mindustry.content.Blocks;
import mindustry.game.Team;


 public class pusher{
     int i;
     
    public static void push(int x,int y,int z){
        if (z==5){Vars.world.tile(x,y).setTeam(Team.blue);};
        if (z==4){  Vars.world.tile(x,y).setTeam(Team.purple);};
        if (z==3){Vars.world.tile(x,y).setTeam(Team.green);};
        if (z==2){  Vars.world.tile(x,y).setTeam(Team.crux);};
        if (z==1){Vars.world.tile(x,y).setTeam(Team.sharded);};
        if (z==0){  Vars.world.tile(x,y).setTeam(Team.derelict);};

        
            

    }
}
