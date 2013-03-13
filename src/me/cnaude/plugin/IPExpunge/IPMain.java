package me.cnaude.plugin.IPExpunge;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class IPMain extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable() {    
        getServer().getPluginManager().registerEvents(this, this);        
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        if (event.isCancelled()) {
            return;
        }
        event.setMessage(event.getMessage().replaceAll("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}.\\d{1,3}", ""));        
    }
}
