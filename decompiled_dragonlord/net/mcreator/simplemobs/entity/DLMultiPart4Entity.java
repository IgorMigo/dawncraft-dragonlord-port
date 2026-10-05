/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.SpawnGroupData
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.monster.Monster
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.simplemobs.entity;

import javax.annotation.Nullable;
import net.mcreator.simplemobs.init.SimpleMobsModEntities;
import net.mcreator.simplemobs.procedures.ProDragMultiPart41Procedure;
import net.mcreator.simplemobs.procedures.Promulti1hurtProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class DLMultiPart4Entity
extends Monster {
    public DLMultiPart4Entity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<DLMultiPart4Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_4.get()), world);
    }

    public DLMultiPart4Entity(EntityType<DLMultiPart4Entity> type, Level world) {
        super(type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
    }

    public Packet<?> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
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

    public boolean m_5825_() {
        return true;
    }

    public boolean m_6469_(DamageSource source, float amount) {
        if (source == DamageSource.f_19310_) {
            return false;
        }
        Promulti1hurtProcedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this, source.m_7639_(), amount);
        return super.m_6469_(source, amount);
    }

    public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
        this.getPersistentData().m_128379_("dragon_lord", true);
        return retval;
    }

    public boolean m_142535_(float l, float d, DamageSource source) {
        return false;
    }

    public SoundEvent m_7975_(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    public void m_20242_(boolean ignored) {
        super.m_20242_(true);
    }

    public void m_8107_() {
        super.m_8107_();
        this.m_20242_(true);
    }

    public SoundEvent m_5592_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    public void m_6075_() {
        super.m_6075_();
        ProDragMultiPart41Procedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
    }

    public boolean m_6094_() {
        return false;
    }

    protected void m_7324_(Entity entityIn) {
    }

    protected void m_6138_() {
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.3);
        builder = builder.m_22268_(Attributes.f_22276_, 500.0);
        builder = builder.m_22268_(Attributes.f_22284_, 8.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 16.0);
        return builder;
    }
}
