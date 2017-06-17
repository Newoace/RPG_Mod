package tk.spongenetwork.Newoace.Main.XP;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

/**
 * Created by dadoc on 12/3/2016.
 */
public class Xp {

	//primary hashmap storing xp values.
	public static HashMap<String, HashMap<String, Object>> XP = new HashMap<>(); 

	//init XP .yml
	private File file = new File("plugins/RPGMod", "PlayerXP.yml");
	private FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public Xp(){
	}
	
	public void addPlayer(Player p){
		//adds a new player into the system
		
		HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put(XPType.WOOD.toString(), 0);
		hash.put(XPType.BLACKSMITH.toString(), 0);
		hash.put(XPType.CRAFTING.toString(), 0);
		hash.put(XPType.FISHING.toString(), 0);
		hash.put(XPType.MINING.toString(), 0);
		//adds empty values into storage



		XP.put(p.getName(), hash);
	}
	
	public void removePlayer(Player p){
		//removes player from hash
		if(XP.containsKey(p))
			XP.remove(p);
	}

	public void giveXP(String playerName, XPType type, int amount) {
		//gives a certain value of xp to player
		XP.get(playerName).put(type.toString(), (int) XP.get(playerName).get(type.toString()) + amount);
	}

	public void takeXP(String playerName, XPType type, int amount) {
		//subtracts a certain value of xp from a player
		XP.get(playerName).put(type.toString(), (int) XP.get(playerName).get(type.toString()) - amount);
	}
	

	public void saveXPConfig(){
		//Saves the XP hashmap into a .yml file
		if(!config.isConfigurationSection("Players"))
			config.createSection("Players");

		for(String name : XP.keySet()){
			HashMap<String, Object> hash = XP.get(name);
			if(!config.isConfigurationSection("Players."+name))
			config.createSection("Players."+name);
			for(String type : hash.keySet()){
				int value = (int) hash.get(type);
				if(!config.isConfigurationSection("Players,"+name+"."+type))
					config.createSection("Players."+name+"."+type);
				config.set("Players."+name+"."+type, value);

			}
		}
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadXPConfig(){
		//Loads the XP hashmap into memory
		if(config.isConfigurationSection("Players"))
		for(String key : config.getConfigurationSection("Players").getKeys(false)){
			HashMap<String, Object> h = new HashMap<>(config.getConfigurationSection("Players."+key).getValues(true));
				
			XP.put(key, h);
			
		}
		
	}
}
