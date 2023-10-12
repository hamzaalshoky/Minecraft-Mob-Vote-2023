package net.itshamza.mcmobvote.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab MOB_VOTE_TAB = new CreativeModeTab("mob_vote_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CRAB_SPAWN_EGG.get());
        }
    };
}
