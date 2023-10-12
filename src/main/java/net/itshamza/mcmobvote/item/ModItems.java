package net.itshamza.mcmobvote.item;

import net.itshamza.mcmobvote.MCMobVote;
import net.itshamza.mcmobvote.entity.ModEntityCreator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCMobVote.MOD_ID);

    public static final RegistryObject<Item> CRAB_SPAWN_EGG = ITEMS.register("crab_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.CRAB,16154955, 3564958,
                    new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB)));

    public static final RegistryObject<Item> CRAB_CLAW = ITEMS.register("crab_claw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB)));

    public static final RegistryObject<Item> RAW_CRAB_LEG = ITEMS.register("raw_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB).food(ModFoods.RAW_CRAB_LEG)));

    public static final RegistryObject<Item> COOKED_CRAB_LEG = ITEMS.register("cooked_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB).food(ModFoods.COOKED_CRAB_LEG)));

    public static final RegistryObject<Item> PENGUIN_SPAWN_EGG = ITEMS.register("penguin_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.PENGUIN,3091252, 15723748,
                    new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB)));

    public static final RegistryObject<Item> ARMADILLO_SPAWN_EGG = ITEMS.register("armadillo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityCreator.ARMADILLO,16154955, 3564958,
                    new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB)));

    public static final RegistryObject<Item> WOLF_ARMOR = ITEMS.register("wolf_armor",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB)));

    public static final RegistryObject<Item> ARMADILLO_SCUTE = ITEMS.register("armadillo_scute",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MOB_VOTE_TAB)));

   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
