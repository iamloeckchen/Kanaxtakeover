package de.mywork.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("opfer")) {
			
			if(sender instanceof Player) {
				
				Player player = (Player) sender;
				
				
				if(args.length == 0) {
					
					player.sendMessage("do you want to know if ur ein opfer? dann schreib nochmal opfer");
					
					
				}
					if(args.length == 1 && args[0].equalsIgnoreCase("opfer")) {
						
						player.sendMessage("ur an opfer");
						
					} else
						if(args.length == 2 && args[1].equalsIgnoreCase("?")) {
							
							player.sendMessage("u even questioning? \nshame on u");
							
						}
				
			} else {
			
			
			if(args.length == 0) {
				
	
				
				System.out.println("do you want to know if ur ein opfer?");
				
			}
				if(args.length == 1 && args[0].equalsIgnoreCase("opfer")) {
					
					System.out.println("ur an opfer");
					
				} else
					if(args.length == 2 && args[1].equalsIgnoreCase("?")) {
						
						System.out.println("u even questioning? \nshame on u");
						
					}
			}
					
			
		}
		return true;
	}

}
