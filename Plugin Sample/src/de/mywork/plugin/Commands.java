package de.mywork.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("opfer")) {
			
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
		return true;
	}

}
