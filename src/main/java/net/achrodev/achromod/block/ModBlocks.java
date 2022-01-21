package net.achrodev.achromod.block;

import net.achrodev.achromod.AchroMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block PERIDOT_ORE = registerBlock("peridot_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block NETHERRACK_PERIDOT_ORE = registerBlock("netherrack_peridot_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AchroMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AchroMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));

    }

    public static void registerModBlocks() {
        AchroMod.LOGGER.info("Registering ModBlocks for" + AchroMod.MOD_ID);
    }
}
