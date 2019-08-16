package com.kokkiemouse.mods.netherwartmod;



import com.kokkiemouse.mods.netherwartmod.biome.NetherWartBiome;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import java.io.File;

@Mod(modid = NetherWartMod.MOD_ID,name = NetherWartMod.MOD_NAME,version = NetherWartMod.MOD_VERSION,acceptedMinecraftVersions = NetherWartMod.MOD_ACCEPTED_MC_VERSIONS,useMetadata = true)
public class NetherWartMod {
    /** ModID文字列 */
    public static final String MOD_ID = "kokkiemousenetherwartmod";
    /** MOD名称 */
    public static final String MOD_NAME = "NetherWart Mod";
    /** MODのバージョン */
    public static final String MOD_VERSION = "1.0.0";
    /** 起動出来るMinecraft本体のバージョン。記法はMavenのVersion Range Specificationを検索すること。 */
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8,1.8.9]";

    /** 追加したバイオームのインスタンスを保持。 */
    public static BiomeGenBase netherwartbiome_st;
    public static int biome_ID=40;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        NetherWartModConfigCore.loadConfig(event);
        //BiomeManager.addSpawnBiome(netherwartbiome_st);

        netherwartbiome_st=(new NetherWartBiome(biome_ID)).setColor(0xff0000).setBiomeName("NetherWartLand");
        //BiomeDictionary.addTypes(netherwartbiome_st, BiomeDictionary.Type.PLAINS);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL,new BiomeManager.BiomeEntry(netherwartbiome_st,10));

        System.out.println("NetherWartBiome Added");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
}
