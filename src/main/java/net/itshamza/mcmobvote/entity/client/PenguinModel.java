package net.itshamza.mcmobvote.entity.client;

import net.itshamza.mcmobvote.MCMobVote;
import net.itshamza.mcmobvote.entity.custom.PenguinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PenguinModel extends AnimatedGeoModel<PenguinEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mcmobvote:textures/entity/penguin/penguin.png");

    @Override
    public ResourceLocation getModelResource(PenguinEntity object) {
        return new ResourceLocation(MCMobVote.MOD_ID, "geo/penguin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PenguinEntity object) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(PenguinEntity animatable) {
        return new ResourceLocation(MCMobVote.MOD_ID, "animations/penguin.animation.json");
    }
}
