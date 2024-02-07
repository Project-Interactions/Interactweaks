package git.mczph.interactweaks;

import git.mczph.interactweaks.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(
        modid = git.mczph.interactweaks.Interactweaks.MODID,
        name = git.mczph.interactweaks.Interactweaks.NAME,
        version = git.mczph.interactweaks.Interactweaks.VERSION,
        dependencies = git.mczph.interactweaks.Interactweaks.dependencies
)

public class Interactweaks {
    public static final String MODID = "interactweaks";
    public static final String NAME = "Interactweaks";
    public static final String VERSION = "1.0.0";
    public static final String dependencies = "required-after:lightningcraft";

    public static final String COMMON_PROXY = "git.mczph.interactweaks.common.CommonProxy";
    public static final String CLIENT_PROXY = "git.mczph.interactweaks.client.ClientProxy";
    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy proxy = null;
    @Mod.EventHandler
    public void construction(FMLConstructionEvent event) {
        proxy.construction();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        proxy.loadComplete();
    }
}