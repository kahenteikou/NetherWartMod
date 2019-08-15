package com.kokkiemouse.mods.netherwartmod;



import com.kokkiemouse.mods.netherwartmod.biome.NetherWartBiome;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = NetherWartMod.MOD_ID,name = NetherWartMod.MOD_NAME,version = NetherWartMod.MOD_VERSION,acceptedMinecraftVersions = NetherWartMod.MOD_ACCEPTED_MC_VERSIONS,useMetadata = true)
public class NetherWartMod {
    /** ModID文字列 */
    public static final String MOD_ID = "kokkiemousenetherwartmod";
    /** MOD名称 */
    public static final String MOD_NAME = "NetherWart Mod";
    /** MODのバージョン */
    public static final String MOD_VERSION = "1.0.0";
    /** 起動出来るMinecraft本体のバージョン。記法はMavenのVersion Range Specificationを検索すること。 */
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12.2]";

    /** 追加したバイオームのインスタンスを保持。 */
    public static Biome netherwartbiome_st;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        netherwartbiome_st=new NetherWartBiome();
        netherwartbiome_st.setRegistryName("NetherWartLand");
        ForgeRegistries.BIOMES.register(netherwartbiome_st);
        System.out.println("NetherWartBiome Added");
        //BiomeDictionary.addTypes(netherwartbiome_st, BiomeDictionary.Type.PLAINS);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL,new BiomeManager.BiomeEntry(netherwartbiome_st,10));
        //BiomeManager.addSpawnBiome(netherwartbiome_st);

    }
}
