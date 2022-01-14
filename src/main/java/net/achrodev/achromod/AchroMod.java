package net.achrodev.achromod;

import com.sun.jna.WString;
import net.achrodev.achromod.block.ModBlocks;
import net.achrodev.achromod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.registry.Registry;

public class AchroMod implements ModInitializer {

	public static final String MOD_ID = "achromod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);



	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
