package net.Kyle.modLearning.item;

import net.Kyle.modLearning.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
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

    public static final TagKey<Block> PAXEL_BLOCKS = TagKey.create(ForgeRegistries.Keys.BLOCKS, ModItems.modResource("paxel_blocks"));

    public static final RegistryObject<Item> titanium_paxel = ITEMS.register("titanium_paxel",
            () -> new paxel(new ModToolTiers().TITANIUM,4f,
                    new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));


 public static final RegistryObject<Item> titanium_pickaxe = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(new ModToolTiers().TITANIUM,1,-2.8f, //p_42962 is attack damage, 0 == 4. Second parameter is att. speed. 0 == 4
                    new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));

 public static final RegistryObject<Item> titanium_shovel = ITEMS.register("titanium_shovel",
         () -> new ShovelItem(new ModToolTiers().TITANIUM,1.5f,-2f,
                 new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));

  public static final RegistryObject<Item> titanium_axe = ITEMS.register("titanium_axe",
         () -> new AxeItem(new ModToolTiers().TITANIUM,5,-2.2f,
                 new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));

  public static final RegistryObject<Item> titanium_hoe = ITEMS.register("titanium_hoe",
         () -> new HoeItem(new ModToolTiers().TITANIUM,-3,0f,
                 new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));
  public static final RegistryObject<Item> titanium_sword = ITEMS.register("titanium_sword",
          () -> new SwordItem(new ModToolTiers().TITANIUM, 3,-1.6f,
                  new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab).stacksTo(1)));
 public static final RegistryObject<Item> raw_titanium = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Example_mod_tab)));
    public static final ResourceLocation modResource(String name) {
        return new ResourceLocation(TutorialMod.MOD_ID, name);
    }



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
