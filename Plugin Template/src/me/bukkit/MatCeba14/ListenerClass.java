package me.bukkit.MatCeba14;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ListenerClass implements Listener {
	
	public ListenerClass(Template plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	
	@EventHandler
	public void onEvent(BlockPlaceEvent e) {
		
		Player player = e.getPlayer();

		e.setCancelled(true);
		
	}
	
}