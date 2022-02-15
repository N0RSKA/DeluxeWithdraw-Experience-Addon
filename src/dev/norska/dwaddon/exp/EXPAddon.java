package dev.norska.dwaddon.exp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.iridium.iridiumcolorapi.IridiumColorAPI;

import dev.norska.dw.DeluxeWithdraw;
import dev.norska.dwaddon.exp.addon.EXPInterface;
import dev.norska.dwaddon.exp.ndev.NorskaHandler;
import lombok.Getter;

public class EXPAddon extends JavaPlugin {
	
	private static EXPAddon instance;
	public EXPAddon() { instance = this; }
	public static EXPAddon getInstance() { return instance; }
	
	@Getter private NorskaHandler nHandler = new NorskaHandler();
	
	public String prefix;
	
	public void onEnable() {
		
		prefix = Bukkit.getVersion().contains("1.16") || Bukkit.getVersion().contains("1.17") || Bukkit.getVersion().contains("1.18") ? IridiumColorAPI.process("§8[<GRADIENT:FFE818>&lDeluxeWithdraw EXP Addon</GRADIENT:B7FF1D>§8]§r") : IridiumColorAPI.process("&8[&e&lDeluxeWithdraw EXP Addon&8]&r");
		
		Bukkit.getConsoleSender().sendMessage(" ");
    	Bukkit.getConsoleSender().sendMessage(prefix + " §7" + getDescription().getVersion() + "§f, a §efreemium §faddon by §7Norska §f- §7Thanks for using!");
		Bukkit.getConsoleSender().sendMessage(" ");
		
		getNHandler().getConfigurationHandler().generateFiles(this);
		getNHandler().getCacheHandler().cache(this);
		
		try {
			DeluxeWithdraw.getInstance().getAddonProvider().registerNewProvider("EXP", new EXPInterface());
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
