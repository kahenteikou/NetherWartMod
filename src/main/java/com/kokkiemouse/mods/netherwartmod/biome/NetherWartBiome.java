package com.kokkiemouse.mods.netherwartmod.biome;


import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenPlains;

public class NetherWartBiome extends BiomeGenPlains {

    public NetherWartBiome(int  p_i1986_1_) {
        super(p_i1986_1_);
        topBlock = Blocks.nether_wart.getDefaultState();
        fillerBlock = Blocks.soul_sand.getDefaultState();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();

    }
}
