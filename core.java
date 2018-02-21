package com.inition.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class core extends JavaPlugin {

		public void onEnable() {
			
			Bukkit.getConsoleSender().sendMessage("Acramus Core has been enabled!");
		}
		
		public void onDisable() {
			
			Bukkit.getConsoleSender().sendMessage("Acramus Core has been Disabled!");
		}
		
		
}
