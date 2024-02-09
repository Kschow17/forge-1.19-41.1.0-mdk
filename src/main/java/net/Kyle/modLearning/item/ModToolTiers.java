package net.Kyle.modLearning.item;

import net.Kyle.modLearning.TutorialMod;
import net.Kyle.modLearning.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier TITANIUM;

    static {
        TITANIUM = TierSortingRegistry.registerTier(
                new ForgeTier(3,2000,9,3,12,
                        ModTags.Blocks.NEEDS_TITANIUM_TOOL, ()-> Ingredient.of(ModItems.titanium_ingot.get())),
                new ResourceLocation(TutorialMod.MOD_ID, "titanium"), List.of(Tiers.DIAMOND), List.of());
    }
}
