/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.LivingEntity
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.model.provider.GeoModelProvider
 *  software.bernie.geckolib3.renderers.geo.GeoEntityRenderer
 *  software.bernie.geckolib3.renderers.geo.GeoLayerRenderer
 *  software.bernie.geckolib3.renderers.geo.IGeoRenderer
 */
package net.mcreator.simplemobs.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.simplemobs.client.DragonLordModel;
import net.mcreator.simplemobs.entity.DragonLordEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class DragonLordRenderer
extends GeoEntityRenderer<DragonLordEntity> {
    protected final GeoLayerRenderer<DragonLordEntity> glowLayer = new GeoLayerRenderer<DragonLordEntity>((IGeoRenderer)this){

        public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, DragonLordEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            RenderType renderType = null;
            if (entity.f_19797_ > 1) {
                int tick = entity.f_19797_;
                renderType = tick % 6 < 2 ? RenderType.m_110488_((ResourceLocation)new ResourceLocation("simple_mobs:textures/entities/dragon_lord/dragon_lord_1_glow.png")) : (tick % 6 < 3 ? RenderType.m_110488_((ResourceLocation)new ResourceLocation("simple_mobs:textures/entities/dragon_lord/dragon_lord_2_glow.png")) : (tick % 6 < 4 ? RenderType.m_110488_((ResourceLocation)new ResourceLocation("simple_mobs:textures/entities/dragon_lord/dragon_lord_3_glow.png")) : (tick % 6 < 5 ? RenderType.m_110488_((ResourceLocation)new ResourceLocation("simple_mobs:textures/entities/dragon_lord/dragon_lord_4_glow.png")) : RenderType.m_110488_((ResourceLocation)new ResourceLocation("simple_mobs:textures/entities/dragon_lord/dragon_lord_5_glow.png")))));
                VertexConsumer ivertexbuilder = buffer.m_6299_(renderType);
                GeoModelProvider provider = this.getEntityModel();
                this.getRenderer().render(provider.getModel(provider.getModelLocation((Object)entity)), (Object)entity, partialTicks, renderType, poseStack, buffer, ivertexbuilder, 0xF00000, OverlayTexture.f_118083_, 1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    };

    public DragonLordRenderer(EntityRendererProvider.Context context) {
        super(context, (AnimatedGeoModel)new DragonLordModel());
        this.addLayer(this.glowLayer);
    }

    protected float getDeathMaxRotation(DragonLordEntity entityLivingBaseIn) {
        return 0.0f;
    }

    public void render(DragonLordEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn, int packedLightIn) {
        if (entity.f_19797_ > 1) {
            super.render((LivingEntity)entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
        }
    }
}
