package net.itshamza.mcmobvote.event;

import net.itshamza.mcmobvote.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mcmodvote", bus = Mod.EventBusSubscriber.Bus.MOD)
public class OffhandItemHandler {
    private static final double DEFAULT_REACH = 5.0; // Default player reach in blocks
    private static final double REACH_EXTENSION = 1.0; // Reach extension in blocks
    private static final double MAX_REACH = 10.0; // Maximum reach in blocks

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END && event.player != null) {
            Player player = event.player;
            if (player.getOffhandItem().getItem() == ModItems.CRAB_CLAW.get()) {
                // Extend the player's reach up to the maximum limit
                double newReach = player.getAttribute(ForgeMod.REACH_DISTANCE.get()).getBaseValue() + REACH_EXTENSION;
                double finalReach = Math.min(newReach, MAX_REACH);
                player.getAttribute(ForgeMod.REACH_DISTANCE.get()).setBaseValue(finalReach);
            } else {
                // Reset the player's reach to the default value when not holding the offhand item
                player.getAttribute(ForgeMod.REACH_DISTANCE.get()).setBaseValue(DEFAULT_REACH);
            }
        }
    }

    public static void register() {
        MinecraftForge.EVENT_BUS.register(OffhandItemHandler.class);
    }
}
