package net.BRUH_MOM.tippedtools.item;

import net.BRUH_MOM.tippedtools.TippedTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;


public class Items {

    public static final Item EMERALD_TIPPED_SWORD = registerItem("emerald_tipped_sword",
            new SwordItem(ToolMaterials.IRON, -2, 2f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item EMERALD_TIPPED_AXE = registerItem("emerald_tipped_axe",
             new AxeItem(ToolMaterials.IRON, 2, -2.9f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item EMERALD_TIPPED_PICKAXE = registerItem("emerald_tipped_pickaxe",
             new PickaxeItem(ToolMaterials.IRON, 2, -2.6f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item EMERALD_TIPPED_SHOVEL = registerItem("emerald_tipped_shovel",
             new ShovelItem(ToolMaterials.IRON, 2, -2.8f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));


    // Diamond Tools |

    public static final Item DIAMOND_TIPPED_SWORD = registerItem("diamond_tipped_sword",
             new SwordItem(ToolMaterials.DIAMOND, 3, -2.4f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item DIAMOND_TIPPED_AXE = registerItem("diamond_tipped_axe",
             new AxeItem(ToolMaterials.DIAMOND, 3, -3f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item DIAMOND_TIPPED_PICKAXE = registerItem("diamond_tipped_pickaxe",
             new PickaxeItem(ToolMaterials.DIAMOND, 3, -2.8f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item DIAMOND_TIPPED_SHOVEL = registerItem("diamond_tipped_shovel",
             new ShovelItem(ToolMaterials.DIAMOND, 3, -3f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));

    // Netherite Tools |

    public static final Item NETHERITE_TIPPED_SWORD = registerItem("netherite_tipped_sword",
             new SwordItem(ToolMaterials.DIAMOND, 4, -2.4f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item NETHERITE_TIPPED_AXE = registerItem("netherite_tipped_axe",
             new AxeItem(ToolMaterials.DIAMOND, 4, -3f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item NETHERITE_TIPPED_PICKAXE = registerItem("netherite_tipped_pickaxe",
             new PickaxeItem(ToolMaterials.DIAMOND, 4, -2.8f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final Item NETHERiTE_TIPPED_SHOVEL = registerItem("netherite_tipped_shovel",
             new ShovelItem(ToolMaterials.DIAMOND, 4, -3f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));

    // Gold Tools | Attack Speed +.4

    public static final  Item GOLD_TIPPED_SWORD = registerItem("gold_tipped_sword",
             new SwordItem(ToolMaterials.GOLD, 2, -2f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final  Item GOLD_TIPPED_AXE = registerItem("gold_tipped_axe",
             new AxeItem(ToolMaterials.GOLD, 2, -2.7f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final  Item GOLD_TIPPED_PIACKAXE = registerItem("gold_tipped_pickaxe",
             new PickaxeItem(ToolMaterials.GOLD, 2, -2.4f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));
    public static final  Item GOLD_TIPPED_SHOVEL = registerItem("gold_tipped_shovel",
             new ShovelItem(ToolMaterials.GOLD, 2, -2.6f, new FabricItemSettings().group(ItemsGroup.TIPPED_TOOLS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TippedTools.MOD_ID, name), item);
    }

    public static void registerItems() {
        TippedTools.LOGGER.debug("Registering Mod Items for " + TippedTools.MOD_ID);
    }

}
