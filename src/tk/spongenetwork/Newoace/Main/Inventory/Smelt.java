package tk.spongenetwork.Newoace.Main.Inventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

/**
 * Created by dadoc on 12/19/2016.
 */
public class Smelt implements Listener {

    @EventHandler
    public void onInventoryEvent(InventoryClickEvent e) {
        if (true) {
            if (e.getRawSlot() >= e.getInventory().getSize()) {
                return ;
            } else if (e.getInventory().getTitle().equalsIgnoreCase("Smeltery")) {
                if (e.getCurrentItem().getType() == Material.GOLD_INGOT) {
                    if (e.getWhoClicked().getInventory().contains(Material.GOLD_ORE)) {
                        if (e.getWhoClicked().getInventory().contains(Material.COAL)) {
                            for (int i = 0 ; i < e.getWhoClicked().getInventory().getSize() ; i ++) {
                                ItemStack itm = e.getWhoClicked().getInventory().getItem(i) ;
                                if (itm != null && itm.getAmount()>0 && (itm.getType() == Material.COAL)) {
                                    int amt = itm.getAmount()-1 ;
                                    itm.setAmount(amt);
                                    e.getWhoClicked().getInventory().setItem(i,  amt > 0 ? itm : null) ;
                                    break ;
                                }
                            }
                            for (int i = 0 ; i < e.getWhoClicked().getInventory().getSize() ; i ++) {
                                ItemStack itm = e.getWhoClicked().getInventory().getItem(i) ;
                                if (itm != null && itm.getAmount()>0 && (itm.getType() == Material.GOLD_ORE)) {
                                    int amt = itm.getAmount()-1 ;
                                    itm.setAmount(amt);
                                    e.getWhoClicked().getInventory().setItem(i,  amt > 0 ? itm : null) ;
                                    break ;
                                }
                            }
                            e.getWhoClicked().getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 1)) ;
                            e.setCancelled(true);
                        } else {
                            e.getWhoClicked().sendMessage("You need coal...");
                            e.setCancelled(true);
                        }
                    } else {
                        e.getWhoClicked().sendMessage("You need gold ore...");
                        e.setCancelled(true);
                    }
                }
                e.setCancelled(true);
            }
        }
    }

}
