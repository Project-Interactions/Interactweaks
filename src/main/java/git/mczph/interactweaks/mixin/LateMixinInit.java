package git.mczph.interactweaks.mixin;

import com.google.common.collect.Lists;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.List;

@SuppressWarnings("unused")
public class LateMixinInit implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Lists.newArrayList(
                "mixins.interactweaks.nco.json",
                "mixins.interactweaks.dummy.json",
                "mixins.interactweaks.bloodmagic.json",
                "mixins.interactweaks.jeitf.json",
                "mixins.interactweaks.exu2.json",
                "mixins.interactweaks.buildinggadgets.json",
                "mixins.interactweaks.conarm.json",
                "mixins.interactweaks.tconstruct.json",
                "mixins.interactweaks.qmd.json"
        );
    }
}