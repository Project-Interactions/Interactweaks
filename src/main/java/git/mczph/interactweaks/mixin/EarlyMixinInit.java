package git.mczph.interactweaks.mixin;

import com.google.common.collect.Lists;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import java.util.List;

@SuppressWarnings("unused")
public class EarlyMixinInit implements IEarlyMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Lists.newArrayList(
        );
    }
}