package tk.spongenetwork.Newoace.Main.Inventory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Created by dadoc on 12/19/2016.
 */
public class SmelterInventory {

    public Inventory Smelter = Bukkit.createInventory(null, InventoryType.CHEST, "Smeltery") ;
    public SmelterInventory() {
        Smelter.setItem(9, new ItemStack(Material.GOLD_INGOT));
        Smelter.setItem(11, new ItemStack(Material.GOLD_BLOCK));
        Smelter.setItem(13, new ItemStack(Material.COAL));
        Smelter.setItem(15, new ItemStack(Material.IRON_BLOCK));
        Smelter.setItem(17, new ItemStack(Material.IRON_INGOT));
    }
    public Inventory getSmelter () {
        return Smelter ;
    }


}
