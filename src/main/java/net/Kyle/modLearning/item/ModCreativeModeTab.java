package net.Kyle.modLearning.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Example_mod_tab = new CreativeModeTab("ExampleCreativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.titanium_ingot.get());
        }

    };
}
