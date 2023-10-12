package net.itshamza.mcmobvote.entity.client;

import net.itshamza.mcmobvote.MCMobVote;
import net.itshamza.mcmobvote.entity.custom.CrabEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrabModel extends AnimatedGeoModel<CrabEntity> {
    private static final ResourceLocation MODEL = new ResourceLocation("mcmobvote:geo/crab.geo.json");
    private static final ResourceLocation CLAWLESS = new ResourceLocation("mcmobvote:geo/crab_clawless.geo.json");

    private static final ResourceLocation TEXTURE = new ResourceLocation("mcmobvote:textures/entity/crab/crab.png");

    @Override
    public ResourceLocation getModelResource(CrabEntity object) {
        return object.isSitting() ? CLAWLESS : MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(CrabEntity object) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(CrabEntity animatable) {
        return new ResourceLocation(MCMobVote.MOD_ID, "animations/crab.animation.json");
    }
}
