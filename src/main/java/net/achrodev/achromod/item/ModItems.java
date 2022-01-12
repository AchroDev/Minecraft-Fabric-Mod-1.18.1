package net.achrodev.achromod.item;

import net.achrodev.achromod.AchroMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MYTHRIL_ORE = registerItem("mythril_ore",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AchroMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AchroMod.LOGGER.info("Registering Mod Items for" + AchroMod.MOD_ID);
    }
}
