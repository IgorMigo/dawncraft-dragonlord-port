/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.afunproject.dawncraft.effects.DawnCraftEffects
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.TextComponent
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec2
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 *  yesman.epicfight.api.animation.types.StaticAnimation
 *  yesman.epicfight.gameasset.Animations
 *  yesman.epicfight.world.damagesource.EpicFightDamageSource
 *  yesman.epicfight.world.damagesource.StunType
 */
package net.mcreator.simplemobs.procedures;

import com.afunproject.dawncraft.effects.DawnCraftEffects;
import java.lang.invoke.LambdaMetafactory;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import net.mcreator.simplemobs.entity.DLMultiPart2Entity;
import net.mcreator.simplemobs.entity.DLMultiPart3Entity;
import net.mcreator.simplemobs.entity.DLMultiPart4Entity;
import net.mcreator.simplemobs.entity.DLMultiPart5Entity;
import net.mcreator.simplemobs.entity.DLMultiPart6Entity;
import net.mcreator.simplemobs.entity.DLMultiPart7Entity;
import net.mcreator.simplemobs.entity.DragonSmokeEntity;
import net.mcreator.simplemobs.entity.GroundbreakEffectBigEntity;
import net.mcreator.simplemobs.entity.LightningSpearEntity;
import net.mcreator.simplemobs.entity.MeteorAttackEntity;
import net.mcreator.simplemobs.entity.Notchgroundeffect3Entity;
import net.mcreator.simplemobs.entity.RodParticlesEntity;
import net.mcreator.simplemobs.entity.Thundereffect2Entity;
import net.mcreator.simplemobs.entity.Thundereffect3Entity;
import net.mcreator.simplemobs.init.SimpleMobsModEntities;
import net.mcreator.simplemobs.init.SimpleMobsModMobEffects;
import net.mcreator.simplemobs.init.SimpleMobsModParticleTypes;
import net.mcreator.simplemobs.network.SimpleMobsModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import yesman.epicfight.api.animation.types.StaticAnimation;
import yesman.epicfight.gameasset.Animations;
import yesman.epicfight.world.damagesource.EpicFightDamageSource;
import yesman.epicfight.world.damagesource.StunType;

