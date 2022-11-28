package net.BRUH_MOM.tippedtools.item;

import net.BRUH_MOM.tippedtools.TippedTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item EMERALD_TIPPED_SWORD = registerItem("emerald_tipped_sword",
            new SwordItem(ToolMaterials.IRON, -2, 2f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TippedTools.MOD_ID, name), item);
    }

    public static void registerItems() {
        TippedTools.LOGGER.debug("Registering Mod Items for " + TippedTools.MOD_ID);
    }

}
