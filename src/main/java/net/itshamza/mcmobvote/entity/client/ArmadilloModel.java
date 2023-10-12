package net.itshamza.mcmobvote.entity.client;

import net.itshamza.mcmobvote.MCMobVote;
import net.itshamza.mcmobvote.entity.custom.ArmadilloEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ArmadilloModel extends AnimatedGeoModel<ArmadilloEntity> {
    private static final ResourceLocation MODEL = new ResourceLocation("mcmobvote:geo/armadillo.geo.json");
    private static final ResourceLocation ARMORED = new ResourceLocation("mcmobvote:geo/armadillo_armored.geo.json");
    private static final ResourceLocation TEXTURE = new ResourceLocation("mcmobvote:textures/entity/armadillo/armadillo.png");

    @Override
    public ResourceLocation getModelResource(ArmadilloEntity object) {
        return object.isRolledUp ? ARMORED : MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(ArmadilloEntity object) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(ArmadilloEntity animatable) {
        return new ResourceLocation(MCMobVote.MOD_ID, "animations/armadillo.animation.json");
    }
}
