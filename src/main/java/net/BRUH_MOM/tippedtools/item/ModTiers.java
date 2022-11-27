package net.BRUH_MOM.tippedtools.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    // Emerald Tools | Attack Damage = +.2 | Durability = Slightly More Than Iron Tools
    public static final ForgeTier EMERALD_SWORD = new ForgeTier(2, 374, 6f, 3.2f, 32, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier EMERALD_AXE = new ForgeTier(2, 374, 6f, 6.2f, 32, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier EMERALD_PICKAXE = new ForgeTier(2, 374, 6f, 1.2f, 32, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier EMERALD_SHOVEL = new ForgeTier(2, 374, 6f, 1.7f, 32, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier EMERALD_HOE = new ForgeTier(2, 374, 6f, -1.8f, 32, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD));
    // Diamond Tools | Attack Damage = Diamond Tools | Durability = 1/3 Of Diamond Tools + Iron Tools
    public static final ForgeTier DIAMOND_SWORD = new ForgeTier(3, 770, 8f, 3f, 14, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier DIAMOND_AXE = new ForgeTier(3, 770, 8f, 5f, 14, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier DIAMOND_PICKAXE = new ForgeTier(3, 770, 8f, 1f, 14, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier DIAMOND_SHOVEL = new ForgeTier(3, 770, 8f, 1.5f, 14, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier DIAMOND_HOE = new ForgeTier(3, 770, 8f, -3f, 14, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.DIAMOND));
    // Netherite Tools | Attack Damage = Netherite Tools | Durability = 1/3 Of Netherite Tools + Iron Tools
    public static final ForgeTier NETHERITE_SWORD = new ForgeTier(4, 927, 9f, 3f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_SCRAP));
    public static final ForgeTier NETHERITE_AXE = new ForgeTier(4, 927, 9f, 5f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_SCRAP));
    public static final ForgeTier NETHERITE_PICKAXE = new ForgeTier(4, 927, 9f, 1f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_SCRAP));
    public static final ForgeTier NETHERITE_SHOVEL = new ForgeTier(4, 927, 9f, 1.5f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_SCRAP));
    public static final ForgeTier NETHERITE_HOE = new ForgeTier(4, 927, 9f, -4f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_SCRAP));
    // Gold Tools | Attack Damage = +.1 | Durability = Iron + Gold Tools
    public static final ForgeTier GOLD_SWORD = new ForgeTier(2, 282, 12f, 3.1f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.GOLD_INGOT));
    public static final ForgeTier GOLD_AXE = new ForgeTier(2, 282, 12f, 6.1f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.GOLD_INGOT));
    public static final ForgeTier GOLD_PICKAXE = new ForgeTier(2, 282, 12f, 1.1f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.GOLD_INGOT));
    public static final ForgeTier GOLD_SHOVEL = new ForgeTier(2, 282, 12f, 1.6f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.GOLD_INGOT));
    public static final ForgeTier GOLD_HOE = new ForgeTier(2, 282, 12f, -1.9f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.GOLD_INGOT));

}


