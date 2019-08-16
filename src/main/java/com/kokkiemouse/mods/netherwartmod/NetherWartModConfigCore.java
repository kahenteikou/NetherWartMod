package com.kokkiemouse.mods.netherwartmod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import com.kokkiemouse.mods.netherwartmod.NetherWartMod;
public class NetherWartModConfigCore {
    public static final String GENERAL = "General";
    public static final String BIO_ID= GENERAL + ".NetherWart_BIOME_ID";
    public static Configuration cfg;
    public static int BIOME_IDKUN=40;
    public static void loadConfig(FMLPreInitializationEvent event) {
        // net.minecraftforge.common.config.Configurationのインスタンスを生成する。
        cfg = new Configuration(event.getSuggestedConfigurationFile(), NetherWartMod.MOD_VERSION, true);
        // 初期化する。
        initConfig();
        // コンフィグファイルの内容を変数と同期させる。
        syncConfig();
    }
    private static void initConfig() {
        // カテゴリのコメントなどを設定する。
        // BIOME_ID
        cfg.addCustomCategoryComment(BIO_ID, "The settings of Biome ID.");
        cfg.setCategoryLanguageKey(BIO_ID, "config.kokkiemouse.netherwart.category.bioid");
        cfg.setCategoryRequiresMcRestart(BIO_ID, true);
    }

    /** コンフィグを同期する。 */
    public static void syncConfig() {
        // 各項目の設定値を反映させる。
        BIOME_IDKUN=(int)cfg.getInt("netherwart_bio_id",BIO_ID,BIOME_IDKUN,40,810,"Nether Wart Biome ID ","config.kokkiemouse.netherwart.BioID");

        // 設定内容をコンフィグファイルに保存する。
        cfg.save();
    }
}
