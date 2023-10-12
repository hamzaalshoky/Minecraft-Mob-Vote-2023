package net.itshamza.mcmobvote.event;

import net.itshamza.mcmobvote.MCMobVote;
import net.itshamza.mcmobvote.entity.ModEntityCreator;
import net.itshamza.mcmobvote.entity.custom.WolfEntity;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MCMobVote.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WolfReplacementHandler {

    @SubscribeEvent
    public static void onEntityJoinWorld(LivingSpawnEvent.SpecialSpawn event) {
        if (event.getEntity() instanceof Wolf) {
            Wolf wolf = (Wolf) event.getEntity();
            event.setCanceled(true); // Prevent the wolf from spawning

            // Spawn your custom mob entity in place of the wolf
            WolfEntity customMob = new WolfEntity(ModEntityCreator.WOLF.get(), wolf.getLevel());
            customMob.setPos(wolf.position().x, wolf.position().y, wolf.position().z);
            wolf.getLevel().addFreshEntity(customMob);
        }
    }
}
