package tk.spongenetwork.Newoace.Main.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import tk.spongenetwork.Newoace.Main.XP.Xp;

public class Joining implements Listener{
	
	
    Xp experience = new Xp();
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		if(!Xp.XP.containsKey(e.getPlayer().getName())){
			experience.addPlayer(e.getPlayer());
			System.out.println("Added new player!");
		}
	}

}
