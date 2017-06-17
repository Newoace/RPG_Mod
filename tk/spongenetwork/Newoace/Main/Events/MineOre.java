package tk.spongenetwork.Newoace.Main.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import tk.spongenetwork.Newoace.Main.XP.XPType;
import tk.spongenetwork.Newoace.Main.XP.Xp;

/**
 * Created by dadoc on 11/29/2016.
 */
public class MineOre implements Listener{



    Xp experience = new Xp() ;



    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if (e.getBlock().getType() == Material.COAL_ORE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 5) ;
        } else if (e.getBlock().getType() == Material.IRON_ORE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 25);
        } else if (e.getBlock().getType() == Material.GOLD_ORE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 50);
        } else if (e.getBlock().getType() == Material.LAPIS_ORE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 40);
        } else if (e.getBlock().getType() == Material.DIAMOND_ORE || e.getBlock().getType() == Material.EMERALD_ORE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 75);
        } else if (e.getBlock().getType() == Material.STONE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 1);
        } else if (e.getBlock().getType() == Material.OBSIDIAN) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 2);
        } else if(e.getBlock().getType() == Material.QUARTZ_ORE) {
            experience.giveXP(e.getPlayer().getName(), XPType.MINING, 5);
        }
    }



}
