package com.kokkiemouse.mods.netherwartmod.biome;


import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
public class NetherWartBiome extends  Biome {

    public NetherWartBiome() {
        super(new BiomeProperties("NetherWartLand").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F));
        topBlock = Blocks.NETHER_WART.getDefaultState();
        fillerBlock = Blocks.SOUL_SAND.getDefaultState();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();

    }
}