public class ProDragonLordProcedure {
    /*
     * Opcode count of 17496 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block948: {
            block956: {
                block951: {
                    block949: {
                        block954: {
                            block955: {
                                block953: {
                                    block952: {
                                        block950: {
                                            if (entity == null) {
                                                return;
                                            }
                                            if (entity.getPersistentData().m_128471_("lock")) {
                                                _ent = entity;
                                                _ent.m_146922_((float)entity.getPersistentData().m_128459_("xz"));
                                                _ent.m_146926_((float)entity.getPersistentData().m_128459_("y"));
                                                _ent.m_5618_(_ent.m_146908_());
                                                _ent.m_5616_(_ent.m_146908_());
                                                _ent.f_19859_ = _ent.m_146908_();
                                                _ent.f_19860_ = _ent.m_146909_();
                                                if (_ent instanceof LivingEntity) {
                                                    _entity = (LivingEntity)_ent;
                                                    _entity.f_20884_ = _entity.m_146908_();
                                                    _entity.f_20886_ = _entity.m_146908_();
                                                }
                                            }
                                            if (entity.getPersistentData().m_128471_("focus")) {
                                                _ent = entity;
                                                _ent.m_146922_((float)entity.getPersistentData().m_128459_("yaw2"));
                                                _ent.m_146926_((float)entity.getPersistentData().m_128459_("pitch2"));
                                                _ent.m_5618_(_ent.m_146908_());
                                                _ent.m_5616_(_ent.m_146908_());
                                                _ent.f_19859_ = _ent.m_146908_();
                                                _ent.f_19860_ = _ent.m_146909_();
                                                if (_ent instanceof LivingEntity) {
                                                    _entity = (LivingEntity)_ent;
                                                    _entity.f_20884_ = _entity.m_146908_();
                                                    _entity.f_20886_ = _entity.m_146908_();
                                                }
                                            }
                                            if (world.m_5776_() || !entity.m_6084_()) break block948;
                                            if (!entity.getPersistentData().m_128471_("logged")) {
                                                entity.getPersistentData().m_128379_("logged", true);
                                                entity.getPersistentData().m_128379_("Spawn", true);
                                                entity.getPersistentData().m_128379_("Attacking", true);
                                            }
                                            if (!(!world.m_6443_(DLMultiPart2Entity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)50.0, (double)50.0, (double)50.0), (Predicate<DLMultiPart2Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$0(net.mcreator.simplemobs.entity.DLMultiPart2Entity ), (Lnet/mcreator/simplemobs/entity/DLMultiPart2Entity;)Z)()).isEmpty())) {
                                                if (world instanceof ServerLevel) {
                                                    _level = (ServerLevel)world;
                                                    entityToSpawn /* !! */  = new DLMultiPart2Entity((EntityType<DLMultiPart2Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_2.get()), (Level)_level);
                                                    entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                                                    if (entityToSpawn /* !! */  instanceof Mob) {
                                                        _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                                        _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                                    }
                                                    world.m_7967_((Entity)entityToSpawn /* !! */ );
                                                }
                                            } else if (!(!world.m_6443_(DLMultiPart3Entity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)40.0, (double)40.0, (double)40.0), (Predicate<DLMultiPart3Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$1(net.mcreator.simplemobs.entity.DLMultiPart3Entity ), (Lnet/mcreator/simplemobs/entity/DLMultiPart3Entity;)Z)()).isEmpty())) {
                                                if (world instanceof ServerLevel) {
                                                    _level = (ServerLevel)world;
                                                    entityToSpawn /* !! */  = new DLMultiPart3Entity((EntityType<DLMultiPart3Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_3.get()), (Level)_level);
                                                    entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                                                    if (entityToSpawn /* !! */  instanceof Mob) {
                                                        _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                                        _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                                    }
                                                    world.m_7967_((Entity)entityToSpawn /* !! */ );
                                                }
                                            } else if (!(!world.m_6443_(DLMultiPart4Entity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)40.0, (double)40.0, (double)40.0), (Predicate<DLMultiPart4Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$2(net.mcreator.simplemobs.entity.DLMultiPart4Entity ), (Lnet/mcreator/simplemobs/entity/DLMultiPart4Entity;)Z)()).isEmpty())) {
                                                if (world instanceof ServerLevel) {
                                                    _level = (ServerLevel)world;
                                                    entityToSpawn /* !! */  = new DLMultiPart4Entity((EntityType<DLMultiPart4Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_4.get()), (Level)_level);
                                                    entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                                                    if (entityToSpawn /* !! */  instanceof Mob) {
                                                        _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                                        _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                                    }
                                                    world.m_7967_((Entity)entityToSpawn /* !! */ );
                                                }
                                            } else if (!(!world.m_6443_(DLMultiPart5Entity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)20.0, (double)20.0, (double)20.0), (Predicate<DLMultiPart5Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$3(net.mcreator.simplemobs.entity.DLMultiPart5Entity ), (Lnet/mcreator/simplemobs/entity/DLMultiPart5Entity;)Z)()).isEmpty())) {
                                                if (world instanceof ServerLevel) {
                                                    _level = (ServerLevel)world;
                                                    entityToSpawn /* !! */  = new DLMultiPart5Entity((EntityType<DLMultiPart5Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_5.get()), (Level)_level);
                                                    entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                                                    if (entityToSpawn /* !! */  instanceof Mob) {
                                                        _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                                        _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                                    }
                                                    world.m_7967_((Entity)entityToSpawn /* !! */ );
                                                }
                                            } else if (!(!world.m_6443_(DLMultiPart6Entity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)15.0, (double)15.0, (double)15.0), (Predicate<DLMultiPart6Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$4(net.mcreator.simplemobs.entity.DLMultiPart6Entity ), (Lnet/mcreator/simplemobs/entity/DLMultiPart6Entity;)Z)()).isEmpty())) {
                                                if (world instanceof ServerLevel) {
                                                    _level = (ServerLevel)world;
                                                    entityToSpawn /* !! */  = new DLMultiPart6Entity((EntityType<DLMultiPart6Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_6.get()), (Level)_level);
                                                    entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                                                    if (entityToSpawn /* !! */  instanceof Mob) {
                                                        _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                                        _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                                    }
                                                    world.m_7967_((Entity)entityToSpawn /* !! */ );
                                                }
                                            } else if (!(!world.m_6443_(DLMultiPart7Entity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)40.0, (double)40.0, (double)40.0), (Predicate<DLMultiPart7Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$5(net.mcreator.simplemobs.entity.DLMultiPart7Entity ), (Lnet/mcreator/simplemobs/entity/DLMultiPart7Entity;)Z)()).isEmpty()) && world instanceof ServerLevel) {
                                                _level = (ServerLevel)world;
                                                entityToSpawn /* !! */  = new DLMultiPart7Entity((EntityType<DLMultiPart7Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_7.get()), (Level)_level);
                                                entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                                                if (entityToSpawn /* !! */  instanceof Mob) {
                                                    _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                                }
                                                world.m_7967_((Entity)entityToSpawn /* !! */ );
                                            }
                                            if (entity.getPersistentData().m_128459_("bbtimer") == 0.0) {
                                                entity.getPersistentData().m_128347_("bbtimer", 20.0);
                                                SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i = -5.0;
                                                SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j = 1.0;
                                                SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x = -5.0;
                                                SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                while (SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i < 6.0) {
                                                    while (SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j < 8.0) {
                                                        while (SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x < 6.0) {
                                                            if (world.m_8055_(new BlockPos(x + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i + entity.m_20154_().f_82479_ * 3.0, y + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j, z + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x + entity.m_20154_().f_82481_ * 3.0)).m_60800_((BlockGetter)world, new BlockPos(x + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i + entity.m_20154_().f_82479_ * 3.0, y + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j, z + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x + entity.m_20154_().f_82481_ * 3.0)) >= 0.0f && world.m_8055_(new BlockPos(x + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i + entity.m_20154_().f_82479_ * 3.0, y + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j, z + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x + entity.m_20154_().f_82481_ * 3.0)).m_60800_((BlockGetter)world, new BlockPos(x + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i + entity.m_20154_().f_82479_ * 3.0, y + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j, z + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x + entity.m_20154_().f_82481_ * 3.0)) <= 5.0f) {
                                                                world.m_46961_(new BlockPos(x + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i + entity.m_20154_().f_82479_ * 3.0, y + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j, z + SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x + entity.m_20154_().f_82481_ * 3.0), false);
                                                            }
                                                            SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x += 1.0;
                                                            SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                        }
                                                        SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x = -3.0;
                                                        SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                        SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j += 1.0;
                                                        SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                    }
                                                    SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j = 1.0;
                                                    SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                    SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i += 1.0;
                                                    SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                }
                                                SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).i = 0.0;
                                                SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).j = 0.0;
                                                SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                                SimpleMobsModVariables.MapVariables.get((LevelAccessor)world).x = 0.0;
                                                SimpleMobsModVariables.MapVariables.get(world).syncData(world);
                                            } else {
                                                entity.getPersistentData().m_128347_("bbtimer", entity.getPersistentData().m_128459_("bbtimer") - 1.0);
                                            }
                                            entity.getPersistentData().m_128379_("Aggro", false);
                                            entity.getPersistentData().m_128379_("Far", false);
                                            entity.getPersistentData().m_128379_("Mid", false);
                                            entity.getPersistentData().m_128379_("Close", false);
                                            entity.getPersistentData().m_128379_("Around", false);
                                            _center = new Vec3(x, y, z);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$6(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$7(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                                            for (Entity entityiterator : _entfound) {
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    v0 = _mobEnt.m_5448_();
                                                } else {
                                                    v0 = null;
                                                }
                                                if (entityiterator != v0) continue;
                                                entity.getPersistentData().m_128379_("Aggro", true);
                                                entity.getPersistentData().m_128379_("Far", true);
                                                entity.getPersistentData().m_128379_("Mid", false);
                                                entity.getPersistentData().m_128379_("Close", false);
                                                entity.getPersistentData().m_128379_("Around", false);
                                                entity.getPersistentData().m_128347_("atanyaw", Math.toDegrees(Math.atan2(entityiterator.m_20185_() - entity.m_20185_(), entityiterator.m_20189_() - entity.m_20189_())));
                                                if (entity.getPersistentData().m_128459_("atanyaw") < 0.0) {
                                                    entity.getPersistentData().m_128347_("yaw2", 0.0 - entity.getPersistentData().m_128459_("atanyaw"));
                                                }
                                                if (entity.getPersistentData().m_128459_("atanyaw") >= 0.0) {
                                                    entity.getPersistentData().m_128347_("yaw2", 360.0 - entity.getPersistentData().m_128459_("atanyaw"));
                                                }
                                                entity.getPersistentData().m_128347_("pitch2", 90.0 - Math.toDegrees(Math.atan(Math.hypot(Math.abs(entity.m_20185_() - entityiterator.m_20185_()), Math.abs(entity.m_20189_() - entityiterator.m_20189_())) / Math.abs(entity.m_20186_() + 3.0 - entityiterator.m_20186_()))));
                                            }
                                            _center = new Vec3(x, y, z);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(19.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$8(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$9(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                                            for (Entity entityiterator : _entfound) {
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    v1 = _mobEnt.m_5448_();
                                                } else {
                                                    v1 = null;
                                                }
                                                if (entityiterator != v1) continue;
                                                entity.getPersistentData().m_128379_("Far", false);
                                                entity.getPersistentData().m_128379_("Mid", true);
                                                entity.getPersistentData().m_128379_("Close", false);
                                                entity.getPersistentData().m_128379_("Around", false);
                                                entity.getPersistentData().m_128379_("Behind", false);
                                            }
                                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 17.0, y, z + entity.m_20154_().f_82481_ * 17.0);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(8.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$10(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$11(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                                            for (Entity entityiterator : _entfound) {
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    v2 = _mobEnt.m_5448_();
                                                } else {
                                                    v2 = null;
                                                }
                                                if (entityiterator != v2) continue;
                                                entity.getPersistentData().m_128379_("Far", false);
                                                entity.getPersistentData().m_128379_("Mid", false);
                                                entity.getPersistentData().m_128379_("Close", true);
                                                entity.getPersistentData().m_128379_("Around", false);
                                                entity.getPersistentData().m_128379_("Behind", false);
                                            }
                                            _center = new Vec3(x, y, z);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$12(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$13(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                                            for (Entity entityiterator : _entfound) {
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    v3 = _mobEnt.m_5448_();
                                                } else {
                                                    v3 = null;
                                                }
                                                if (entityiterator != v3) continue;
                                                entity.getPersistentData().m_128379_("Far", false);
                                                entity.getPersistentData().m_128379_("Mid", false);
                                                entity.getPersistentData().m_128379_("Close", false);
                                                entity.getPersistentData().m_128379_("Around", true);
                                                entity.getPersistentData().m_128379_("Behind", false);
                                            }
                                            _center = new Vec3(x + entity.m_20154_().f_82479_ * -9.0, y, z + entity.m_20154_().f_82481_ * -9.0);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$14(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$15(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                                            for (Entity entityiterator : _entfound) {
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    v4 = _mobEnt.m_5448_();
                                                } else {
                                                    v4 = null;
                                                }
                                                if (entityiterator != v4) continue;
                                                entity.getPersistentData().m_128379_("Far", false);
                                                entity.getPersistentData().m_128379_("Mid", false);
                                                entity.getPersistentData().m_128379_("Close", false);
                                                entity.getPersistentData().m_128379_("Around", false);
                                                entity.getPersistentData().m_128379_("Behind", true);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk2cd") == 0.0 && entity.getPersistentData().m_128471_("Attack2")) {
                                                entity.getPersistentData().m_128347_("atk2cd", 120.0);
                                            } else if (entity.getPersistentData().m_128459_("atk2cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk2cd", entity.getPersistentData().m_128459_("atk2cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("upcd") == 0.0 && entity.getPersistentData().m_128471_("Up")) {
                                                entity.getPersistentData().m_128347_("upcd", (double)Mth.m_14072_((Random)new Random(), (int)40, (int)70));
                                            } else if (entity.getPersistentData().m_128459_("upcd") > 0.0) {
                                                entity.getPersistentData().m_128347_("upcd", entity.getPersistentData().m_128459_("upcd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk3cd") == 0.0 && entity.getPersistentData().m_128471_("Attack3")) {
                                                entity.getPersistentData().m_128347_("atk3cd", (double)Mth.m_14072_((Random)new Random(), (int)400, (int)600));
                                            } else if (entity.getPersistentData().m_128459_("atk3cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk3cd", entity.getPersistentData().m_128459_("atk3cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk4cd") == 0.0 && entity.getPersistentData().m_128471_("Attack4")) {
                                                entity.getPersistentData().m_128347_("atk4cd", (double)Mth.m_14072_((Random)new Random(), (int)400, (int)600));
                                            } else if (entity.getPersistentData().m_128459_("atk4cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk4cd", entity.getPersistentData().m_128459_("atk4cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk5cd") == 0.0 && entity.getPersistentData().m_128471_("Attack5")) {
                                                entity.getPersistentData().m_128347_("atk5cd", (double)Mth.m_14072_((Random)new Random(), (int)200, (int)280));
                                            } else if (entity.getPersistentData().m_128459_("atk5cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk5cd", entity.getPersistentData().m_128459_("atk5cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk6cd") == 0.0 && entity.getPersistentData().m_128471_("Attack3")) {
                                                entity.getPersistentData().m_128347_("atk6cd", (double)Mth.m_14072_((Random)new Random(), (int)200, (int)300));
                                            } else if (entity.getPersistentData().m_128459_("atk6cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk6cd", entity.getPersistentData().m_128459_("atk6cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk9cd") == 0.0 && entity.getPersistentData().m_128471_("Attack9")) {
                                                entity.getPersistentData().m_128347_("atk9cd", (double)Mth.m_14072_((Random)new Random(), (int)60, (int)140));
                                            } else if (entity.getPersistentData().m_128459_("atk9cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk9cd", entity.getPersistentData().m_128459_("atk9cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk10cd") == 0.0 && (entity.getPersistentData().m_128471_("Attack10") || entity.getPersistentData().m_128471_("Attack10alt"))) {
                                                entity.getPersistentData().m_128347_("atk10cd", (double)Mth.m_14072_((Random)new Random(), (int)100, (int)160));
                                            } else if (entity.getPersistentData().m_128459_("atk10cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk10cd", entity.getPersistentData().m_128459_("atk10cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk11cd") == 0.0 && entity.getPersistentData().m_128471_("Attack11")) {
                                                entity.getPersistentData().m_128347_("atk11cd", (double)Mth.m_14072_((Random)new Random(), (int)500, (int)800));
                                            } else if (entity.getPersistentData().m_128459_("atk11cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk11cd", entity.getPersistentData().m_128459_("atk11cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk12cd") == 0.0 && entity.getPersistentData().m_128471_("Attack12")) {
                                                entity.getPersistentData().m_128347_("atk12cd", (double)Mth.m_14072_((Random)new Random(), (int)200, (int)400));
                                            } else if (entity.getPersistentData().m_128459_("atk12cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk12cd", entity.getPersistentData().m_128459_("atk12cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk13cd") == 0.0 && entity.getPersistentData().m_128471_("Attack13")) {
                                                entity.getPersistentData().m_128347_("atk13cd", (double)Mth.m_14072_((Random)new Random(), (int)100, (int)300));
                                            } else if (entity.getPersistentData().m_128459_("atk13cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk13cd", entity.getPersistentData().m_128459_("atk13cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("atk14cd") == 0.0 && entity.getPersistentData().m_128471_("Attack14")) {
                                                entity.getPersistentData().m_128347_("atk14cd", (double)Mth.m_14072_((Random)new Random(), (int)300, (int)460));
                                            } else if (entity.getPersistentData().m_128459_("atk14cd") > 0.0) {
                                                entity.getPersistentData().m_128347_("atk14cd", entity.getPersistentData().m_128459_("atk14cd") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128459_("upcd2") == 0.0 && entity.getPersistentData().m_128471_("Up")) {
                                                entity.getPersistentData().m_128347_("upcd2", (double)Mth.m_14072_((Random)new Random(), (int)400, (int)500));
                                            } else if (entity.getPersistentData().m_128459_("upcd2") > 0.0) {
                                                entity.getPersistentData().m_128347_("upcd2", entity.getPersistentData().m_128459_("upcd2") - 1.0);
                                            }
                                            if (entity.getPersistentData().m_128471_("hurtcd")) {
                                                if (entity.getPersistentData().m_128459_("hurt_cd") == 0.0) {
                                                    entity.getPersistentData().m_128347_("hurt_cd", 18.0);
                                                } else {
                                                    entity.getPersistentData().m_128347_("hurt_cd", entity.getPersistentData().m_128459_("hurt_cd") - 1.0);
                                                }
                                                if (entity.getPersistentData().m_128459_("hurt_cd") == 1.0) {
                                                    _entity = entity;
                                                    if (_entity instanceof Player) {
                                                        _player = (Player)_entity;
                                                        _player.m_150109_().f_35975_.set(0, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                                                        _player.m_150109_().m_6596_();
                                                    } else if (_entity instanceof LivingEntity) {
                                                        _living = (LivingEntity)_entity;
                                                        _living.m_8061_(EquipmentSlot.FEET, new ItemStack((ItemLike)Blocks.f_50016_));
                                                    }
                                                    entity.getPersistentData().m_128347_("hurt_cd", 0.0);
                                                    entity.getPersistentData().m_128379_("hurtcd", false);
                                                }
                                            }
                                            if (entity.getPersistentData().m_128471_("air") || !entity.m_20096_()) break block949;
                                            if (!entity.getPersistentData().m_128471_("Around")) break block950;
                                            if (entity instanceof LivingEntity) {
                                                _livEnt = (LivingEntity)entity;
                                                v5 = _livEnt.m_21223_();
                                            } else {
                                                v5 = -1.0f;
                                            }
                                            if (entity instanceof LivingEntity) {
                                                _livEnt = (LivingEntity)entity;
                                                v6 = _livEnt.m_21233_();
                                            } else {
                                                v6 = -1.0f;
                                            }
                                            if ((double)(v5 / v6) <= 0.5 && Math.random() >= 0.6 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk13cd") == 0.0) {
                                                entity.getPersistentData().m_128379_("Attack13", true);
                                                entity.getPersistentData().m_128379_("Attacking", true);
                                            } else {
                                                if (entity instanceof LivingEntity) {
                                                    _livEnt = (LivingEntity)entity;
                                                    v7 = _livEnt.m_21223_();
                                                } else {
                                                    v7 = -1.0f;
                                                }
                                                if (entity instanceof LivingEntity) {
                                                    _livEnt = (LivingEntity)entity;
                                                    v8 = _livEnt.m_21233_();
                                                } else {
                                                    v8 = -1.0f;
                                                }
                                                if ((double)(v7 / v8) <= 0.5 && Math.random() <= 0.4 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk14cd") == 0.0) {
                                                    entity.getPersistentData().m_128379_("Attack14", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                } else if (Math.random() <= 0.3 && !entity.getPersistentData().m_128471_("Attacking")) {
                                                    entity.getPersistentData().m_128379_("Attack1", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                } else if (Math.random() >= 0.31 && Math.random() <= 0.6 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk3cd") == 0.0) {
                                                    entity.getPersistentData().m_128379_("Attack3", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                } else if (Math.random() >= 0.61 && Math.random() <= 0.8 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk6cd") == 0.0) {
                                                    entity.getPersistentData().m_128379_("Attack6", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                } else if (entity.getPersistentData().m_128459_("upcd2") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                                    entity.getPersistentData().m_128379_("Up", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                } else if (entity.getPersistentData().m_128459_("atk11cd") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                                    entity.getPersistentData().m_128379_("Attack11", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                } else if (entity.getPersistentData().m_128459_("atk12cd") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                                    entity.getPersistentData().m_128379_("Attack12", true);
                                                    entity.getPersistentData().m_128379_("Attacking", true);
                                                }
                                            }
                                            break block951;
                                        }
                                        if (!entity.getPersistentData().m_128471_("Behind") || entity.getPersistentData().m_128471_("Attacking")) break block952;
                                        if (entity instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entity;
                                            v9 = _livEnt.m_21223_();
                                        } else {
                                            v9 = -1.0f;
                                        }
                                        if (entity instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entity;
                                            v10 = _livEnt.m_21233_();
                                        } else {
                                            v10 = -1.0f;
                                        }
                                        if ((double)(v9 / v10) <= 0.5 && Math.random() >= 0.5 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk13cd") == 0.0) {
                                            entity.getPersistentData().m_128379_("Attack13", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        } else {
                                            if (entity instanceof LivingEntity) {
                                                _livEnt = (LivingEntity)entity;
                                                v11 = _livEnt.m_21223_();
                                            } else {
                                                v11 = -1.0f;
                                            }
                                            if (entity instanceof LivingEntity) {
                                                _livEnt = (LivingEntity)entity;
                                                v12 = _livEnt.m_21233_();
                                            } else {
                                                v12 = -1.0f;
                                            }
                                            if ((double)(v11 / v12) <= 0.5 && Math.random() <= 0.4 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk14cd") == 0.0) {
                                                entity.getPersistentData().m_128379_("Attack14", true);
                                                entity.getPersistentData().m_128379_("Attacking", true);
                                            } else if (!entity.getPersistentData().m_128471_("Attacking")) {
                                                entity.getPersistentData().m_128379_("Attack2", true);
                                                entity.getPersistentData().m_128379_("Attacking", true);
                                            }
                                        }
                                        break block951;
                                    }
                                    if (!entity.getPersistentData().m_128471_("Close") || entity.getPersistentData().m_128471_("Attacking")) break block953;
                                    if (entity instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entity;
                                        v13 = _livEnt.m_21223_();
                                    } else {
                                        v13 = -1.0f;
                                    }
                                    if (entity instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entity;
                                        v14 = _livEnt.m_21233_();
                                    } else {
                                        v14 = -1.0f;
                                    }
                                    if ((double)(v13 / v14) <= 0.5 && Math.random() >= 0.7 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk13cd") == 0.0) {
                                        entity.getPersistentData().m_128379_("Attack13", true);
                                        entity.getPersistentData().m_128379_("Attacking", true);
                                    } else {
                                        if (entity instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entity;
                                            v15 = _livEnt.m_21223_();
                                        } else {
                                            v15 = -1.0f;
                                        }
                                        if (entity instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entity;
                                            v16 = _livEnt.m_21233_();
                                        } else {
                                            v16 = -1.0f;
                                        }
                                        if ((double)(v15 / v16) <= 0.5 && Math.random() <= 0.3 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk14cd") == 0.0) {
                                            entity.getPersistentData().m_128379_("Attack14", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        } else if (Math.random() <= 0.25 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk10cd") == 0.0) {
                                            entity.getPersistentData().m_128379_("Attack10", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        } else if (Math.random() >= 0.26 && Math.random() <= 0.5 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk10cd") == 0.0) {
                                            entity.getPersistentData().m_128379_("Attack10alt", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        } else if (Math.random() >= 0.51 && Math.random() <= 0.75 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk9cd") == 0.0) {
                                            entity.getPersistentData().m_128379_("Attack9", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        } else if (Math.random() >= 0.75 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk3cd") == 0.0) {
                                            entity.getPersistentData().m_128379_("Attack3", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        } else if (entity.getPersistentData().m_128459_("upcd2") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                            entity.getPersistentData().m_128379_("Up", true);
                                            entity.getPersistentData().m_128379_("Attacking", true);
                                        }
                                    }
                                    break block951;
                                }
                                if (!entity.getPersistentData().m_128471_("Mid") || entity.getPersistentData().m_128471_("Attacking")) break block954;
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    v17 = _livEnt.m_21223_();
                                } else {
                                    v17 = -1.0f;
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    v18 = _livEnt.m_21233_();
                                } else {
                                    v18 = -1.0f;
                                }
                                if (!((double)(v17 / v18) <= 0.5) || !(Math.random() <= 0.8) || entity.getPersistentData().m_128471_("Attacking") || entity.getPersistentData().m_128459_("atk13cd") != 0.0) break block955;
                                entity.getPersistentData().m_128379_("Attack13", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                                break block951;
                            }
                            if (entity.getPersistentData().m_128471_("Attacking")) ** GOTO lbl-1000
                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                v19 = _livEnt.m_21223_();
                            } else {
                                v19 = -1.0f;
                            }
                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                v20 = _livEnt.m_21233_();
                            } else {
                                v20 = -1.0f;
                            }
                            if ((double)(v19 / v20) <= 0.5 && Math.random() <= 0.8 && entity.getPersistentData().m_128459_("atk11cd") == 0.0) {
                                entity.getPersistentData().m_128379_("Attack11a", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                            } else if (!entity.getPersistentData().m_128471_("Attacking") && Math.random() <= 0.3 && entity.getPersistentData().m_128459_("atk11cd") == 0.0) {
                                entity.getPersistentData().m_128379_("Attack11", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                            } else if (Math.random() >= 0.6 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk9cd") == 0.0) {
                                entity.getPersistentData().m_128379_("Attack9", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                            }
                            break block951;
                        }
                        if (entity.getPersistentData().m_128471_("Far") && !entity.getPersistentData().m_128471_("Attacking")) {
                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                v21 = _livEnt.m_21223_();
                            } else {
                                v21 = -1.0f;
                            }
                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                v22 = _livEnt.m_21233_();
                            } else {
                                v22 = -1.0f;
                            }
                            if ((double)(v21 / v22) <= 0.5 && Math.random() <= 0.8 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk13cd") == 0.0) {
                                entity.getPersistentData().m_128379_("Attack13", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                            } else if (Math.random() >= 0.6 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk4cd") == 0.0) {
                                entity.getPersistentData().m_128379_("Attack4", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                            } else if (Math.random() >= 0.6 && !entity.getPersistentData().m_128471_("Attacking") && entity.getPersistentData().m_128459_("atk5cd") == 0.0) {
                                entity.getPersistentData().m_128379_("Attack5", true);
                                entity.getPersistentData().m_128379_("Attacking", true);
                            } else {
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    v23 = _livEnt.m_21223_();
                                } else {
                                    v23 = -1.0f;
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    v24 = _livEnt.m_21233_();
                                } else {
                                    v24 = -1.0f;
                                }
                                if ((double)(v23 / v24) <= 0.5 && Math.random() <= 0.7 && entity.getPersistentData().m_128459_("atk11cd") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                    entity.getPersistentData().m_128379_("Attack11a", true);
                                    entity.getPersistentData().m_128379_("Attacking", true);
                                } else if (Math.random() <= 0.1 && entity.getPersistentData().m_128459_("atk11cd") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                    entity.getPersistentData().m_128379_("Attack11", true);
                                    entity.getPersistentData().m_128379_("Attacking", true);
                                } else if (entity.getPersistentData().m_128459_("upcd2") == 0.0 && !entity.getPersistentData().m_128471_("Attacking")) {
                                    entity.getPersistentData().m_128379_("Up", true);
                                    entity.getPersistentData().m_128379_("Attacking", true);
                                }
                            }
                        }
                        break block951;
                    }
                    if (entity.getPersistentData().m_128459_("aircd") == 0.0 && entity.getPersistentData().m_128471_("air")) {
                        if (Math.random() <= 0.5 && !entity.getPersistentData().m_128471_("Attacking")) {
                            entity.getPersistentData().m_128379_("Attack7", true);
                            entity.getPersistentData().m_128379_("Attacking", true);
                        } else if (!entity.getPersistentData().m_128471_("Attacking")) {
                            entity.getPersistentData().m_128379_("Attack8", true);
                            entity.getPersistentData().m_128379_("Attacking", true);
                            entity.getPersistentData().m_128379_("atk8done", false);
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Spawn")) {
                    if (entity.getPersistentData().m_128459_("l") == 0.0) {
                        entity.getPersistentData().m_128347_("l", 60.0);
                    } else {
                        entity.getPersistentData().m_128347_("l", entity.getPersistentData().m_128459_("l") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("l") == 60.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50081_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50081_));
                        }
                        entity.getPersistentData().m_128379_("Attacking", true);
                    } else if (entity.getPersistentData().m_128459_("l") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128347_("l", 0.0);
                        entity.getPersistentData().m_128379_("Spawn", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack1")) {
                    if (entity.getPersistentData().m_128459_("atk1") == 0.0) {
                        entity.getPersistentData().m_128347_("atk1", 71.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk1", entity.getPersistentData().m_128459_("atk1") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk1") == 71.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42407_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42407_));
                        }
                        entity.getPersistentData().m_128347_("xz", (double)entity.m_146908_());
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                    } else if (entity.getPersistentData().m_128459_("atk1") == 65.0) {
                        entity.getPersistentData().m_128379_("lock", true);
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("atk1") == 42.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:firegiant_footstep")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:firegiant_footstep")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:notch_sweep")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:notch_sweep")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = new Notchgroundeffect3Entity((EntityType<Notchgroundeffect3Entity>)((EntityType)SimpleMobsModEntities.NOTCHGROUNDEFFECT_3.get()), (Level)_level);
                            entityToSpawn /* !! */ .m_7678_(x - entity.m_20154_().f_82479_ * 2.0, y, z - entity.m_20154_().f_82481_ * 2.0, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn /* !! */  instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.EXPLOSION.get()), x - entity.m_20154_().f_82479_ * 2.0, y, z - entity.m_20154_().f_82481_ * 2.0, 40, 3.0, 3.0, 3.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x - entity.m_20154_().f_82479_ * 2.0, y, z - entity.m_20154_().f_82481_ * 2.0, 40, 3.0, 3.0, 3.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            look = entity.m_20154_();
                            tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                            entityToSpawn = new GroundbreakEffectBigEntity((EntityType<GroundbreakEffectBigEntity>)((EntityType)SimpleMobsModEntities.GROUNDBREAK_EFFECT_BIG.get()), (Level)_level);
                            entityToSpawn.m_7678_(x - entity.m_20154_().f_82479_ * 2.0 + -3.0 * tangent.f_82479_, y, z - entity.m_20154_().f_82481_ * 2.0 + -3.0 * tangent.f_82481_, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk1") < 42.0 && entity.getPersistentData().m_128459_("atk1") > 39.0) {
                        _center = new Vec3(x - entity.m_20154_().f_82479_ * 2.0, y, z - entity.m_20154_().f_82481_ * 2.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$16(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$17(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(25.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 24.0f);
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$18(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$19(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) || !(entityiterator instanceof LivingEntity)) continue;
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 20, 1, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk1") == 27.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$20(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$21(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            entity.getPersistentData().m_128379_("Attack1b", true);
                            entity.getPersistentData().m_128347_("atk1", 0.0);
                            entity.getPersistentData().m_128379_("Attack1", false);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk1") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                        entity.getPersistentData().m_128347_("atk1", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack1", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack1b")) {
                    if (entity.getPersistentData().m_128459_("atk1b") == 0.0) {
                        entity.getPersistentData().m_128347_("atk1b", 51.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk1b", entity.getPersistentData().m_128459_("atk1b") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk1b") == 51.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42587_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42587_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 41, 6, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk1b") == 34.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x + entity.m_20154_().f_82479_, y, z + entity.m_20154_().f_82481_), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:firegiant_footstep")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x + entity.m_20154_().f_82479_, y, z + entity.m_20154_().f_82481_, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:firegiant_footstep")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            look = entity.m_20154_();
                            tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                            entityToSpawn = new GroundbreakEffectBigEntity((EntityType<GroundbreakEffectBigEntity>)((EntityType)SimpleMobsModEntities.GROUNDBREAK_EFFECT_BIG.get()), (Level)_level);
                            entityToSpawn.m_7678_(x - entity.m_20154_().f_82479_ * 1.0 + 3.0 * tangent.f_82479_, y, z - entity.m_20154_().f_82481_ * 1.0 + 3.0 * tangent.f_82481_, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.EXPLOSION.get()), x + entity.m_20154_().f_82479_, y, z + entity.m_20154_().f_82481_, 40, 3.0, 3.0, 3.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x + entity.m_20154_().f_82479_, y, z + entity.m_20154_().f_82481_, 40, 3.0, 3.0, 3.0, 1.0);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk1b") < 34.0 && entity.getPersistentData().m_128459_("atk1b") > 30.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$22(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$23(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            if (entityiterator instanceof LivingEntity) {
                                _entity = (LivingEntity)entityiterator;
                                _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 20, 0));
                            }
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(25.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 24.0f);
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$24(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$25(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) || !(entityiterator instanceof LivingEntity)) continue;
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 20, 1, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk1b") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk1b", 0.0);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack1b", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk1b") < 50.0 && entity.getPersistentData().m_128459_("atk1b") > 40.0) {
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 0.5, 0.0, Math.cos(Math.toRadians(entity.m_146908_())) * 0.5));
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack2")) {
                    if (entity.getPersistentData().m_128459_("atk2") == 0.0) {
                        entity.getPersistentData().m_128347_("atk2", 51.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk2", entity.getPersistentData().m_128459_("atk2") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk2") == 51.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42413_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42413_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 51, 7, false, false));
                        }
                        entity.getPersistentData().m_128347_("xz", (double)entity.m_146908_());
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                        entity.getPersistentData().m_128347_("i", 10.0);
                    } else if (entity.getPersistentData().m_128459_("atk2") == 50.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                        entity.getPersistentData().m_128379_("lock", true);
                    } else if (entity.getPersistentData().m_128459_("atk2") == 39.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:sweep")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:sweep")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        entity.getPersistentData().m_128379_("sweep", true);
                    } else if (entity.getPersistentData().m_128459_("atk2") == 10.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                        entity.getPersistentData().m_128379_("lock", false);
                    } else if (entity.getPersistentData().m_128459_("atk2") == 1.0) {
                        entity.getPersistentData().m_128379_("sweep", false);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk2", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack2", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack3")) {
                    if (entity.getPersistentData().m_128459_("Atk3") <= 0.0) {
                        entity.getPersistentData().m_128347_("Atk3", 157.0);
                    } else {
                        entity.getPersistentData().m_128347_("Atk3", entity.getPersistentData().m_128459_("Atk3") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("Atk3") == 157.0) {
                        entity.getPersistentData().m_128379_("Attacking", true);
                        entity.getPersistentData().m_128379_("focus", true);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42414_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42414_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 104, 6, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 137.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("y", 0.0);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128379_("lock", true);
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 132.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 127.0) {
                        _ent = entity;
                        look = entity.m_20154_();
                        tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), entity.m_20185_() + entity.m_20154_().f_82479_ * 8.0 + 8.0 * tangent.f_82479_, y + 8.0, entity.m_20189_() + entity.m_20154_().f_82481_ * 8.0 + 8.0 * tangent.f_82481_, 3, 0.4, 4.0, 0.4, 0.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123747_, entity.m_20185_() + entity.m_20154_().f_82479_ * 8.0 + 8.0 * tangent.f_82479_, y + 8.0, entity.m_20189_() + entity.m_20154_().f_82481_ * 8.0 + 8.0 * tangent.f_82481_, 3, 0.4, 4.0, 0.4, 0.0);
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 110.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 107.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = new Thundereffect2Entity((EntityType<Thundereffect2Entity>)((EntityType)SimpleMobsModEntities.THUNDEREFFECT_2.get()), (Level)_level);
                            entityToSpawn /* !! */ .m_7678_(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn /* !! */  instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(6.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$26(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$27(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.SHORT).setImpact(2.0f).setArmorNegation(25.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 30.0f);
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(13.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$28(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$29(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) || !(entityiterator instanceof LivingEntity)) continue;
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 40, 1, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 4.0) {
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk3") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("Atk3", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack3", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack4")) {
                    if (entity.getPersistentData().m_128459_("Atk4") <= 0.0) {
                        entity.getPersistentData().m_128347_("Atk4", 106.0);
                    } else {
                        entity.getPersistentData().m_128347_("Atk4", entity.getPersistentData().m_128459_("Atk4") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("Atk4") == 106.0) {
                        entity.getPersistentData().m_128379_("Attacking", true);
                        entity.getPersistentData().m_128379_("focus", true);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42416_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42416_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 104, 6, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk4") == 87.0) {
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", entity.getPersistentData().m_128459_("pitch2") + 5.0);
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(75.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$30(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$31(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v25 = _mobEnt.m_5448_();
                            } else {
                                v25 = null;
                            }
                            if (entityiterator != v25) continue;
                            entityiterator.getPersistentData().m_128379_("dltarget", true);
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk4") == 86.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128379_("lock", true);
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_flame")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_flame")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk4") == 83.0) {
                        entity.getPersistentData().m_128379_("fire1", true);
                    } else if (entity.getPersistentData().m_128459_("Atk4") == 20.0) {
                        entity.getPersistentData().m_128379_("fire1", false);
                    } else if (entity.getPersistentData().m_128459_("Atk4") == 6.0) {
                        entity.getPersistentData().m_128379_("lock", false);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                    } else if (entity.getPersistentData().m_128459_("Atk4") == 1.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(75.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$32(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$33(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v26 = _mobEnt.m_5448_();
                            } else {
                                v26 = null;
                            }
                            if (entityiterator != v26) continue;
                            entityiterator.getPersistentData().m_128379_("dltarget", false);
                        }
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("Atk4", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack4", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack5")) {
                    if (entity.getPersistentData().m_128459_("atk5") == 0.0) {
                        entity.getPersistentData().m_128347_("atk5", 106.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk5", entity.getPersistentData().m_128459_("atk5") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk5") == 106.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42749_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42749_));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                    } else if (entity.getPersistentData().m_128459_("atk5") == 86.0) {
                        entity.getPersistentData().m_128347_("xz", (double)entity.m_146908_());
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$34(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$35(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v27 = _mobEnt.m_5448_();
                            } else {
                                v27 = null;
                            }
                            if (entityiterator != v27) continue;
                            entityiterator.getPersistentData().m_128379_("dltarget", true);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk5") == 85.0) {
                        entity.getPersistentData().m_128379_("lock", true);
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("atk5") == 72.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 4.0f, 0.3f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 4.0f, 0.3f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electricity_charge")), SoundSource.NEUTRAL, 4.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electricity_charge")), SoundSource.NEUTRAL, 4.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:notch_sweep")), SoundSource.NEUTRAL, 4.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:notch_sweep")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
                            }
                        }
                        _ent = entity;
                        look = entity.m_20154_();
                        tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), entity.m_20185_() + entity.m_20154_().f_82479_ * -5.0 + 8.0 * tangent.f_82479_, y + 8.0, entity.m_20189_() + entity.m_20154_().f_82481_ * -5.0 + 8.0 * tangent.f_82481_, 3, 0.4, 4.0, 0.4, 0.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123747_, entity.m_20185_() + entity.m_20154_().f_82479_ * -5.0 + 8.0 * tangent.f_82479_, y + 8.0, entity.m_20189_() + entity.m_20154_().f_82481_ * -5.0 + 8.0 * tangent.f_82481_, 3, 0.4, 4.0, 0.4, 0.0);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk5") == 31.0) {
                        entity.getPersistentData().m_128379_("Spear", true);
                    } else if (entity.getPersistentData().m_128459_("atk5") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                        entity.getPersistentData().m_128347_("atk5", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack5", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Spear")) {
                    if (entity.getPersistentData().m_128459_("spear") == 0.0) {
                        entity.getPersistentData().m_128347_("spear", 61.0);
                    } else {
                        entity.getPersistentData().m_128347_("spear", entity.getPersistentData().m_128459_("spear") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("spear") == 61.0 || entity.getPersistentData().m_128459_("spear") == 51.0 || entity.getPersistentData().m_128459_("spear") == 41.0 || entity.getPersistentData().m_128459_("spear") == 31.0 || entity.getPersistentData().m_128459_("spear") == 21.0 || entity.getPersistentData().m_128459_("spear") == 11.0 || entity.getPersistentData().m_128459_("spear") == 1.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$36(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$37(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!entityiterator.getPersistentData().m_128471_("dltarget") || !(world instanceof ServerLevel)) continue;
                            _level = (ServerLevel)world;
                            entityToSpawn = new LightningSpearEntity((EntityType<LightningSpearEntity>)((EntityType)SimpleMobsModEntities.LIGHTNING_SPEAR.get()), (Level)_level);
                            entityToSpawn.m_7678_(entityiterator.m_20185_() + (double)Mth.m_14072_((Random)new Random(), (int)-10, (int)10), entityiterator.m_20186_() + 80.0, entityiterator.m_20189_() + (double)Mth.m_14072_((Random)new Random(), (int)-10, (int)10), world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn);
                        }
                    }
                    if (entity.getPersistentData().m_128459_("spear") == 1.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$38(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$39(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!entityiterator.getPersistentData().m_128471_("dltarget")) {
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    v28 = _mobEnt.m_5448_();
                                } else {
                                    v28 = null;
                                }
                                if (entityiterator != v28) continue;
                            }
                            entityiterator.getPersistentData().m_128379_("dltarget", false);
                        }
                        entity.getPersistentData().m_128347_("spear", 0.0);
                        entity.getPersistentData().m_128379_("Spear", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack6")) {
                    if (entity.getPersistentData().m_128459_("Atk6") <= 0.0) {
                        entity.getPersistentData().m_128347_("Atk6", 51.0);
                    } else {
                        entity.getPersistentData().m_128347_("Atk6", entity.getPersistentData().m_128459_("Atk6") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("Atk6") == 51.0) {
                        entity.getPersistentData().m_128379_("Attacking", true);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50041_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50041_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 76, 6, false, false));
                        }
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                    } else if (entity.getPersistentData().m_128459_("Atk6") == 50.0) {
                        entity.getPersistentData().m_128379_("lock", true);
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("Atk6") == 33.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_wing_flap3")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_wing_flap3")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_())) * 3.0, 1.6, Math.cos(Math.toRadians(entity.m_146908_() + 180.0f)) * 3.0));
                    } else if (entity.getPersistentData().m_128459_("Atk6") == 10.0) {
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                    } else if (entity.getPersistentData().m_128459_("Atk6") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("Atk6", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack6", false);
                    }
                    if (entity.getPersistentData().m_128459_("Atk6") < 35.0 && entity.getPersistentData().m_128459_("Atk6") >= 30.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 1.5, y, z + entity.m_20154_().f_82481_ * 1.5);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$40(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$41(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(15.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 20.0f);
                            entityiterator.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 1.7, 0.7, Math.cos(Math.toRadians(entity.m_146908_())) * 1.7));
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Up")) {
                    if (entity.getPersistentData().m_128459_("up") <= 0.0) {
                        entity.getPersistentData().m_128347_("up", 44.0);
                    } else {
                        entity.getPersistentData().m_128347_("up", entity.getPersistentData().m_128459_("up") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("up") == 44.0) {
                        entity.getPersistentData().m_128379_("Attacking", true);
                        entity.getPersistentData().m_128379_("air", true);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50041_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50041_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 76, 6, false, false));
                        }
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                    } else if (entity.getPersistentData().m_128459_("up") == 43.0) {
                        entity.getPersistentData().m_128379_("lock", true);
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("up") == 24.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_wing_flap3")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_wing_flap3")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_())) * 6.0, 2.4, Math.cos(Math.toRadians(entity.m_146908_() + (float)Mth.m_14072_((Random)new Random(), (int)150, (int)220))) * 6.0));
                    } else if (entity.getPersistentData().m_128459_("up") == 10.0) {
                        entity.m_20242_(true);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                    } else if (entity.getPersistentData().m_128459_("up") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("up", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Up", false);
                    }
                    if (entity.getPersistentData().m_128459_("up") < 25.0 && entity.getPersistentData().m_128459_("up") >= 23.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 1.5, y, z + entity.m_20154_().f_82481_ * 1.5);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$42(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$43(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(15.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 20.0f);
                            entityiterator.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 3.0, 0.6, Math.cos(Math.toRadians(entity.m_146908_())) * 3.0));
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack7")) {
                    if (entity.getPersistentData().m_128459_("atk7") <= 0.0) {
                        entity.getPersistentData().m_128347_("atk7", 131.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk7", entity.getPersistentData().m_128459_("atk7") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk7") == 131.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon.roar1")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon.roar1")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                            }
                        }
                        entity.getPersistentData().m_128379_("Attacking", true);
                        entity.getPersistentData().m_128379_("focus", true);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50542_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50542_));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk7") == 116.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 5.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 5.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                            entityToSpawn /* !! */ .m_20219_(Vec3.m_82539_((Vec3i)new BlockPos(x + entity.m_20154_().f_82479_ * -4.0, y, z + entity.m_20154_().f_82481_ * -4.0)));
                            entityToSpawn /* !! */ .m_20874_(true);
                            _level.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                    } else if (entity.getPersistentData().m_128459_("atk7") == 102.0) {
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                    } else if (entity.getPersistentData().m_128459_("atk7") == 101.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128379_("lock", true);
                    } else if (entity.getPersistentData().m_128459_("atk7") == 56.0) {
                        entity.m_20242_(false);
                    } else if (entity.getPersistentData().m_128459_("atk7") == 2.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50108_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50108_));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk7") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk7", 0.0);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("air", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack7", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk7") == 86.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:thunder_spear")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:thunder_spear")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = new RodParticlesEntity((EntityType<RodParticlesEntity>)((EntityType)SimpleMobsModEntities.ROD_PARTICLES.get()), (Level)_level);
                            entityToSpawn /* !! */ .m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn /* !! */  instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                    } else if (entity.getPersistentData().m_128459_("atk7") == 60.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk7") == 49.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(5.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$44(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$45(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof RodParticlesEntity) || entityiterator.f_19853_.m_5776_()) continue;
                            entityiterator.m_146870_();
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123812_, x, y, z, 50, 3.0, 3.0, 3.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x, y, z, 60, 9.0, 9.0, 9.0, 0.3);
                        }
                    }
                    if (entity.getPersistentData().m_128459_("atk7") < 111.0 && entity.getPersistentData().m_128459_("atk7") >= 51.0 && entity.m_20096_() && world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x, y, z, 10, 6.0, 1.0, 6.0, 0.3);
                    }
                    if (entity.getPersistentData().m_128459_("atk7") < 101.0 && entity.getPersistentData().m_128459_("atk7") >= 49.0) {
                        _center = new Vec3(x, y + 2.0, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(8.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$46(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$47(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v29 = _mobEnt.m_5448_();
                            } else {
                                v29 = null;
                            }
                            if (entityiterator != v29) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(16.0f).setArmorNegation(50.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 45.0f);
                        }
                        if (entity.getPersistentData().m_128459_("atk7") >= 61.0) {
                            entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 1.8, -1.9, Math.cos(Math.toRadians(entity.m_146908_())) * 1.8));
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack8")) {
                    if (entity.getPersistentData().m_128459_("atk8") <= 0.0) {
                        entity.getPersistentData().m_128347_("atk8", 76.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk8", entity.getPersistentData().m_128459_("atk8") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk8") == 76.0) {
                        entity.getPersistentData().m_128379_("Attacking", true);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50098_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50098_));
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$48(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$49(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v30 = _mobEnt.m_5448_();
                            } else {
                                v30 = null;
                            }
                            if (entityiterator != v30) continue;
                            entityiterator.getPersistentData().m_128379_("dltarget", true);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk8") == 59.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 4.0f, 0.8f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 4.0f, 0.8f, false);
                            }
                        }
                        entity.getPersistentData().m_128379_("fire2", true);
                    } else if (entity.getPersistentData().m_128459_("atk8") == 48.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 4.0f, 0.8f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 4.0f, 0.8f, false);
                            }
                        }
                        entity.getPersistentData().m_128379_("fire2", false);
                        entity.getPersistentData().m_128379_("fire3", true);
                    } else if (entity.getPersistentData().m_128459_("atk8") == 39.0) {
                        entity.getPersistentData().m_128379_("fire3", false);
                    } else if (entity.getPersistentData().m_128459_("atk8") == 13.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 4.0f, 0.8f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 4.0f, 0.8f, false);
                            }
                        }
                        entity.getPersistentData().m_128379_("fire4", true);
                    } else if (entity.getPersistentData().m_128459_("atk8") == 1.0) {
                        entity.getPersistentData().m_128379_("fire4", false);
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$50(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$51(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v31 = _mobEnt.m_5448_();
                            } else {
                                v31 = null;
                            }
                            if (entityiterator != v31) continue;
                            entityiterator.getPersistentData().m_128379_("dltarget", false);
                        }
                        if (Math.random() >= 0.5 || entity.getPersistentData().m_128471_("atk8done")) {
                            _entity = entity;
                            if (_entity instanceof Player) {
                                _player = (Player)_entity;
                                _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                                _player.m_150109_().m_6596_();
                            } else if (_entity instanceof LivingEntity) {
                                _living = (LivingEntity)_entity;
                                _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                            }
                            entity.m_20242_(false);
                            entity.getPersistentData().m_128379_("air", false);
                            entity.getPersistentData().m_128347_("atk8", 0.0);
                            entity.getPersistentData().m_128379_("Attacking", false);
                            entity.getPersistentData().m_128379_("Attack8", false);
                        }
                        entity.getPersistentData().m_128379_("atk8done", true);
                    }
                    if (entity.getPersistentData().m_128459_("atk8") <= 61.0 && entity.getPersistentData().m_128459_("atk8") >= 21.0) {
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 0.8, 0.0, Math.cos(Math.toRadians(entity.m_146908_())) * 0.8));
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack9")) {
                    if (entity.getPersistentData().m_128459_("atk9") == 0.0) {
                        entity.getPersistentData().m_128347_("atk9", 56.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk9", entity.getPersistentData().m_128459_("atk9") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk9") == 56.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50107_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50107_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 81, 6, false, false));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                    } else if (entity.getPersistentData().m_128459_("atk9") == 49.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk9") == 40.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", 0.0);
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:firegiant_footstep")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:firegiant_footstep")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                        entity.getPersistentData().m_128379_("lock", true);
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("atk9") < 39.0 && entity.getPersistentData().m_128459_("atk9") > 35.0) {
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 0.8, 0.0, Math.cos(Math.toRadians(entity.m_146908_())) * 0.8));
                    } else if (entity.getPersistentData().m_128459_("atk9") == 1.0) {
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("noai", false);
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk9", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack9", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk9") == 37.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                    }
                    if (entity.getPersistentData().m_128459_("atk9") < 38.0 && entity.getPersistentData().m_128459_("atk9") > 32.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), x + entity.m_20154_().f_82479_ * 17.0, y, z + entity.m_20154_().f_82481_ * 17.0, 2, 2.0, 2.0, 2.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + entity.m_20154_().f_82479_ * 17.0, y, z + entity.m_20154_().f_82481_ * 17.0, 2, 2.0, 2.0, 2.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x + entity.m_20154_().f_82479_ * 17.0, y, z + entity.m_20154_().f_82481_ * 17.0, 1, 3.0, 3.0, 3.0, 1.0);
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$52(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$53(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) || !(entityiterator instanceof LivingEntity)) continue;
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 20, 0, false, false));
                        }
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 17.0, y, z + entity.m_20154_().f_82481_ * 17.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(5.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$54(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$55(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.KNOCKDOWN).setImpact(2.0f).setArmorNegation(50.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 40.0f);
                        }
                        entity.getPersistentData().m_128347_("s", entity.getPersistentData().m_128459_("s") + 1.0);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack10")) {
                    if (entity.getPersistentData().m_128459_("atk10") == 0.0) {
                        entity.getPersistentData().m_128347_("atk10", 85.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk10", entity.getPersistentData().m_128459_("atk10") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk10") == 85.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50054_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50054_));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 85, 6, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10") == 48.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", 0.0);
                        entity.getPersistentData().m_128379_("lock", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10") < 44.0 && entity.getPersistentData().m_128459_("atk10") > 39.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 15.0, y, z + entity.m_20154_().f_82481_ * 15.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(6.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$56(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$57(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(50.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 45.0f);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10") == 31.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$58(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$59(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                            }
                            entity.getPersistentData().m_128347_("atk10", 0.0);
                            entity.getPersistentData().m_128379_("Attack10b", true);
                            entity.getPersistentData().m_128379_("lock", false);
                            entity.getPersistentData().m_128379_("Attack10", false);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10") == 10.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk10", 0.0);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack10", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk10") == 65.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + entity.m_20154_().f_82479_ * 2.0, y, z + entity.m_20154_().f_82481_ * 2.0, 5, 1.0, 1.0, 1.0, 0.1);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123747_, x + entity.m_20154_().f_82479_ * 2.0, y, z + entity.m_20154_().f_82481_ * 2.0, 5, 3.0, 3.0, 3.0, 1.0);
                        }
                        entity.getPersistentData().m_128347_("i", 11.0);
                        entity.getPersistentData().m_128347_("j", -3.0);
                    } else if (entity.getPersistentData().m_128459_("atk10") <= 53.0 && entity.getPersistentData().m_128459_("atk10") >= 47.0) {
                        look = entity.m_20154_();
                        tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), x + entity.m_20154_().f_82479_ * 17.0, y + entity.getPersistentData().m_128459_("j"), z + entity.m_20154_().f_82481_ * 17.0, 1, 0.1, 0.5, 0.1, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + entity.m_20154_().f_82479_ * 17.0, y + entity.getPersistentData().m_128459_("j"), z + entity.m_20154_().f_82481_ * 17.0, 2, 0.1, 0.5, 0.1, 1.0);
                        }
                        entity.getPersistentData().m_128347_("i", entity.getPersistentData().m_128459_("i") - 1.5);
                        entity.getPersistentData().m_128347_("j", entity.getPersistentData().m_128459_("j") + 1.0);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack10alt")) {
                    if (entity.getPersistentData().m_128459_("atk10alt") == 0.0) {
                        entity.getPersistentData().m_128347_("atk10alt", 65.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk10alt", entity.getPersistentData().m_128459_("atk10alt") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk10alt") == 65.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50050_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50050_));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 85, 6, false, false));
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10alt") == 48.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", 0.0);
                        entity.getPersistentData().m_128379_("lock", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10alt") < 44.0 && entity.getPersistentData().m_128459_("atk10alt") > 39.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 14.0, y, z + entity.m_20154_().f_82481_ * 14.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$60(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$61(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(30.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 30.0f);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10alt") == 31.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$62(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$63(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                            }
                            entity.getPersistentData().m_128347_("atk10alt", 0.0);
                            entity.getPersistentData().m_128379_("lock", false);
                            entity.getPersistentData().m_128379_("Attack10alt", false);
                            entity.getPersistentData().m_128379_("Attack10b", true);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10alt") == 10.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10alt") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk10alt", 0.0);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack10alt", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack10b")) {
                    if (entity.getPersistentData().m_128459_("atk10b") == 0.0) {
                        entity.getPersistentData().m_128347_("atk10b", 71.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk10b", entity.getPersistentData().m_128459_("atk10b") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk10b") == 71.0) {
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 71, 6, false, false));
                        }
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50184_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50184_));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                    } else if (entity.getPersistentData().m_128459_("atk10b") == 63.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128379_("lock", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10b") == 56.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10b") < 52.0 && entity.getPersistentData().m_128459_("atk10b") > 47.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 15.0, y, z + entity.m_20154_().f_82481_ * 15.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(4.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$64(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$65(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(30.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 30.0f);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10b") == 10.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                    } else if (entity.getPersistentData().m_128459_("atk10b") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk10b", 0.0);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack10b", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack11")) {
                    if (entity.getPersistentData().m_128459_("atk11") == 0.0) {
                        entity.getPersistentData().m_128347_("atk11", 186.0);
                        entity.getPersistentData().m_128347_("t_s", 0.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk11", entity.getPersistentData().m_128459_("atk11") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk11") == 186.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42450_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42450_));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                    } else if (entity.getPersistentData().m_128459_("atk11") == 168.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", 0.0);
                        entity.getPersistentData().m_128379_("lock", true);
                    } else if (entity.getPersistentData().m_128459_("atk11") == 166.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_lord_roar")), SoundSource.NEUTRAL, 4.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_lord_roar")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk11") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                        entity.getPersistentData().m_128347_("atk11", 0.0);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack11", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk11") < 140.0 && entity.getPersistentData().m_128459_("atk11") > 61.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$66(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$67(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) || !(entityiterator instanceof LivingEntity)) continue;
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 20, 0, false, false));
                        }
                        if (Math.random() >= 0.6) {
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 7.0, y, z + entity.m_20154_().f_82481_ * 7.0);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$68(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$69(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                            for (Entity entityiterator : _entfound) {
                                if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                                entityiterator.m_6469_(DamageSource.f_19318_, 2.0f);
                                if (!(entityiterator instanceof LivingEntity)) continue;
                                _entity = (LivingEntity)entityiterator;
                                _entity.m_7292_(new MobEffectInstance((MobEffect)SimpleMobsModMobEffects.SHOCK.get(), 2, 0, false, false));
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)ParticleTypes.f_123747_, x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * 7.0, y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82481_ * 7.0, 1, 5.0, 7.0, 5.0, 0.0);
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.DRAGON_THUNDER_LIT_2.get()), x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * 7.0, y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82481_ * 7.0, 5, 10.0, 7.0, 10.0, 0.0);
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * 7.0, y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82481_ * 7.0, 5, 10.0, 7.0, 10.0, 0.0);
                            }
                        }
                        if (Math.random() >= 0.9 && entity.getPersistentData().m_128459_("t_s") <= 20.0) {
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                entityToSpawn /* !! */  = new Thundereffect3Entity((EntityType<Thundereffect3Entity>)((EntityType)SimpleMobsModEntities.THUNDEREFFECT_3.get()), (Level)_level);
                                entityToSpawn /* !! */ .m_7678_(x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20), y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20), 0.0f, 0.0f);
                                entityToSpawn /* !! */ .m_5618_(0.0f);
                                entityToSpawn /* !! */ .m_5616_(0.0f);
                                if (entityToSpawn /* !! */  instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                world.m_7967_((Entity)entityToSpawn /* !! */ );
                            }
                            entity.getPersistentData().m_128347_("t_s", entity.getPersistentData().m_128459_("t_s") + 1.0);
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack11a")) {
                    if (entity.getPersistentData().m_128459_("atk11a") == 0.0) {
                        entity.getPersistentData().m_128347_("atk11a", 186.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk11a", entity.getPersistentData().m_128459_("atk11a") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk11a") == 186.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42450_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42450_));
                        }
                        entity.getPersistentData().m_128379_("focus", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                    } else if (entity.getPersistentData().m_128459_("atk11a") == 168.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", 0.0);
                        entity.getPersistentData().m_128379_("lock", true);
                    } else if (entity.getPersistentData().m_128459_("atk11a") == 166.0) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_lord_roar")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_lord_roar")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(70.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$70(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$71(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(world instanceof Level)) continue;
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:earthquake")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                continue;
                            }
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:earthquake")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk11a") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                        entity.getPersistentData().m_128347_("atk11a", 0.0);
                        entity.getPersistentData().m_128379_("lock", false);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack11a", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk11a") < 144.0 && entity.getPersistentData().m_128459_("atk11a") > 41.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(8.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$72(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$73(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof Player) && !(entityiterator instanceof ServerPlayer) || !(entityiterator instanceof LivingEntity)) continue;
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_7292_(new MobEffectInstance((MobEffect)DawnCraftEffects.TREMOR.get(), 20, 0, false, false));
                        }
                        if (Math.random() >= 0.6) {
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 7.0, y, z + entity.m_20154_().f_82481_ * 7.0);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$74(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$75(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                            for (Entity entityiterator : _entfound) {
                                if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                                entityiterator.m_6469_(DamageSource.f_19318_, 2.0f);
                                if (!(entityiterator instanceof LivingEntity)) continue;
                                _entity = (LivingEntity)entityiterator;
                                _entity.m_7292_(new MobEffectInstance((MobEffect)SimpleMobsModMobEffects.SHOCK.get(), 2, 0, false, false));
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)ParticleTypes.f_123747_, x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * 7.0, y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82481_ * 7.0, 1, 7.0, 7.0, 7.0, 0.0);
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.DRAGON_THUNDER_LIT_2.get()), x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * 7.0, y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82481_ * 7.0, 5, 10.0, 7.0, 10.0, 0.0);
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * 7.0, y, z + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82481_ * 7.0, 5, 10.0, 7.0, 10.0, 0.0);
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                entityToSpawn /* !! */  = new MeteorAttackEntity((EntityType<MeteorAttackEntity>)((EntityType)SimpleMobsModEntities.METEOR_ATTACK.get()), (Level)_level);
                                entityToSpawn /* !! */ .m_7678_(x + (double)Mth.m_14072_((Random)new Random(), (int)-20, (int)20) + entity.m_20154_().f_82479_ * (double)Mth.m_14072_((Random)new Random(), (int)-40, (int)-10), y + 70.0, z + (double)Mth.m_14072_((Random)new Random(), (int)-50, (int)50) + entity.m_20154_().f_82481_ * (double)Mth.m_14072_((Random)new Random(), (int)-40, (int)-10), entity.m_146908_() + (float)Mth.m_14072_((Random)new Random(), (int)-50, (int)50), 0.0f);
                                entityToSpawn /* !! */ .m_5618_(entity.m_146908_() + (float)Mth.m_14072_((Random)new Random(), (int)-50, (int)50));
                                entityToSpawn /* !! */ .m_5616_(entity.m_146908_() + (float)Mth.m_14072_((Random)new Random(), (int)-50, (int)50));
                                if (entityToSpawn /* !! */  instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                world.m_7967_((Entity)entityToSpawn /* !! */ );
                            }
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("sweep")) {
                    if (entity.getPersistentData().m_128459_("i") > 3.0) {
                        entity.getPersistentData().m_128347_("revdir", (double)(entity.m_146908_() + 180.0f));
                        if (entity.getPersistentData().m_128459_("revdir") > 360.0) {
                            entity.getPersistentData().m_128347_("revdir", entity.getPersistentData().m_128459_("revdir") - 360.0);
                        }
                        entity.getPersistentData().m_128347_("direction", Math.abs(entity.getPersistentData().m_128459_("revdir")) / 360.0 * 26.0);
                        entity.getPersistentData().m_128347_("nowdirection", entity.getPersistentData().m_128459_("direction") + entity.getPersistentData().m_128459_("i"));
                        if (entity.getPersistentData().m_128459_("direction") >= 24.0 && entity.getPersistentData().m_128459_("direction") <= 25.0) {
                            entity.getPersistentData().m_128347_("nowdirection", 0.0 + entity.getPersistentData().m_128459_("i"));
                        }
                        if (entity.getPersistentData().m_128459_("nowdirection") > 25.0) {
                            entity.getPersistentData().m_128347_("nowdirection", entity.getPersistentData().m_128459_("nowdirection") - 25.0);
                        } else if (entity.getPersistentData().m_128459_("nowdirection") < 0.0) {
                            entity.getPersistentData().m_128347_("nowdirection", entity.getPersistentData().m_128459_("nowdirection") + 25.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123796_, x + entity.m_20154_().f_82479_ * -2.0 + Math.cos(0.25132741228718347 * entity.getPersistentData().m_128459_("nowdirection")) * 8.0, y, z + entity.m_20154_().f_82481_ * -2.0 + Math.sin(0.25132741228718347 * entity.getPersistentData().m_128459_("nowdirection")) * 8.0, 10, 1.0, 1.0, 1.0, 0.6);
                        }
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * -5.0 + Math.cos(0.25132741228718347 * entity.getPersistentData().m_128459_("nowdirection")) * 8.0, y, z + entity.m_20154_().f_82481_ * -5.0 + Math.sin(0.25132741228718347 * entity.getPersistentData().m_128459_("nowdirection")) * 8.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(6.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$76(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$77(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entityiterator;
                                v32 = _livEnt.m_21254_();
                            } else {
                                v32 = false;
                            }
                            if (v32) {
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator;
                                    v33 = _livEnt.m_21205_();
                                } else {
                                    v33 = ItemStack.f_41583_;
                                }
                                if (v33.m_41720_() == Items.f_42740_) {
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        v34 = _livEnt.m_21205_();
                                    } else {
                                        v34 = _ist = ItemStack.f_41583_;
                                    }
                                    if (_ist.m_41629_(30, new Random(), null)) {
                                        _ist.m_41774_(1);
                                        _ist.m_41721_(0);
                                    }
                                    if (entityiterator instanceof Player) {
                                        _player = (Player)entityiterator;
                                        v35 = _player.m_36335_();
                                        if (entityiterator instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entityiterator;
                                            v36 = _livEnt.m_21205_();
                                        } else {
                                            v36 = ItemStack.f_41583_;
                                        }
                                        v35.m_41524_(v36.m_41720_(), 200);
                                    }
                                    if (!(world instanceof Level)) continue;
                                    _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, new BlockPos(entityiterator.m_20185_(), entityiterator.m_20186_(), entityiterator.m_20189_()), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        continue;
                                    }
                                    _level.m_7785_(entityiterator.m_20185_(), entityiterator.m_20186_(), entityiterator.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                    continue;
                                }
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator;
                                    v37 = _livEnt.m_21206_();
                                } else {
                                    v37 = _ist = ItemStack.f_41583_;
                                }
                                if (_ist.m_41629_(16, new Random(), null)) {
                                    _ist.m_41774_(1);
                                    _ist.m_41721_(0);
                                }
                                if (entityiterator instanceof Player) {
                                    _player = (Player)entityiterator;
                                    v38 = _player.m_36335_();
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        v39 = _livEnt.m_21206_();
                                    } else {
                                        v39 = ItemStack.f_41583_;
                                    }
                                    v38.m_41524_(v39.m_41720_(), 200);
                                }
                                if (!(world instanceof Level)) continue;
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, new BlockPos(entityiterator.m_20185_(), entityiterator.m_20186_(), entityiterator.m_20189_()), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                    continue;
                                }
                                _level.m_7785_(entityiterator.m_20185_(), entityiterator.m_20186_(), entityiterator.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                continue;
                            }
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.SHORT).setImpact(0.5f).setArmorNegation(30.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 30.0f);
                            entityiterator.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() - 90.0f)) * 3.0, 0.8, Math.cos(Math.toRadians(entity.m_146908_() + 90.0f)) * 3.0));
                        }
                        entity.getPersistentData().m_128347_("i", entity.getPersistentData().m_128459_("i") - 1.0);
                    } else {
                        entity.getPersistentData().m_128379_("sweep", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack12")) {
                    if (entity.getPersistentData().m_128459_("atk12") == 0.0) {
                        entity.getPersistentData().m_128347_("atk12", 96.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk12", entity.getPersistentData().m_128459_("atk12") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk12") == 96.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50112_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50112_));
                        }
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                    } else if (entity.getPersistentData().m_128459_("atk12") == 95.0) {
                        entity.getPersistentData().m_128379_("lock", true);
                    } else if (entity.getPersistentData().m_128459_("atk12") == 82.0) {
                        entity.getPersistentData().m_128379_("fire5", true);
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_flame")), SoundSource.NEUTRAL, 3.0f, 0.7f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon_flame")), SoundSource.NEUTRAL, 3.0f, 0.7f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk12") == 20.0) {
                        entity.getPersistentData().m_128379_("fire5", false);
                    } else if (entity.getPersistentData().m_128459_("atk12") == 6.0) {
                        entity.getPersistentData().m_128379_("lock", false);
                    } else if (entity.getPersistentData().m_128459_("atk12") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk12", 1.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack12", false);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack13")) {
                    if (entity.getPersistentData().m_128459_("atk13") == 0.0) {
                        entity.getPersistentData().m_128347_("atk13", 61.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk13", entity.getPersistentData().m_128459_("atk13") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk13") == 61.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42516_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42516_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19609_, 14, 1, false, false));
                        }
                        entity.getPersistentData().m_128347_("i", 11.0);
                        entity.getPersistentData().m_128347_("j", -3.0);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,sort=nearest,limit=1] {Invulnerable:1b}");
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x + entity.m_20154_().f_82479_ * 8.0, y + 7.0, entity.m_20189_() + entity.m_20154_().f_82481_ * 8.0, 200, 14.0, 8.0, 14.0, 1.0);
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 4.0f, 0.7f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 4.0f, 0.7f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.NEUTRAL, 4.0f, 0.7f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.NEUTRAL, 4.0f, 0.7f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = new DragonSmokeEntity((EntityType<DragonSmokeEntity>)((EntityType)SimpleMobsModEntities.DRAGON_SMOKE.get()), (Level)_level);
                            entityToSpawn /* !! */ .m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
                            entityToSpawn /* !! */ .m_5618_(entity.m_146908_());
                            entityToSpawn /* !! */ .m_5616_(entity.m_146908_());
                            if (entityToSpawn /* !! */  instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                        entity.getPersistentData().m_128379_("Attacking", true);
                    } else if (entity.getPersistentData().m_128459_("atk13") == 56.0) {
                        entity.getPersistentData().m_128379_("focus", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,sort=nearest,limit=1] {Invulnerable:0}");
                        }
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(129.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$78(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$79(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v40 = _mobEnt.m_5448_();
                            } else {
                                v40 = null;
                            }
                            if (entityiterator != v40) continue;
                            _ent = entity;
                            _ent.m_6021_(entityiterator.m_20185_() + entityiterator.m_20154_().f_82479_ * -14.0, entityiterator.m_20186_(), entityiterator.m_20189_() + entityiterator.m_20154_().f_82481_ * -14.0);
                            if (!(_ent instanceof ServerPlayer)) continue;
                            _serverPlayer = (ServerPlayer)_ent;
                            _serverPlayer.f_8906_.m_9774_(entityiterator.m_20185_() + entityiterator.m_20154_().f_82479_ * -14.0, entityiterator.m_20186_(), entityiterator.m_20189_() + entityiterator.m_20154_().f_82481_ * -14.0, _ent.m_146908_(), _ent.m_146909_());
                        }
                    } else if (entity.getPersistentData().m_128459_("atk13") == 49.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", 0.0);
                        entity.getPersistentData().m_128379_("lock", true);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123778_, x + entity.m_20154_().f_82479_ * 10.0, y, z + entity.m_20154_().f_82481_ * 10.0, 50, 8.0, 5.0, 8.0, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:1b}");
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk13") < 40.0 && entity.getPersistentData().m_128459_("atk13") > 36.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(5.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$80(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$81(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.LONG).setImpact(2.0f).setArmorNegation(50.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 40.0f);
                        }
                    } else if (entity.getPersistentData().m_128459_("atk13") == 7.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,limit=1,sort=nearest] {NoAI:0}");
                        }
                        entity.getPersistentData().m_128379_("lock", false);
                    } else if (entity.getPersistentData().m_128459_("atk13") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk13", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack13", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk13") <= 41.0 && entity.getPersistentData().m_128459_("atk13") >= 35.0) {
                        look = entity.m_20154_();
                        tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), x + entity.m_20154_().f_82479_ * 17.0, y + entity.getPersistentData().m_128459_("j"), z + entity.m_20154_().f_82481_ * 17.0, 1, 0.1, 0.5, 0.1, 1.0);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + entity.m_20154_().f_82479_ * 17.0, y + entity.getPersistentData().m_128459_("j"), z + entity.m_20154_().f_82481_ * 17.0, 2, 0.1, 0.5, 0.1, 1.0);
                        }
                        entity.getPersistentData().m_128347_("i", entity.getPersistentData().m_128459_("i") - 1.5);
                        entity.getPersistentData().m_128347_("j", entity.getPersistentData().m_128459_("j") + 1.0);
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack14")) {
                    if (entity.getPersistentData().m_128459_("atk14") == 0.0) {
                        entity.getPersistentData().m_128347_("atk14", 161.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk14", entity.getPersistentData().m_128459_("atk14") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk14") == 161.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42619_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42619_));
                        }
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19609_, 14, 1, false, false));
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 4.0f, 0.7f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:skeletonlord_hammerform")), SoundSource.NEUTRAL, 4.0f, 0.7f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.NEUTRAL, 4.0f, 0.7f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.NEUTRAL, 4.0f, 0.7f, false);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,sort=nearest,limit=1] {Invulnerable:1b}");
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = new DragonSmokeEntity((EntityType<DragonSmokeEntity>)((EntityType)SimpleMobsModEntities.DRAGON_SMOKE.get()), (Level)_level);
                            entityToSpawn /* !! */ .m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
                            entityToSpawn /* !! */ .m_5618_(entity.m_146908_());
                            entityToSpawn /* !! */ .m_5616_(entity.m_146908_());
                            if (entityToSpawn /* !! */  instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x + entity.m_20154_().f_82479_ * 8.0, y + 7.0, entity.m_20189_() + entity.m_20154_().f_82481_ * 8.0, 200, 14.0, 8.0, 14.0, 1.0);
                        }
                        entity.m_20242_(true);
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(Mth.m_14072_((Random)new Random(), (int)-360, (int)360))) * 7.0, 1.1, Math.cos(Math.toRadians(Mth.m_14072_((Random)new Random(), (int)-360, (int)360))) * 7.0));
                        entity.getPersistentData().m_128379_("focus", true);
                    } else if (entity.getPersistentData().m_128459_("atk14") == 98.0) {
                        entity.getPersistentData().m_128347_("xz", entity.getPersistentData().m_128459_("yaw2"));
                        entity.getPersistentData().m_128347_("y", (double)entity.m_146909_());
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level.m_142572_(), null).m_81324_(), "/data merge entity @e[type=simple_mobs:dragon_lord,sort=nearest,limit=1] {Invulnerable:0}");
                        }
                        entity.getPersistentData().m_128379_("focus", false);
                    } else if (entity.getPersistentData().m_128459_("atk14") == 97.0) {
                        entity.getPersistentData().m_128379_("focus", false);
                        entity.getPersistentData().m_128379_("lock", true);
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon.roar1")), SoundSource.NEUTRAL, 3.0f, 0.5f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:dragon.roar1")), SoundSource.NEUTRAL, 3.0f, 0.5f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk14") == 46.0) {
                        entity.m_20242_(false);
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x, y, z, 100, 6.0, 2.0, 6.0, 0.3);
                        }
                        entity.getPersistentData().m_128379_("noai", true);
                    } else if (entity.getPersistentData().m_128459_("atk14") == 6.0) {
                        entity.getPersistentData().m_128379_("noai", false);
                    } else if (entity.getPersistentData().m_128459_("atk14") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk14", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack14", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk14") == 141.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = new RodParticlesEntity((EntityType<RodParticlesEntity>)((EntityType)SimpleMobsModEntities.ROD_PARTICLES.get()), (Level)_level);
                            entityToSpawn /* !! */ .m_7678_(x, y + 1.0, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn /* !! */  instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn /* !! */ ;
                                _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn /* !! */ .m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            world.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            entityToSpawn /* !! */  = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                            entityToSpawn /* !! */ .m_20219_(Vec3.m_82539_((Vec3i)new BlockPos(x, y, z)));
                            entityToSpawn /* !! */ .m_20874_(true);
                            _level.m_7967_((Entity)entityToSpawn /* !! */ );
                        }
                    } else if (entity.getPersistentData().m_128459_("atk14") == 100.0) {
                        _center = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(7.5), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$82(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$83(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (!(entityiterator instanceof RodParticlesEntity) || entityiterator.f_19853_.m_5776_()) continue;
                            entityiterator.m_146870_();
                        }
                    }
                    if (entity.getPersistentData().m_128459_("atk14") < 100.0 && entity.getPersistentData().m_128459_("atk14") >= 42.0) {
                        entity.m_20256_(new Vec3(Math.sin(Math.toRadians(entity.m_146908_() + 180.0f)) * 1.8, -1.9, Math.cos(Math.toRadians(entity.m_146908_())) * 1.8));
                    }
                    if (entity.getPersistentData().m_128459_("atk14") > 46.0 && entity.getPersistentData().m_128459_("atk14") < 110.0) {
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 12.0, y, z + entity.m_20154_().f_82481_ * 12.0);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(6.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$84(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$85(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v41 = _mobEnt.m_5448_();
                            } else {
                                v41 = null;
                            }
                            if (entityiterator != v41) continue;
                            entity.m_20242_(false);
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x, y, z, 10, 6.0, 1.0, 6.0, 0.3);
                            }
                            entity.getPersistentData().m_128347_("atk14", 0.0);
                            entity.getPersistentData().m_128379_("Attack14b", true);
                            entity.getPersistentData().m_128379_("Attack14", false);
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Attack14b")) {
                    if (entity.getPersistentData().m_128459_("atk14b") == 0.0) {
                        entity.getPersistentData().m_128347_("i", 10.0);
                        entity.getPersistentData().m_128347_("atk14b", 62.0);
                    } else {
                        entity.getPersistentData().m_128347_("atk14b", entity.getPersistentData().m_128459_("atk14b") - 1.0);
                    }
                    if (entity.getPersistentData().m_128459_("atk14b") == 62.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Items.f_42677_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42677_));
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:lightning_dragon_sweep")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 3.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:electric_1")), SoundSource.NEUTRAL, 3.0f, 1.0f, false);
                            }
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 3.0f, 0.4f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_mobs:spell_form")), SoundSource.NEUTRAL, 3.0f, 0.4f, false);
                            }
                        }
                    } else if (entity.getPersistentData().m_128459_("atk14b") == 6.0) {
                        entity.getPersistentData().m_128379_("lock", false);
                    } else if (entity.getPersistentData().m_128459_("atk14b") == 1.0) {
                        _entity = entity;
                        if (_entity instanceof Player) {
                            _player = (Player)_entity;
                            _player.m_150109_().f_35975_.set(3, (Object)new ItemStack((ItemLike)Blocks.f_50016_));
                            _player.m_150109_().m_6596_();
                        } else if (_entity instanceof LivingEntity) {
                            _living = (LivingEntity)_entity;
                            _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Blocks.f_50016_));
                        }
                        entity.getPersistentData().m_128347_("atk14b", 0.0);
                        entity.getPersistentData().m_128379_("Attacking", false);
                        entity.getPersistentData().m_128379_("Attack14b", false);
                    }
                    if (entity.getPersistentData().m_128459_("atk14b") <= 58.0 && entity.getPersistentData().m_128459_("atk14b") >= 53.0) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)ParticleTypes.f_123812_, x + entity.m_20154_().f_82479_ * 8.0, y, z + entity.m_20154_().f_82481_ * 8.0, 2, 8.0, 5.0, 8.0, 0.3);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.EXPLOSION.get()), x + entity.m_20154_().f_82479_ * 8.0, y, z + entity.m_20154_().f_82481_ * 8.0, 2, 8.0, 5.0, 8.0, 0.3);
                        }
                        entity.getPersistentData().m_128347_("i", entity.getPersistentData().m_128459_("i") - 3.0);
                        look = entity.m_20154_();
                        tangent = new Vec3(-look.f_82481_, 0.0, look.f_82479_);
                        _center = new Vec3(x + entity.m_20154_().f_82479_ * 14.0 + entity.getPersistentData().m_128459_("i") * tangent.f_82479_, y, z + entity.m_20154_().f_82481_ * 14.0 + entity.getPersistentData().m_128459_("i") * tangent.f_82481_);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(8.0), (Predicate<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$execute$86(net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)Z)()).stream().sorted(Comparator.comparingDouble((ToDoubleFunction<Entity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$execute$87(net.minecraft.world.phys.Vec3 net.minecraft.world.entity.Entity ), (Lnet/minecraft/world/entity/Entity;)D)((Vec3)_center))).collect(Collectors.toList());
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator.getPersistentData().m_128471_("dragon_lord")) continue;
                            dmgSrc = EpicFightDamageSource.commonEntityDamageSource((String)"mob", (LivingEntity)((LivingEntity)entity), (StaticAnimation)Animations.DUMMY_ANIMATION).setInitialPosition(entity.m_20182_()).setStunType(StunType.KNOCKDOWN).setImpact(2.0f).setArmorNegation(45.0f);
                            entityiterator.m_6469_((DamageSource)dmgSrc, 50.0f);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_1.get()), x + entity.m_20154_().f_82479_ * 14.0 + entity.getPersistentData().m_128459_("i") * tangent.f_82479_, y, z + entity.m_20154_().f_82481_ * 14.0 + entity.getPersistentData().m_128459_("i") * tangent.f_82481_, 4, 1.0, 0.3, 1.0, 0.3);
                        }
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_8767_((ParticleOptions)((SimpleParticleType)SimpleMobsModParticleTypes.THUNDER_FLASH_2.get()), x + entity.m_20154_().f_82479_ * 14.0 + entity.getPersistentData().m_128459_("i") * tangent.f_82479_, y, z + entity.m_20154_().f_82481_ * 14.0 + entity.getPersistentData().m_128459_("i") * tangent.f_82481_, 4, 1.0, 0.3, 1.0, 0.3);
                        }
                    }
                }
                if (entity.getPersistentData().m_128471_("Attacking") || entity.getPersistentData().m_128471_("Aggro")) break block956;
                if (entity.getPersistentData().m_128459_("idletimer") == 0.0) {
                    entity.getPersistentData().m_128347_("idletimer", 100.0);
                } else {
                    entity.getPersistentData().m_128347_("idletimer", entity.getPersistentData().m_128459_("idletimer") - 1.0);
                }
                if (entity.getPersistentData().m_128459_("idletimer") != 1.0) break block948;
                if (entity instanceof LivingEntity) {
                    _entity = (LivingEntity)entity;
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 100, 3, false, false));
                }
                if (entity instanceof LivingEntity) {
                    _entity = (LivingEntity)entity;
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 4, false, false));
                }
                break block948;
            }
            if (!entity.getPersistentData().m_128471_("Aggro") || !(entity.getPersistentData().m_128459_("idletimer") > 0.0)) break block948;
            entity.getPersistentData().m_128347_("idletimer", 0.0);
        }
    }

    private static /* synthetic */ double lambda$execute$87(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$86(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$85(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$84(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$83(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$82(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$81(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$80(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$79(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$78(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$77(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$76(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$75(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$74(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$73(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$72(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$71(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$70(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$69(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$68(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$67(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$66(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$65(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$64(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$63(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$62(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$61(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$60(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$59(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$58(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$57(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$56(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$55(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$54(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$53(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$52(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$51(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$50(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$49(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$48(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$47(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$46(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$45(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$44(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$43(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$42(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$41(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$40(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$39(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$38(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$37(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$36(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$35(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$34(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$33(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$32(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$31(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$30(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$29(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$28(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$27(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$26(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$25(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$24(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$23(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$22(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$21(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$20(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$19(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$18(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$17(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$16(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$15(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$14(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$13(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$12(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$11(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$10(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$9(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$8(Entity e) {
        return true;
    }

    private static /* synthetic */ double lambda$execute$7(Vec3 _center, Entity _entcnd) {
        return _entcnd.m_20238_(_center);
    }

    private static /* synthetic */ boolean lambda$execute$6(Entity e) {
        return true;
    }

    private static /* synthetic */ boolean lambda$execute$5(DLMultiPart7Entity e) {
        return true;
    }

    private static /* synthetic */ boolean lambda$execute$4(DLMultiPart6Entity e) {
        return true;
    }

    private static /* synthetic */ boolean lambda$execute$3(DLMultiPart5Entity e) {
        return true;
    }

    private static /* synthetic */ boolean lambda$execute$2(DLMultiPart4Entity e) {
        return true;
    }

    private static /* synthetic */ boolean lambda$execute$1(DLMultiPart3Entity e) {
        return true;
    }

    private static /* synthetic */ boolean lambda$execute$0(DLMultiPart2Entity e) {
        return true;
    }
}
