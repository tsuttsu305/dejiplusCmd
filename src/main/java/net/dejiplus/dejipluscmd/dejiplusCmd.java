package net.dejiplus.dejipluscmd;

import java.util.logging.Logger;

import net.dejiplus.dejipluscmd.listener.PlayerListener;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class dejiplusCmd extends JavaPlugin{

    // Loggger
    public final static Logger log = Logger.getLogger("Minecraft");
    public final static String logPrefix = "[dejiplusCmd] ";
    public final static String msgPrefix = "[DC] ";


    public void onEnable() {

        PluginManager pm = getServer().getPluginManager();

        // Regist Listener
        pm.registerEvents(new PlayerListener(), this);

        PluginDescriptionFile pdfFile = this.getDescription();
        log.info("[" + pdfFile.getName() + "] version " + pdfFile.getVersion() + " is enabled!");

    }

    public void onDisable() {

        PluginDescriptionFile pdfFile = this.getDescription();
        log.info("[" + pdfFile.getName() + "} version " + pdfFile.getVersion() + "is disabled!");

    }

}
