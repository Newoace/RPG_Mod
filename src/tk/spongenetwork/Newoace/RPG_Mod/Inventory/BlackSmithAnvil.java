package tk.spongenetwork.Newoace.RPG_Mod.Inventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class BlackSmithAnvil implements Listener {

    private BlackSmithInventory inv = new BlackSmithInventory() ;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (e.getClickedBlock().getType() == Material.ANVIL) {
                e.setCancelled(true);
                e.getPlayer().openInventory(inv.getBlackSmithAnvil()) ;
            }

        }
    }

    public BlackSmithInventory getInv () {
        return inv ;
    }

}


