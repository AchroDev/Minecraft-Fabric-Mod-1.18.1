package net.achrodev.achromod;

import net.achrodev.achromod.block.ModBlocks;
import net.achrodev.achromod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AchroMod implements ModInitializer {

	public static final String MOD_ID = "achromod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);



	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
