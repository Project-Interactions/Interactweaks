package git.mczph.interactweaks;

import git.mczph.interactweaks.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(
        modid = git.mczph.interactweaks.Interactweaks.MODID,
        name = git.mczph.interactweaks.Interactweaks.NAME,
        version = git.mczph.interactweaks.Interactweaks.VERSION,
        acceptedMinecraftVersions = "[1.12.2]",
        dependencies = git.mczph.interactweaks.Interactweaks.DEPENDENCIES
)

public class Interactweaks {
    public static final String MODID = Tags.MOD_ID;
    public static final String NAME = Tags.MOD_NAME;
    public static final String VERSION = Tags.VERSION;
    public static final String DEPENDENCIES = "required-after:mixinbooter@[8.0,);required-after:lightningcraft";

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