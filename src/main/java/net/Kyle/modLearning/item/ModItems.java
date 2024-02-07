package net.Kyle.modLearning.item;

import net.Kyle.modLearning.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> test = ITEMS.register("placeholder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
