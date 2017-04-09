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
                return ;
            } else if (e.getInventory().getTitle().equalsIgnoreCase("Anvil")) {
                if (e.getCurrentItem().getType() == Material.IRON_INGOT) {
                    if (e.getWhoClicked().getInventory().contains(Material.IRON_INGOT)) {
                            for (int i = 0 ; i < e.getWhoClicked().getInventory().getSize() ; i ++) {
                                ItemStack itm = e.getWhoClicked().getInventory().getItem(i) ;
                                    break ;
                                }
                            }
                            for (int i = 0 ; i < e.getWhoClicked().getInventory().getSize() ; i ++) {
                                ItemStack itm = e.getWhoClicked().getInventory().getItem(i) ;
                                if (itm != null && itm.getAmount()>0 && (itm.getType() == Material.IRON_INGOT)) {
                                    int amt = itm.getAmount()-8 ;
                                    itm.setAmount(amt);
                                    e.getWhoClicked().getInventory().setItem(i,  amt > 0 ? itm : null) ;
                                    break ;
                                }
                            }
                            e.getWhoClicked().getInventory().addItem(new ItemStack(Material.IRON_CHESTPLATE, 1)) ;
                            e.setCancelled(true);
                        } else {
                            e.getWhoClicked().sendMessage("You need more iron");
                            e.setCancelled(true);
                        }
                    }
                }
                e.setCancelled(true);
            }
        }