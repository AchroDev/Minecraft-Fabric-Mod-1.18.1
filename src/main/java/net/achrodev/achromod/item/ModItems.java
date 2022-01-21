package net.achrodev.achromod.item;

import net.achrodev.achromod.AchroMod;
import net.achrodev.achromod.item.custom.ModAxeItem;
import net.achrodev.achromod.item.custom.ModHoeItem;
import net.achrodev.achromod.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item PERIDOT = registerItem("peridot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    public static final Item PERIDOT_PICKAXE = registerItem("peridot_pickaxe",
            new ModPickaxeItem(ModToolMaterial.PERIDOT, 0, 2f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item PERIDOT_AXE = registerItem("peridot_axe",
            new ModAxeItem(ModToolMaterial.PERIDOT, 12, -1f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item PERIDOT_HOE = registerItem("peridot_hoe",
            new ModHoeItem(ModToolMaterial.PERIDOT, 0, 0f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item PERIDOT_SHOVEL = registerItem("peridot_shovel",
            new ShovelItem(ModToolMaterial.PERIDOT, 0, 2f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));

    public static final Item PERIDOT_SWORD = registerItem("peridot_sword",
            new SwordItem(ModToolMaterial.PERIDOT, 10, 3f,
                    (new FabricItemSettings().group(ItemGroup.TOOLS))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AchroMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AchroMod.LOGGER.info("Registering Mod Items for" + AchroMod.MOD_ID);
    }
}
