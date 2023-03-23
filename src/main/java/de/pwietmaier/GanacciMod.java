package de.pwietmaier;

import de.pwietmaier.item.ModItems;
import de.pwietmaier.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GanacciMod implements ModInitializer {
	public static final String MOD_ID = "ganacci";
	public static final Logger LOGGER = LoggerFactory.getLogger("ganacci");

	@Override
	public void onInitialize() {
		ModSounds.registerModSounds();
		ModItems.registerModItems();
	}
}