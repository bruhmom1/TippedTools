package net.BRUH_MOM.tippedtools.item;

import net.BRUH_MOM.tippedtools.TippedTools;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TippedTools.MOD_ID);

    // Emerald Tools | Attack Speed +.2

    public static final RegistryObject<Item> EMERALD_TIPPED_SWORD = ITEMS.register("emerald_tipped_sword",
            () -> new SwordItem(ModTiers.EMERALD_SWORD, 2, -2.2f, // attack speed
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> EMERALD_TIPPED_AXE = ITEMS.register("emerald_tipped_axe",
            () -> new AxeItem(ModTiers.EMERALD_AXE, 2, -2.9f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_TIPPED_PICKAXE = ITEMS.register("emerald_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.EMERALD_PICKAXE, 2, -2.6f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_TIPPED_SHOVEL = ITEMS.register("emerald_tipped_shovel",
            () -> new ShovelItem(ModTiers.EMERALD_SHOVEL, 2, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_TIPPED_HOE = ITEMS.register("emerald_tipped_hoe",
            () -> new HoeItem(ModTiers.EMERALD_HOE, 2, -0.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Diamond Tools |

    public static final RegistryObject<Item> DIAMOND_TIPPED_SWORD = ITEMS.register("diamond_tipped_sword",
            () -> new SwordItem(ModTiers.DIAMOND_SWORD, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_AXE = ITEMS.register("diamond_tipped_axe",
            () -> new AxeItem(ModTiers.DIAMOND_AXE, 3, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_PICKAXE = ITEMS.register("diamond_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.DIAMOND_PICKAXE, 3, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_SHOVEL = ITEMS.register("diamond_tipped_shovel",
            () -> new ShovelItem(ModTiers.DIAMOND_SHOVEL, 3, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_HOE = ITEMS.register("diamond_tipped_hoe",
            () -> new HoeItem(ModTiers.DIAMOND_HOE, 3, -0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Netherite Tools |

    public static final RegistryObject<Item> NETHERITE_TIPPED_SWORD = ITEMS.register("netherite_tipped_sword",
            () -> new SwordItem(ModTiers.NETHERITE_SWORD, 4, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_TIPPED_AXE = ITEMS.register("netherite_tipped_axe",
            () -> new AxeItem(ModTiers.NETHERITE_AXE, 4, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHERITE_TIPPED_PICKAXE = ITEMS.register("netherite_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE_PICKAXE, 4, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHERiTE_TIPPED_SHOVEL = ITEMS.register("netherite_tipped_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE_SHOVEL, 4, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHERITE_TIPPED_HOE = ITEMS.register("netherite_tipped_hoe",
            () -> new HoeItem(ModTiers.NETHERITE_HOE, 4, 0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Gold Tools | Attack Speed +.4

    public static final  RegistryObject<Item> GOLD_TIPPED_SWORD = ITEMS.register("gold_tipped_sword",
            () -> new SwordItem(ModTiers.GOLD_SWORD, 2, -2f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final  RegistryObject<Item> GOLD_TIPPED_AXE = ITEMS.register("gold_tipped_axe",
            () -> new AxeItem(ModTiers.GOLD_AXE, 2, -2.7f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final  RegistryObject<Item> GOLD_TIPPED_PIACKAXE = ITEMS.register("gold_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.GOLD_PICKAXE, 2, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final  RegistryObject<Item> GOLD_TIPPED_SHOVEL = ITEMS.register("gold_tipped_shovel",
            () -> new ShovelItem(ModTiers.GOLD_SHOVEL, 2, -2.6f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final  RegistryObject<Item> GOLD_TIPPED_HOE = ITEMS.register("gold_tipped_hoe",
            () -> new HoeItem(ModTiers.GOLD_HOE, 2, -0.6f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
