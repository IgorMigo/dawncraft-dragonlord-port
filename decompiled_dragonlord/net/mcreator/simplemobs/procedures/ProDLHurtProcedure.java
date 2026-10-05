/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
 */
package net.mcreator.simplemobs.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class ProDLHurtProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!world.m_5776_() && !entity.getPersistentData().m_128471_("hurtcd")) {
            Entity _entity = entity;
            if (_entity instanceof Player) {
                Player _player = (Player)_entity;
                _player.m_150109_().f_35975_.set(0, (Object)new ItemStack((ItemLike)Blocks.f_50493_));
                _player.m_150109_().m_6596_();
            } else if (_entity instanceof LivingEntity) {
                LivingEntity _living = (LivingEntity)_entity;
                _living.m_8061_(EquipmentSlot.FEET, new ItemStack((ItemLike)Blocks.f_50493_));
            }
            entity.getPersistentData().m_128379_("hurtcd", true);
        }
    }
}
