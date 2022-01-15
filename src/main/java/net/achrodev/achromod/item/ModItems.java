package net.achrodev.achromod.item;

import net.achrodev.achromod.AchroMod;
import net.achrodev.achromod.item.custom.ModAxeItem;
import net.achrodev.achromod.item.custom.ModHoeItem;
import net.achrodev.achromod.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.tools.Tool;


public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new ModPickaxeItem(ModToolMaterial.MYTHRIL, 0, 2f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModAxeItem(ModToolMaterial.MYTHRIL, 12, -1f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoeItem(ModToolMaterial.MYTHRIL, 0, 0f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterial.MYTHRIL, 0, 2f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new SwordItem(ModToolMaterial.MYTHRIL, 10, 3f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AchroMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AchroMod.LOGGER.info("Registering Mod Items for" + AchroMod.MOD_ID);
    }
}
