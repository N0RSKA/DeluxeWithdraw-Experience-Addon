package dev.norska.dwaddon.exp.ndev;

import dev.norska.dwaddon.exp.ndev.handlers.CacheHandler;
import dev.norska.dwaddon.exp.ndev.handlers.ConfigHandler;
import lombok.Getter;

public class NorskaHandler {
	
	@Getter private CacheHandler cacheHandler = new CacheHandler();
	@Getter private ConfigHandler configurationHandler = new ConfigHandler();

}
