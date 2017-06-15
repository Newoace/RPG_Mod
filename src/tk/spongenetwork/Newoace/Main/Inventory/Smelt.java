package tk.spongenetwork.Newoace.Main.Inventory;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

/**
 * Created by dadoc on 12/19/2016.
 */
public class Smelt implements Listener {

    private SmelterInventory smelterInventory = new SmelterInventory();

    @EventHandler
    public void onInventoryEvent(InventoryClickEvent e) {
        if (e.getClickedInventory() != null) {
            if (e.getInventory().equals(smelterInventory.getSmelter())) {
                if (e.getCurrentItem().getType() == Material.GOLD_INGOT) {
                    if (this.smeltEvent(e.getWhoClicked(), Material.GOLD_ORE, e)) {
                        e.getWhoClicked().getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 1));
                    } else {
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getType() == Material.DIAMOND) {

                    if(this.smeltEvent(e.getWhoClicked(), Material.DIAMOND_ORE, e)) {
                        
                    } else {
                        e.setCancelled(true);
                    }

                } else if (e.getCurrentItem().getType() == Material.IRON_INGOT) {
                    if (this.smeltEvent(e.getWhoClicked(), Material.IRON_ORE, e)) {
                        e.getWhoClicked().getInventory().addItem(new ItemStack(Material.IRON_INGOT, 1)) ;
                    } else {
                        e.setCancelled(true);
                    }
                } else {
                    e.setCancelled(true);
                }
                e.setCancelled(true);
            }
        }
    }

    private boolean smeltEvent(HumanEntity e, Material ore, InventoryClickEvent event) {
        boolean coalM = false ;
        boolean oreM = false ;
        if (e.getInventory().contains(ore)) {
            if (e.getInventory().contains(Material.COAL)) {
                while ((!coalM && !oreM)) {
                    for (int i = 0 ; i < e.getInventory().getSize() ; i ++) {
                        ItemStack itm = e.getInventory().getItem(i) ;
                        if (itm != null) {
                            if (itm.getType() == ore) {
                                itm.setAmount(itm.getAmount()-1);
                                oreM = !oreM ;
                            } else if (itm.getType() == Material.COAL) {
                                itm.setAmount(itm.getAmount()-1);
                                coalM = !coalM ;
                            }
                        }
                    }
                }
                e.getInventory().addItem(new ItemStack(event.getCurrentItem().getType(), 1)) ;
            } else {
                e.sendMessage("You need more coal");
                return false ;
            }
        } else {
            e.sendMessage("You need more ore");
            return false ;
        }
        return false ;
    }
}