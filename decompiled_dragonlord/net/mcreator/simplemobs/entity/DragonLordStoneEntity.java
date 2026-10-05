/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.control.FlyingMoveControl
 *  net.minecraft.world.entity.ai.navigation.FlyingPathNavigation
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
 *  net.minecraft.world.entity.monster.Monster
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.simplemobs.entity;

import net.mcreator.simplemobs.init.SimpleMobsModEntities;
import net.mcreator.simplemobs.procedures.ProdlactivateProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class DragonLordStoneEntity
extends Monster {
    public DragonLordStoneEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<DragonLordStoneEntity>)((EntityType)SimpleMobsModEntities.DRAGON_LORD_STONE.get()), world);
    }

    public DragonLordStoneEntity(EntityType<DragonLordStoneEntity> type, Level world) {
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

    public boolean m_6094_() {
        return false;
    }

    protected void m_6138_() {
    }

    public void m_5997_(double pX, double pY, double pZ) {
    }

    protected void m_7324_(Entity entityIn) {
    }

    public void m_20242_(boolean ignored) {
        super.m_20242_(true);
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

    public boolean m_6469_(DamageSource source, float amount) {
        ProdlactivateProcedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this, source.m_7639_());
        if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() != Items.f_42000_) {
            return source == DamageSource.f_19317_ ? super.m_6469_(source, amount) : false;
        }
        return super.m_6469_(source, amount);
    }

    protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
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
        builder = builder.m_22268_(Attributes.f_22276_, 10.0);
        builder = builder.m_22268_(Attributes.f_22284_, 0.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 16.0);
        builder = builder.m_22268_(Attributes.f_22280_, 0.3);
        return builder;
    }
}
