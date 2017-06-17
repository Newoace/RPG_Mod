package tk.spongenetwork.Newoace.RPG_Mod;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import tk.spongenetwork.Newoace.RPG_Mod.Events.CutWood;
import tk.spongenetwork.Newoace.RPG_Mod.Events.MineOre;
import tk.spongenetwork.Newoace.RPG_Mod.Inventory.Smelt;
import tk.spongenetwork.Newoace.RPG_Mod.Inventory.Smelter;
import tk.spongenetwork.Newoace.RPG_Mod.Inventory.BlackSmithAnvil;

/**
 * Created by dadoc on 11/29/2016.
 */
public class RPG_Mod extends JavaPlugin {




    @Override
    public void onEnable() {
        registerEvents();
        createConfig();
    }

    @Override
    public void onDisable() {

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
    }


}
