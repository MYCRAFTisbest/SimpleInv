package me.dakotarino.SimpleINV;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleINV extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Minecraft");

	
	 public static SimpleINV plugin;

	 @Override
	 public void onDisable() {
	      PluginDescriptionFile pdfFile = this.getDescription();
	      this.logger.info(pdfFile.getName() + " Has Been Disabled");
	 
	 }
		 
	 @Override
	 public void onEnable() {
		 PluginDescriptionFile pdfFile = this.getDescription();
	     this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +  " Has Been Enabled");
	 }
	
	
	
}
