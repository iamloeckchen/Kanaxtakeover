package de.mywork.plugin;

import java.io.File;
import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {
	
	private final Listeners listeners = new Listeners();
	private final Commands commands = new Commands();	
	private final Status state = new Status();
	private Gamestates gs;
	
	
	
	@Override
	public void onEnable() {
		
		loadCommands();
		loadListeners();
		
		state.setGamestate(gs.Lobby);
		
		System.out.println(" loaded  ");
	}
	
	
	@Override
	public void onDisable() {
		
		
	
		System.out.println(" disabled  ");
	}
	
	
	
	public void loadCommands() {
		
		
		this.getCommand("lucie").setExecutor(commands);
		
		System.out.println("all commands registered and loaded");
		
	}
	
	public void loadListeners() {
		
		this.getServer().getPluginManager().registerEvents(listeners, this);
		
		
		System.out.println("all listeners registered and loaded");
	}
	
	public void loadConfig() {
		
		File config = new File("src/config.yml");
		
		if(!config.exists()) {
			
			try {
				config.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	

}
