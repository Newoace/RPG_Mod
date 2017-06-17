package tk.spongenetwork.Newoace.RPG_Mod.Inventory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class BlackSmithInventory {

    public Inventory Anvil = Bukkit.createInventory(null, 54, "Anvil") ;
    public BlackSmithInventory() {
        Anvil.setItem(9, new ItemStack(Material.IRON_CHESTPLATE));
        Anvil.setItem(11, new ItemStack(Material.GOLD_BLOCK));
        Anvil.setItem(13, new ItemStack(Material.COAL));
        Anvil.setItem(15, new ItemStack(Material.IRON_BLOCK));
        Anvil.setItem(17, new ItemStack(Material.IRON_INGOT));
    }
    public Inventory getBlackSmithAnvil () {

        return Anvil ;
    }


}





//public class SmelterInventory {

  //  public Inventory Smelter = Bukkit.createInventory(null, 54, "Smeltery") ;
    //public SmelterInventory() {
      //  Smelter.setItem(9, new ItemStack(Material.GOLD_INGOT));
        //Smelter.setItem(11, new ItemStack(Material.GOLD_BLOCK));
        //Smelter.setItem(13, new ItemStack(Material.COAL));
        //Smelter.setItem(15, new ItemStack(Material.IRON_BLOCK));
        //Smelter.setItem(17, new ItemStack(Material.IRON_INGOT));
    //}
    //public Inventory getSmelter () {
      //  return Smelter ;
    //}


//}
