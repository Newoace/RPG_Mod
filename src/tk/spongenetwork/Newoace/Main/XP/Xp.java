package tk.spongenetwork.Newoace.Main.XP;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import tk.spongenetwork.Newoace.Main.Main;

import java.io.File;
import java.io.IOException;

/**
 * Created by dadoc on 12/3/2016.
 */
public class Xp {

    FileConfiguration xp = Bukkit.getPluginManager().getPlugin("RPGMod").getConfig() ;

    public Xp() {

    }

    public void giveXP(String player, String type, int n) {
        if (xp.get(player+"."+type) == null) {
            createConfig(player);
        } else {
            xp.set(player+"."+type,(int) xp.get(player+"."+type) + n);

        }
        Bukkit.getPluginManager().getPlugin("RPGMod").saveConfig();
    }

    public void createConfig(String player) {
        xp.createSection(player+".wood") ;
        xp.createSection(player+".mining") ;
        xp.createSection(player+".fishing") ;
        xp.createSection(player+".crafting") ;
        xp.createSection(player+".blacksmith") ;
        xp.createSection(player+".woodl") ;
        xp.createSection(player+".miningl") ;
        xp.createSection(player+".fishingl") ;
        xp.createSection(player+".craftingl") ;
        xp.createSection(player+".blacksmithl") ;
        xp.set(player+".wood", 0);
        xp.set(player+".mining", 0);
        xp.set(player+".fishing", 0);
        xp.set(player+".crafting", 0);
        xp.set(player+".blacksmith", 0);
        xp.set(player+".woodl", 0);
        xp.set(player+".miningl", 0);
        xp.set(player+".fishingl", 0);
        xp.set(player+".craftingl", 0);
        xp.set(player+".blacksmithl", 0);
    }

    public int getXP(String player, String type){
        return xp.getInt(player + "." + type) ;
    }
    public  int getXPL(String player, String type) {
        return xp.getInt(player+"."+type) ;
    }

}
