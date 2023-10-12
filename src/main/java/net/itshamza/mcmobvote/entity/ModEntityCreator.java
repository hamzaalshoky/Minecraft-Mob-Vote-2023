package net.itshamza.mcmobvote.entity;


import net.itshamza.mcmobvote.MCMobVote;
import net.itshamza.mcmobvote.entity.client.ArmadilloRenderer;
import net.itshamza.mcmobvote.entity.client.CrabRenderer;
import net.itshamza.mcmobvote.entity.client.PenguinRenderer;
import net.itshamza.mcmobvote.entity.client.WolfRenderer;
import net.itshamza.mcmobvote.entity.custom.ArmadilloEntity;
import net.itshamza.mcmobvote.entity.custom.CrabEntity;
import net.itshamza.mcmobvote.entity.custom.PenguinEntity;
import net.itshamza.mcmobvote.entity.custom.WolfEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = MCMobVote.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityCreator {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MCMobVote.MOD_ID);

    // REGESTRIES

    public static final RegistryObject<EntityType<CrabEntity>> CRAB = ENTITY_TYPES.register("crab", () -> EntityType.Builder.of(CrabEntity::new, MobCategory.CREATURE).sized(0.8F, 0.6F).build(new ResourceLocation(MCMobVote.MOD_ID, "crab").toString()));
    public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN = ENTITY_TYPES.register("penguin", () -> EntityType.Builder.of(PenguinEntity::new, MobCategory.CREATURE).sized(0.7F, 1.2F).build(new ResourceLocation(MCMobVote.MOD_ID, "penguin").toString()));
    public static final RegistryObject<EntityType<ArmadilloEntity>> ARMADILLO = ENTITY_TYPES.register("armadillo", () -> EntityType.Builder.of(ArmadilloEntity::new, MobCategory.CREATURE).sized(0.8F, 0.7F).build(new ResourceLocation(MCMobVote.MOD_ID, "armadillo").toString()));


    public static final RegistryObject<EntityType<WolfEntity>> WOLF = ENTITY_TYPES.register("wolf", () -> EntityType.Builder.of(WolfEntity::new, MobCategory.CREATURE).sized(0.6F, 0.85F).build(new ResourceLocation(MCMobVote.MOD_ID, "wolf").toString()));
    // ATTRIBUTES

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityCreator.CRAB.get(), CrabEntity.setAttributes());
        event.put(ModEntityCreator.PENGUIN.get(), PenguinEntity.setAttributes());
        event.put(ModEntityCreator.ARMADILLO.get(), ArmadilloEntity.setAttributes());

        event.put(ModEntityCreator.WOLF.get(), WolfEntity.createAttributes().build());
    }

    // RENDERERS

    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityCreator.CRAB.get(), CrabRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.PENGUIN.get(), PenguinRenderer::new);
        event.registerEntityRenderer(ModEntityCreator.ARMADILLO.get(), ArmadilloRenderer::new);

        event.registerEntityRenderer(ModEntityCreator.WOLF.get(), WolfRenderer::new);
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
