package me.bukkit.MatCeba14;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class ZombieListener implements Listener {

	ZombieKills configGetter;
	
	public ZombieListener(ZombieKills plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		configGetter = plugin;
	}

	@EventHandler
	public void KillZombie(EntityDeathEvent e) {

		Entity deadEntity = e.getEntity(); // killed
		Entity killer = e.getEntity().getKiller(); // killer

		if (killer instanceof Player && deadEntity instanceof Zombie) {

			Player player = (Player) killer;
			
			int killcount = configGetter.getConfig().getInt("zombiekills");
			
			configGetter.getConfig().set("zombiekills", killcount + 1);
			
			player.sendMessage(ChatColor.GREEN + "You have killed a zombie");
		}

	}

}