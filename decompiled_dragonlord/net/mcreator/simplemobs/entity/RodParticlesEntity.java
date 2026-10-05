/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.util.Mth
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.control.FlyingMoveControl
 *  net.minecraft.world.entity.ai.navigation.FlyingPathNavigation
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.simplemobs.entity;

import java.util.Random;
import net.mcreator.simplemobs.init.SimpleMobsModEntities;
import net.mcreator.simplemobs.init.SimpleMobsModParticleTypes;
import net.mcreator.simplemobs.procedures.ProrodProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class RodParticlesEntity
extends PathfinderMob {
    public RodParticlesEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<RodParticlesEntity>)((EntityType)SimpleMobsModEntities.ROD_PARTICLES.get()), world);
    }

    public RodParticlesEntity(EntityType<RodParticlesEntity> type, Level world) {
        super(type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
        this.f_21342_ = new FlyingMoveControl((Mob)this, 10, true);
    }

    public Packet<?> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected PathNavigation m_6037_(Level world) {
        return new FlyingPathNavigation((Mob)this, world);
    }

    protected void m_8099_() {
        super.m_8099_();
    }

    public MobType m_6336_() {
        return MobType.f_21640_;
    }

    public boolean m_6785_(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent m_7975_(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    public SoundEvent m_5592_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    public boolean m_142535_(float l, float d, DamageSource source) {
        return false;
    }

    public void m_6075_() {
        super.m_6075_();
        this.f_19853_.m_6485_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), true, this.m_20185_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), this.m_20186_() + (double)Mth.m_14072_((Random)new Random(), (int)-1, (int)1), this.m_20189_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), 0.0, 0.0, 0.0);
        this.f_19853_.m_6485_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), true, this.m_20185_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), this.m_20186_() + (double)Mth.m_14072_((Random)new Random(), (int)-1, (int)1), this.m_20189_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), 0.0, 0.0, 0.0);
        this.f_19853_.m_6485_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), true, this.m_20185_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), this.m_20186_() + (double)Mth.m_14072_((Random)new Random(), (int)-1, (int)1), this.m_20189_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), 0.0, 0.0, 0.0);
        this.f_19853_.m_6485_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.EXPLOSION.get()), true, this.m_20185_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), this.m_20186_() + (double)Mth.m_14072_((Random)new Random(), (int)-3, (int)0), this.m_20189_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), 0.0, 0.0, 0.0);
        this.f_19853_.m_6485_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.EXPLOSION.get()), true, this.m_20185_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), this.m_20186_() + (double)Mth.m_14072_((Random)new Random(), (int)-3, (int)0), this.m_20189_() + (double)Mth.m_14072_((Random)new Random(), (int)-15, (int)15), 0.0, 0.0, 0.0);
        ProrodProcedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
    }

    public boolean m_6094_() {
        return false;
    }

    public boolean m_7313_(Entity entity) {
        return true;
    }

    public boolean m_6469_(DamageSource source, float amount) {
        return source == DamageSource.f_19317_ ? super.m_6469_(source, amount) : false;
    }

    protected void m_7324_(Entity entityIn) {
    }

    protected void m_6138_() {
    }

    protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    public void m_20242_(boolean ignored) {
        super.m_20242_(true);
    }

    public void m_8107_() {
        super.m_8107_();
        this.m_20242_(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.3);
        builder = builder.m_22268_(Attributes.f_22276_, 100.0);
        builder = builder.m_22268_(Attributes.f_22284_, 0.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 16.0);
        builder = builder.m_22268_(Attributes.f_22280_, 0.3);
        return builder;
    }
}
