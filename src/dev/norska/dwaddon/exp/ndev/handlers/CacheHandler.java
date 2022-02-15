package dev.norska.dwaddon.exp.ndev.handlers;

import java.util.List;

import dev.norska.dwaddon.exp.EXPAddon;
import lombok.Getter;

public class CacheHandler {
	
	@Getter private List<String> commands;
	@Getter private String creatorForAdminItems, itemLayout, currencyName;
	@Getter Double minWithdraw, maxWithdraw;
	@Getter int currencyFormat;

	public void cache(EXPAddon main) {

		commands = main.getNHandler().getConfigurationHandler().getConfigFile().getStringList("settings.commands");
		creatorForAdminItems = main.getNHandler().getConfigurationHandler().getConfigFile().getString("settings.creatorForAdminItems");
		itemLayout = main.getNHandler().getConfigurationHandler().getConfigFile().getString("settings.itemLayout");
			
		minWithdraw = main.getNHandler().getConfigurationHandler().getConfigFile().getDouble("settings.minMaxWithdraw.minWithdraw");
		maxWithdraw = main.getNHandler().getConfigurationHandler().getConfigFile().getDouble("settings.minMaxWithdraw.maxWithdraw");
		
		currencyName = main.getNHandler().getConfigurationHandler().getConfigFile().getString("settings.currencyName");
		currencyFormat = main.getNHandler().getConfigurationHandler().getConfigFile().getInt("settings.currencyFormat");
	}
	

}
