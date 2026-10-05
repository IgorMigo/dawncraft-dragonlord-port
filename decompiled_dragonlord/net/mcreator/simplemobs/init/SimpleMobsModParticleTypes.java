/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.simplemobs.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class SimpleMobsModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.PARTICLE_TYPES, (String)"simple_mobs");
    public static final RegistryObject<ParticleType<?>> LASER_BUBBLES = REGISTRY.register("laser_bubbles", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> FLAME = REGISTRY.register("flame", () -> new SimpleParticleType(true));
    public static final RegistryObject<ParticleType<?>> LASERBUBBLESSMALL = REGISTRY.register("laserbubblessmall", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> BURNT_FLAME = REGISTRY.register("burnt_flame", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> THUNDER_PARTICLE = REGISTRY.register("thunder_particle", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> FROST_1 = REGISTRY.register("frost_1", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> FROST_2 = REGISTRY.register("frost_2", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> SNOWYCLOUD = REGISTRY.register("snowycloud", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> LOSTEYEPARTICLE = REGISTRY.register("losteyeparticle", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> STONE_SWING = REGISTRY.register("stone_swing", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> MOON_SPARKLE = REGISTRY.register("moon_sparkle", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> DRAGON_THUNDER = REGISTRY.register("dragon_thunder", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> DRAGON_THUNDER_LIT = REGISTRY.register("dragon_thunder_lit", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> DRAGON_THUNDER_LIT_2 = REGISTRY.register("dragon_thunder_lit_2", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> THUNDER_FLASH_1 = REGISTRY.register("thunder_flash_1", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> THUNDER_FLASH_2 = REGISTRY.register("thunder_flash_2", () -> new SimpleParticleType(true));
    public static final RegistryObject<ParticleType<?>> EXPLOSION = REGISTRY.register("explosion", () -> new SimpleParticleType(true));
    public static final RegistryObject<ParticleType<?>> SPARKLE = REGISTRY.register("sparkle", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> LEAF = REGISTRY.register("leaf", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> ELECTRIC = REGISTRY.register("electric", () -> new SimpleParticleType(false));
    public static final RegistryObject<ParticleType<?>> SKULL_PARTICLE = REGISTRY.register("skull_particle", () -> new SimpleParticleType(true));
}
