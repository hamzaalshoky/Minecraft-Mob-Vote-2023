package net.itshamza.mcmobvote.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.itshamza.mcmobvote.entity.custom.ArmadilloEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ArmadilloRenderer extends GeoEntityRenderer<ArmadilloEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mcmobvote:textures/entity/armadillo/armadillo.png");

    public ArmadilloRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ArmadilloModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(ArmadilloEntity instance) {
        return TEXTURE;
    }


    @Override
    public RenderType getRenderType(ArmadilloEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
