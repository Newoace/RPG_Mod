package tk.spongenetwork.Newoace.Main.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import tk.spongenetwork.Newoace.Main.XP.Xp;

/**
 * Created by dadoc on 12/11/2016.
 */
public class CutWood implements Listener {


    Xp xp = new Xp() ;

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if (e.getBlock().getType() == Material.LOG || e.getBlock().getType() == Material.LOG_2) {
            xp.giveXP(e.getPlayer().getPlayerListName(), "wood", 5);
        }
    }
}
