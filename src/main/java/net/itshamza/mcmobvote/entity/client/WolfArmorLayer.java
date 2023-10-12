package net.itshamza.mcmobvote.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.itshamza.mcmobvote.entity.custom.WolfEntity;
import net.minecraft.client.model.WolfModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WolfArmorLayer extends RenderLayer<WolfEntity, WolfModel<WolfEntity>> {
    private static final ResourceLocation WOLF_ARMOR_LOCATION = new ResourceLocation("mcmobvote:textures/entity/wolf/wolf_armor.png");

    public WolfArmorLayer(RenderLayerParent<WolfEntity, WolfModel<WolfEntity>> p_117707_) {
        super(p_117707_);
    }

    public void render(PoseStack p_117720_, MultiBufferSource p_117721_, int p_117722_, WolfEntity p_117723_, float p_117724_, float p_117725_, float p_117726_, float p_117727_, float p_117728_, float p_117729_) {
        if (p_117723_.isTame() && !p_117723_.isInvisible() && p_117723_.isArmored()) {
            renderColoredCutoutModel(this.getParentModel(), WOLF_ARMOR_LOCATION, p_117720_, p_117721_, p_117722_, p_117723_, 115, 77,60);
        }
    }
}