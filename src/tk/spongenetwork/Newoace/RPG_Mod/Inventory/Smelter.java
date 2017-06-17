package tk.spongenetwork.Newoace.RPG_Mod.Inventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by dadoc on 12/19/2016.
 */
public class Smelter implements Listener {

    private SmelterInventory inv = new SmelterInventory() ;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (e.getClickedBlock().getType() == Material.ENCHANTMENT_TABLE) {
                e.setCancelled(true);
                e.getPlayer().openInventory(inv.getSmelter());
            }
        }
    }

    public SmelterInventory getInv () {
        return inv ;
    }

}
