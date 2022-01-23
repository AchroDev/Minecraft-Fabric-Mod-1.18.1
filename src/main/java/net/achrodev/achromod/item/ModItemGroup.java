package net.achrodev.achromod.item;

import net.achrodev.achromod.AchroMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PERIDOT = FabricItemGroupBuilder.build(new Identifier(AchroMod.MOD_ID, "peridot"),
            () -> new ItemStack(ModItems.PERIDOT));
}
