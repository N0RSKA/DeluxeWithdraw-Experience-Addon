package dev.norska.dwaddon.exp.addon;

import java.io.IOException;
import java.util.List;

import org.bukkit.entity.Player;

import dev.norska.dw.api.DWAddonInterface;
import dev.norska.dwaddon.exp.EXPAddon;
import dev.norska.dwaddon.exp.utils.ExperienceHandler;

public class EXPInterface implements DWAddonInterface {

	@Override
	public void add(Player p, Double amount) {
		ExperienceHandler.setTotalExperience(p, ExperienceHandler.getTotalExperience(p) + amount.intValue());
	}

	@Override
	public void add(Player p, Integer amount) {
		ExperienceHandler.setTotalExperience(p, ExperienceHandler.getTotalExperience(p) + amount);
	}

	@Override
	public String adminCreator() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getCreatorForAdminItems();
	}

	@Override
	public int currencyFormat() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getCurrencyFormat();
	}

	@Override
	public String currencyString() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getCurrencyName();
	}

	@Override
	public Double getCurrent(Player p) {
		return (double) ExperienceHandler.getTotalExperience(p);
	}

	@Override
	public Boolean has(Player p, Double amount) {
		return ExperienceHandler.getTotalExperience(p) >= amount;
	}

	@Override
	public Boolean has(Player p, Integer amount) {
		return ExperienceHandler.getTotalExperience(p) >= amount;
	}

	@Override
	public String layout() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getItemLayout();
	}

	@Override
	public Double maxWithdraw() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getMaxWithdraw();
	}

	@Override
	public Double minWithdraw() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getMinWithdraw();
	}

	@Override
	public void set(Player p, Double arg1) {
		
		
	}

	@Override
	public void set(Player p, Integer amount) {
		
	}

	@Override
	public void take(Player p, Double amount) {
		ExperienceHandler.setTotalExperience(p, ExperienceHandler.getTotalExperience(p) - amount.intValue());
	}

	@Override
	public void take(Player p, Integer amount) {
		ExperienceHandler.setTotalExperience(p, ExperienceHandler.getTotalExperience(p) - amount);
	}

	@Override
	public List<String> withdrawCommands() {
		return EXPAddon.getInstance().getNHandler().getCacheHandler().getCommands();
	}

	@Override
	public void reloadConfiguration() {
		EXPAddon.getInstance().generateFiles();
		EXPAddon.getInstance().cache();
	}

	@Override
	public Boolean useInt() {
		return true;
	}

}
