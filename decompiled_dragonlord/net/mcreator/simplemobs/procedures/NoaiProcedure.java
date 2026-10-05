/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.simplemobs.procedures;

import net.minecraft.world.entity.Entity;

public class NoaiProcedure {
    public static boolean execute(Entity entity) {
        if (entity == null) {
            return false;
        }
        return !entity.getPersistentData().m_128471_("noai");
    }
}
