package me.bukkit.MatCeba14;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ZombieKills extends JavaPlugin {

	@Override
	public void onEnable() {
		new ZombieListener(this);
		
		this.getConfig().addDefault("zombiekills", 0);
		this.getConfig().options().copyDefaults();
		saveConfig();
		
	}
	
	@Override
	public void onDisable() {
		saveConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("zombiekills") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.GOLD + "" + this.getConfig().getInt("zombiekills") + ChatColor.GREEN + " zombies " + ChatColor.GOLD + "have been killed!");
			
			return true;
			
		}
		
		return false;	
		
	}
	
}
