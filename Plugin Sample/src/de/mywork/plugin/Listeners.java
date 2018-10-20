package de.mywork.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listeners implements Listener {
	
	
	@SuppressWarnings("unused")
	private final Main main = new Main();
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		
		
		
		
		player.sendMessage(ChatColor.GRAY + player.getName() + ChatColor.RED + " Selamu 3leykum Shabab!");
		
		
		
	}
	
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		
		Player player = event.getPlayer();
		
		player.sendMessage(ChatColor.RED + player.getName() + ChatColor.GRAY + " hat den Server verlassen");
		
	}
	
	

}
