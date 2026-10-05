/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerBossEvent
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.BossEvent$BossBarColor
 *  net.minecraft.world.BossEvent$BossBarOverlay
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.AreaEffectCloud
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.SpawnGroupData
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.goal.FloatGoal
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal
 *  net.minecraft.world.entity.monster.Monster
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.builder.AnimationBuilder
 *  software.bernie.geckolib3.core.controller.AnimationController
 *  software.bernie.geckolib3.core.event.SoundKeyframeEvent
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 *  software.bernie.geckolib3.core.manager.AnimationFactory
 */
package net.mcreator.simplemobs.entity;

import javax.annotation.Nullable;
import net.mcreator.simplemobs.entity.NineTailsEntity;
import net.mcreator.simplemobs.init.SimpleMobsModEntities;
import net.mcreator.simplemobs.procedures.DragonLordSpawnProcedure;
import net.mcreator.simplemobs.procedures.NoaiProcedure;
import net.mcreator.simplemobs.procedures.ProDLHurtProcedure;
import net.mcreator.simplemobs.procedures.ProDragonLordProcedure;
import net.mcreator.simplemobs.procedures.ProdldeathProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class DragonLordEntity
extends Monster
implements IAnimatable {
    private final ServerBossEvent bossInfo = new ServerBossEvent(this.m_5446_(), BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS);
    private final AnimationFactory factory = new AnimationFactory((IAnimatable)this);

    public DragonLordEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<DragonLordEntity>)((EntityType)SimpleMobsModEntities.DRAGON_LORD.get()), world);
    }

    public DragonLordEntity(EntityType<DragonLordEntity> type, Level world) {
        super(type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.f_19811_ = true;
        this.f_19793_ = 4.0f;
        this.m_21530_();
    }

    public Packet<?> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected float m_21519_(EquipmentSlot slot) {
        return 0.0f;
    }

    protected void m_8099_() {
        super.m_8099_();
        this.f_21345_.m_25352_(1, (Goal)new NineTailsEntity.FollowTargetGoal((Mob)this, 1.0, 64.0f){

            @Override
            public boolean m_8036_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8036_() && NoaiProcedure.execute((Entity)entity);
            }

            public boolean m_8045_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8045_() && NoaiProcedure.execute((Entity)entity);
            }
        });
        this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false){

            public boolean m_8036_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8036_() && NoaiProcedure.execute((Entity)entity);
            }

            public boolean m_8045_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8045_() && NoaiProcedure.execute((Entity)entity);
            }
        });
        this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, ServerPlayer.class, false, false){

            public boolean m_8036_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8036_() && NoaiProcedure.execute((Entity)entity);
            }

            public boolean m_8045_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8045_() && NoaiProcedure.execute((Entity)entity);
            }
        });
        this.f_21345_.m_25352_(4, (Goal)new FloatGoal((Mob)this){

            public boolean m_8036_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8036_() && NoaiProcedure.execute((Entity)entity);
            }

            public boolean m_8045_() {
                DragonLordEntity entity = DragonLordEntity.this;
                Level world = DragonLordEntity.this.f_19853_;
                return super.m_8045_() && NoaiProcedure.execute((Entity)entity);
            }
        });
    }

    public void m_6457_(ServerPlayer player) {
        super.m_6457_(player);
        this.bossInfo.m_6543_(player);
    }

    public void m_6452_(ServerPlayer player) {
        super.m_6452_(player);
        this.bossInfo.m_6539_(player);
    }

    public void m_8024_() {
        super.m_8024_();
        this.bossInfo.m_142711_(this.m_21223_() / this.m_21233_());
    }

    public MobType m_6336_() {
        return MobType.f_21640_;
    }

    public boolean m_6785_(double distanceToClosestPlayer) {
        return false;
    }

    public void m_6075_() {
        super.m_6075_();
        ProDragonLordProcedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
    }

    public boolean m_6469_(DamageSource source, float amount) {
        if (source.m_7640_() instanceof AbstractArrow) {
            return false;
        }
        if (source.m_7640_() instanceof ThrownPotion || source.m_7640_() instanceof AreaEffectCloud) {
            return false;
        }
        if (source == DamageSource.f_19315_) {
            return false;
        }
        if (this.m_6844_(EquipmentSlot.FEET).m_41720_() == Items.f_42329_) {
            return false;
        }
        ProDLHurtProcedure.execute((LevelAccessor)this.f_19853_, (Entity)this);
        return super.m_6469_(source, amount);
    }

    public SoundEvent m_7975_(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    public SoundEvent m_5592_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
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

    public boolean m_142535_(float l, float d, DamageSource source) {
        return false;
    }

    public boolean m_5825_() {
        return true;
    }

    public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
        DragonLordSpawnProcedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        return retval;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.0);
        builder = builder.m_22268_(Attributes.f_22276_, 2000.0);
        builder = builder.m_22268_(Attributes.f_22284_, 40.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 128.0);
        builder = builder.m_22268_(Attributes.f_22278_, 1.0);
        return builder;
    }

    private PlayState predicate(AnimationEvent animationEvent) {
        double d1 = this.m_20185_() - this.f_19790_;
        double d0 = this.m_20189_() - this.f_19792_;
        float xvelocity = (float)Math.sqrt(d1 * d1 + d0 * d0);
        float zvelocity = (float)Math.sqrt(d1 * d1 + d0 * d0);
        float velocity = (float)Math.sqrt(d1 * d1 + d0 * d0);
        if (!this.m_6084_()) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon.death"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42407_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack1"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42587_) {
            animationEvent.getController().transitionLengthTicks = 0.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack1a"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42000_) {
            animationEvent.getController().transitionLengthTicks = 0.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon.spawn"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42413_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack2"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42414_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack3"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42416_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack4"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42749_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack5"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41870_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack6"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42246_) {
            animationEvent.getController().transitionLengthTicks = 10.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack7"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41937_) {
            animationEvent.getController().transitionLengthTicks = 0.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack7trans"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41874_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack8", Boolean.valueOf(true)));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41936_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack9"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41900_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack10"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41896_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack10a"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42026_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack10b"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42450_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack11"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41940_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack12"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42516_) {
            animationEvent.getController().transitionLengthTicks = 0.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack13"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42619_) {
            animationEvent.getController().transitionLengthTicks = 0.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack14"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_42677_) {
            animationEvent.getController().transitionLengthTicks = 0.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.attack14a"));
        } else if (this.m_6844_(EquipmentSlot.HEAD).m_41720_() == Items.f_41830_) {
            animationEvent.getController().transitionLengthTicks = 5.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon_g.up"));
        } else if (this.m_20096_()) {
            if (velocity > 0.1f) {
                animationEvent.getController().transitionLengthTicks = 5.0;
                animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon.walk", Boolean.valueOf(true)));
            } else {
                animationEvent.getController().transitionLengthTicks = 5.0;
                animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon.idle"));
            }
        } else {
            animationEvent.getController().transitionLengthTicks = 10.0;
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dragon.fly_move"));
        }
        return PlayState.CONTINUE;
    }

    protected void m_6153_() {
        ++this.f_20919_;
        if (this.f_20919_ == this.getMaxDeathCount()) {
            this.m_142687_(Entity.RemovalReason.KILLED);
            if (this.f_19853_.m_5776_()) {
                this.f_19853_.m_7106_((ParticleOptions)ParticleTypes.f_123783_, this.m_20185_() + (double)this.f_19796_.nextFloat(), this.m_20186_() + (double)this.f_19796_.nextFloat(), this.m_20189_() + (double)this.f_19796_.nextFloat(), 0.0, 0.0, 0.0);
            }
        }
    }

    int getMaxDeathCount() {
        return 78;
    }

    public void m_6667_(DamageSource source) {
        super.m_6667_(source);
        ProdldeathProcedure.execute((LevelAccessor)this.f_19853_, this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
    }

    public void m_147240_(double strength, double ratioX, double ratioZ) {
        if (this.m_21224_()) {
            return;
        }
        super.m_147240_(strength, ratioX, ratioZ);
    }

    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController((IAnimatable)this, "controller", 0.0f, this::predicate));
        AnimationController controller = new AnimationController((IAnimatable)this, "controller", 0.0f, this::predicate);
        controller.registerSoundListener(this::soundListener);
        data.addAnimationController(controller);
    }

    private <ENTITY extends IAnimatable> void soundListener(SoundKeyframeEvent<ENTITY> event) {
        LocalPlayer player = Minecraft.m_91087_().f_91074_;
        if (player != null) {
            if (this.m_20096_()) {
                player.m_5496_(new SoundEvent(new ResourceLocation("simple_mobs", "giant_footstep")), 1.0f, 2.0f);
            } else {
                player.m_5496_(new SoundEvent(new ResourceLocation("simple_mobs", "dragon_wing_flap2")), 1.0f, 2.0f);
            }
        }
    }

    public AnimationFactory getFactory() {
        return this.factory;
    }
}
