package net.achrodev.achromod;

import net.achrodev.achromod.block.ModBlocks;
import net.achrodev.achromod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AchroMod implements ModInitializer {

	public static final String MOD_ID = "achromod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	//Beginning of Ore Generation

	//Overworld - Regular Stone
	private static ConfiguredFeature<?, ?> PERIDOT_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
					ModBlocks.PERIDOT_ORE.getDefaultState(),
					7)); // vein size

	public static PlacedFeature PERIDOT_ORE_PLACED_FEATURE = PERIDOT_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(20), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height

	//Overworld - Deepslate Stone
	private static ConfiguredFeature<?, ?> DEEPSLATE_PERIDOT_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
					ModBlocks.DEEPSLATE_PERIDOT_ORE.getDefaultState(),
					7)); // vein size

	public static PlacedFeature DEEPSLATE_PERIDOT_ORE_PLACED_FEATURE = DEEPSLATE_PERIDOT_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(20), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height

	//Nether
	private static ConfiguredFeature<?, ?> NETHER_PERIDOT_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					OreConfiguredFeatures.NETHERRACK,
					ModBlocks.NETHERRACK_PERIDOT_ORE.getDefaultState(),
					7)); // vein size


	public static PlacedFeature NETHER_PERIDOT_ORE_PLACED_FEATURE = NETHER_PERIDOT_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(20), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//End of Ore Generation

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//Beginning of Ore Generation Registry

		//Overworld - Regular Stone
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("achromod", "peridot_ore"), PERIDOT_ORE_CONFIGURED_FEATURE);

		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("achromod", "peridot_ore"),
				PERIDOT_ORE_PLACED_FEATURE);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("achromod", "peridot_ore")));

		//Overworld - Deepslate Stone
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("achromod", "deepslate_peridot_ore"), DEEPSLATE_PERIDOT_ORE_CONFIGURED_FEATURE);

		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("achromod", "deepslate_peridot_ore"),
				DEEPSLATE_PERIDOT_ORE_PLACED_FEATURE);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("achromod", "deepslate_peridot_ore")));

		//Nether
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("achromod", "netherrack_peridot_ore"), NETHER_PERIDOT_ORE_CONFIGURED_FEATURE);

		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("achromod", "netherrack_peridot_ore"),
				NETHER_PERIDOT_ORE_PLACED_FEATURE);

		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("achromod", "netherrack_peridot_ore")));

		//End of Ore Generation Registry
	}
}
