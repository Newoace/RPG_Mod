package tk.spongenetwork.Newoace.Main.Inventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;


public class BlackSmith implements Listener {

    @EventHandler
    public void onInventoryEvent(InventoryClickEvent e) {
        if (true) {
            if (e.getRawSlot() >= e.getInventory().getSize()) {
                return;
            } else if (e.getInventory().getTitle().equalsIgnoreCase("Anvil")) {

            }
        }
    }
}