package tk.spongenetwork.Newoace.RPG_Mod.Inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class BlackSmith implements Listener {

    @EventHandler
    public void onInventoryEvent(InventoryClickEvent e) {
        if (true) {
            if (e.getRawSlot() >= e.getInventory().getSize()) {
                return;
            } else if (e.getInventory().getTitle().equalsIgnoreCase("Anvil")) {
                if (false) {

                }

            }
        }
    }
}