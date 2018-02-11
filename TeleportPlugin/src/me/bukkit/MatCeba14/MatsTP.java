package me.bukkit.MatCeba14;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.Listener;
import org.bukkit.Material;
public class MatsTP extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		getLogger().info("MatsTP enabled");
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		Player pl = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("rtp") && sender instanceof Player) {
			
			//player.sendMessage("Hello, " + player.getName() + ", " + "Your coordinates are " + player.getLocation());
			
			Random rnd = new Random();
			
		
			int x = rnd.nextInt(1000) + 1;
			int y = pl.getWorld().getSeaLevel();
			int z = rnd.nextInt(1000) + 1;
			
		Location tpLoc = new Location(pl.getWorld(), x, y, z);
		
		Block block = pl.getLocation().getBlock().getRelative(BlockFace.DOWN);
		
		pl.teleport(tpLoc);
		while (block.getType() == Material.WATER) {	
			x = rnd.nextInt(1000) + 1;
			y = pl.getWorld().getSeaLevel();
			z = rnd.nextInt(1000) + 1;
			pl.teleport(tpLoc);
		}
		pl.sendMessage("You have been sent to: x = " + x + " y = " + y + " z = " + z);
		}
		return false;
	}
}
