package tk.spongenetwork.Newoace.Main.Inventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by dadoc on 12/19/2016.
 */
public class Smelt implements Listener {

    @EventHandler
    public void onInventoryEvent(InventoryClickEvent e) {
        if (e.getInventory().getContents() != e.getWhoClicked().getInventory().getContents()) {
            if (e.getCurrentItem().getType() == Material.GOLD_INGOT) {
               if (e.getWhoClicked().getInventory().contains(Material.GOLD_ORE)) {
                   if (e.getWhoClicked().getInventory().contains(Material.COAL)) {
                       for (int i = 0 ; i < e.getWhoClicked().getInventory().getSize() ; i ++) {
                           if (e.getWhoClicked().getInventory().getItem(i).getType() == Material.GOLD_ORE) {

                           }
                       }
                       e.getWhoClicked().getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 1)) ;
                   } else {
                       e.getWhoClicked().sendMessage("You need coal...");
                   }
               } else {
                   e.getWhoClicked().sendMessage("You need gold ore...");
               }
            }
            e.setCancelled(true);
        }
    }

}
