package TeamChanger;

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
import TeamChager.pusher;

public class TeamChager extends Plugin{
    byte z=5;

    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler){
        handler.register("changeteam","<team>", "Change team for all blocks.", args -> {
            int team = Integer.parseInt(args[0]);
            
            for(int x = 0; x < Vars.world.width(); x++){
                for(int y = 0; y < Vars.world.height(); y++){
                    pusher.push(x,y,team);
                    }
                }
            }
        );
    }
    
}
 
