package net.dejiplus.dejipluscmd;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class dejiplusCmd extends JavaPlugin{

    // Loggger
    public final static Logger log = Logger.getLogger("Minecraft");
    public final static String logPrefix = "[dejiplusCmd] ";
    public final static String msgPrefix = "[DC] ";

    public void onEnable() {

        PluginDescriptionFile pdfFile = this.getDescription();
        log.info("[" + pdfFile.getName() + "] version " + pdfFile.getVersion() + " is enabled!");

    }

    public void onDisable() {

        PluginDescriptionFile pdfFile = this.getDescription();
        log.info("[" + pdfFile.getName() + "} version " + pdfFile.getVersion() + "is disabled!");

    }

}
