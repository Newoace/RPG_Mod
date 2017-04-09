package tk.spongenetwork.Newoace.Main.Inventory;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import tk.spongenetwork.Newoace.Main.Inventory.BlackSmithInventory;



public class BlackSmithAnvil implements Listener {

    private BlackSmithInventory inv = new BlackSmithInventory() ;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.getClickedBlock().getType() == Material.ANVIL) {
            e.setCancelled(true);
            e.getPlayer().openInventory(inv.getBlackSmithAnvil()) ;

        }
    }

    public BlackSmithInventory getInv () {
        return inv ;
    }

}




//public class Smelter implements Listener {

  //  private SmelterInventory inv = new SmelterInventory() ;

    //@EventHandler
 //   public void onPlayerInteract(PlayerInteractEvent e) {
   //     if (e.getClickedBlock().getType() == Material.FURNACE) {
     //       e.setCancelled(true);
       //     e.getPlayer().openInventory(inv.getSmelter()) ;

//        }
 //   }

//    public SmelterInventory getInv () {
    //    return inv ;
  //  }

//}
