package tk.spongenetwork.Newoace.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import tk.spongenetwork.Newoace.Main.Events.CutWood;
import tk.spongenetwork.Newoace.Main.Events.Joining;
import tk.spongenetwork.Newoace.Main.Events.MineOre;
import tk.spongenetwork.Newoace.Main.Inventory.BlackSmithAnvil;
import tk.spongenetwork.Newoace.Main.Inventory.Smelt;
import tk.spongenetwork.Newoace.Main.Inventory.Smelter;
import tk.spongenetwork.Newoace.Main.XP.Xp;

/**
 * Created by dadoc on 11/29/2016.
 */
public class Main extends JavaPlugin {



    Xp experience = new Xp();

    @Override
    public void onEnable() {
        registerEvents();
        createConfig();
        
        experience.loadXPConfig();
    }

    @Override
    public void onDisable() {
    	experience.saveXPConfig();
    }
    
    
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(label.equalsIgnoreCase("debug")){
			sender.sendMessage("XP: "+ Xp.XP);
		}
		
		
		return false;
	}


    public FileConfiguration getXPConfig(){
        return this.getConfig() ;
    }

    public void createConfig () {
        saveDefaultConfig();
    }

    public void registerEvents() {
        getServer().getPluginManager().registerEvents(new MineOre() , this);
        getServer().getPluginManager().registerEvents(new CutWood(), this);
        getServer().getPluginManager().registerEvents(new Smelter(), this);
        getServer().getPluginManager().registerEvents(new Smelt(), this) ;
        getServer().getPluginManager().registerEvents(new BlackSmithAnvil(), this);
        getServer().getPluginManager().registerEvents(new Joining(), this);

    }


}
