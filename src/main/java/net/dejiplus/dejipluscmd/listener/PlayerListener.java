package net.dejiplus.dejipluscmd.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    //debug


    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {

        final Player player = event.getPlayer();

        Bukkit.getServer().broadcastMessage( player + "がログインしました。");

    }

}
