/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.monster.Monster
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 */
package net.mcreator.simplemobs.procedures;

import net.mcreator.simplemobs.entity.DLMultiPart2Entity;
import net.mcreator.simplemobs.entity.DLMultiPart3Entity;
import net.mcreator.simplemobs.entity.DLMultiPart4Entity;
import net.mcreator.simplemobs.entity.DLMultiPart5Entity;
import net.mcreator.simplemobs.entity.DLMultiPart6Entity;
import net.mcreator.simplemobs.entity.DLMultiPart7Entity;
import net.mcreator.simplemobs.entity.DragonLordEntity;
import net.mcreator.simplemobs.init.SimpleMobsModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;

public class DragonLordSpawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof DragonLordEntity) {
            Mob _mobToSpawn;
            Monster entityToSpawn;
            ServerLevel _level;
            entity.getPersistentData().m_128379_("dragon_lord", true);
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = new DLMultiPart2Entity((EntityType<DLMultiPart2Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_2.get()), (Level)_level);
                entityToSpawn.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    _mobToSpawn = (Mob)entityToSpawn;
                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.m_7967_((Entity)entityToSpawn);
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = new DLMultiPart3Entity((EntityType<DLMultiPart3Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_3.get()), (Level)_level);
                entityToSpawn.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    _mobToSpawn = (Mob)entityToSpawn;
                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.m_7967_((Entity)entityToSpawn);
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = new DLMultiPart4Entity((EntityType<DLMultiPart4Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_4.get()), (Level)_level);
                entityToSpawn.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    _mobToSpawn = (Mob)entityToSpawn;
                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.m_7967_((Entity)entityToSpawn);
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = new DLMultiPart5Entity((EntityType<DLMultiPart5Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_5.get()), (Level)_level);
                entityToSpawn.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    _mobToSpawn = (Mob)entityToSpawn;
                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.m_7967_((Entity)entityToSpawn);
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = new DLMultiPart6Entity((EntityType<DLMultiPart6Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_6.get()), (Level)_level);
                entityToSpawn.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    _mobToSpawn = (Mob)entityToSpawn;
                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.m_7967_((Entity)entityToSpawn);
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = new DLMultiPart7Entity((EntityType<DLMultiPart7Entity>)((EntityType)SimpleMobsModEntities.DL_MULTI_PART_7.get()), (Level)_level);
                entityToSpawn.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    _mobToSpawn = (Mob)entityToSpawn;
                    _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(entityToSpawn.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.m_7967_((Entity)entityToSpawn);
            }
        }
    }
}
