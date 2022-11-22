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

    // Emerald Tools

    public static final RegistryObject<Item> EMERALD_TIPPED_SWORD = ITEMS.register("emerald_tipped_sword",
            () -> new SwordItem(ModTiers.EMERALD_SWORD, 2, -2.4f,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> EMERALD_TIPPED_AXE = ITEMS.register("emerald_tipped_axe",
            () -> new AxeItem(ModTiers.EMERALD_AXE, 2, -2.8f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_TIPPED_PICKAXE = ITEMS.register("emerald_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.EMERALD_PICKAXE, 2, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_TIPPED_SHOVEL = ITEMS.register("emerald_tipped_shovel",
            () -> new ShovelItem(ModTiers.EMERALD_SHOVEL, 2, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_TIPPED_HOE = ITEMS.register("emerald_tipped_HOE",
            () -> new HoeItem(ModTiers.EMERALD_HOE, 2, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Diamond Tools

    public static final RegistryObject<Item> DIAMOND_TIPPED_SWORD = ITEMS.register("diamond_tipped_sword",
            () -> new SwordItem(ModTiers.DIAMOND_SWORD, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_AXE = ITEMS.register("diamond_tipped_axe",
            () -> new AxeItem(ModTiers.DIAMOND_AXE, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_PICKAXE = ITEMS.register("diamond_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.DIAMOND_PICKAXE, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_SHOVEL = ITEMS.register("diamond_tipped_shovel",
            () -> new ShovelItem(ModTiers.DIAMOND_SHOVEL, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_TIPPED_HOE = ITEMS.register("diamond_tipped_hoe",
            () -> new HoeItem(ModTiers.DIAMOND_HOE, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Netherite Tools

    public static final RegistryObject<Item> NETHERITE_TIPPED_SWORD = ITEMS.register("netherite_tipped_sword",
            () -> new SwordItem(ModTiers.NETHERITE_SWORD, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_TIPPED_AXE = ITEMS.register("netherite_tipped_axe",
            () -> new AxeItem(ModTiers.NETHERITE_AXE, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHERITE_TIPPED_PICKAXE = ITEMS.register("netherite_tipped_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE_PICKAXE, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHERiTE_TIPPED_SHOVEL = ITEMS.register("netherite_tipped_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE_SHOVEL, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> NETHERITE_TIPPED_HOE = ITEMS.register("netherite_tipped_hoe",
            () -> new HoeItem(ModTiers.NETHERITE_HOE, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
