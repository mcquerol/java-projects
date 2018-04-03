package me.bukkit.MatCeba14;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {

	@Override
	public void onEnable() {
		new ListenerClass(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("COMMAND1") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			return true;
			
		}
		
		return false;	
		
	}
	
}
