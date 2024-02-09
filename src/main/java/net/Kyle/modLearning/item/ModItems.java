package net.Kyle.modLearning.item;

import net.Kyle.modLearning.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.Kyle.modLearning.item.ModToolTiers;
import net.Kyle.modLearning.util.ModTags;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> titanium_ingot = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab)));

 public static final RegistryObject<Item> titanium_pickaxe = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(new ModToolTiers().TITANIUM,2,3,
                    new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));

 public static final RegistryObject<Item> raw_titanium = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
