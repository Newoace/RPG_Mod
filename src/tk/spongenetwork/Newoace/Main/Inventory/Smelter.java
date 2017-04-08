package tk.spongenetwork.Newoace.Main.Inventory;

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
        if (e.getClickedBlock().getType() != null && e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && e.getClickedBlock().getType() == Material.FURNACE) {
            e.setCancelled(true);
            e.getPlayer().openInventory(inv.getSmelter()) ;

        }
    }

    public SmelterInventory getInv () {
        return inv ;
    }

}
