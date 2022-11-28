package net.BRUH_MOM.tippedtools.item;

import net.BRUH_MOM.tippedtools.TippedTools;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemsGroup {
    public static final ItemGroup TIPPED_TOOLS = FabricItemGroupBuilder.build(
            new Identifier(TippedTools.MOD_ID, "tipped_tools"), () -> new ItemStack(Items.EMERALD_TIPPED_SWORD));
}
