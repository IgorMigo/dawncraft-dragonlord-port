/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.IBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.model.provider.data.EntityModelData
 */
package net.mcreator.simplemobs.client;

import net.mcreator.simplemobs.entity.DragonLordEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class DragonLordModel
extends AnimatedGeoModel<DragonLordEntity> {
    public ResourceLocation getModelLocation(DragonLordEntity object) {
        return new ResourceLocation("simple_mobs", "geo/dragon_lord.geo.json");
    }

    public ResourceLocation getTextureLocation(DragonLordEntity object) {
        return new ResourceLocation("simple_mobs:textures/entities/dragon_lord/dragon_lord.png");
    }

    public ResourceLocation getAnimationFileLocation(DragonLordEntity animatable) {
        return new ResourceLocation("simple_mobs", "animations/dragon_lord.animation.json");
    }

    public void setLivingAnimations(DragonLordEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations((IAnimatable)entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData)customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        head.setRotationY(extraData.netHeadYaw * 0.4f * ((float)Math.PI / 180));
        head.setRotationX(extraData.headPitch * ((float)Math.PI / 180));
        super.setLivingAnimations((IAnimatable)entity, uniqueID, customPredicate);
        IBone head2 = this.getAnimationProcessor().getBone("head2");
        DragonLordEntity entityIn = entity;
        head2.setRotationY(extraData.netHeadYaw * 0.4f * ((float)Math.PI / 180));
        head2.setRotationX(extraData.headPitch * ((float)Math.PI / 180));
        super.setLivingAnimations((IAnimatable)entity, uniqueID, customPredicate);
        IBone head3 = this.getAnimationProcessor().getBone("head3");
        head3.setRotationY(extraData.netHeadYaw * 0.4f * ((float)Math.PI / 180));
        head3.setRotationX(extraData.headPitch * ((float)Math.PI / 180));
        super.setLivingAnimations((IAnimatable)entity, uniqueID, customPredicate);
        IBone neck_1 = this.getAnimationProcessor().getBone("neck2_a1");
        neck_1.setRotationZ(extraData.netHeadYaw * 0.4f * ((float)(-Math.PI) / 180));
        neck_1.setRotationX(extraData.headPitch * ((float)Math.PI / 180));
        super.setLivingAnimations((IAnimatable)entity, uniqueID, customPredicate);
        IBone neck_2 = this.getAnimationProcessor().getBone("neck2_a2");
        neck_2.setRotationZ(extraData.netHeadYaw * 0.4f * ((float)(-Math.PI) / 180));
        neck_2.setRotationX(extraData.headPitch * ((float)Math.PI / 180));
        super.setLivingAnimations((IAnimatable)entity, uniqueID, customPredicate);
        IBone neck_3 = this.getAnimationProcessor().getBone("neck2_a3");
        neck_3.setRotationZ(extraData.netHeadYaw * 0.4f * ((float)(-Math.PI) / 180));
        neck_3.setRotationX(extraData.headPitch * ((float)Math.PI / 180));
    }
}
