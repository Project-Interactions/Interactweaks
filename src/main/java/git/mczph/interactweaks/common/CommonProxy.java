package git.mczph.interactweaks.common;

import git.mczph.interactweaks.common.lightningcraft.RemoveDefaultRecipes;
public class CommonProxy {
    public void construction() {
    }

    public void preInit() {
        RemoveDefaultRecipes.removeLightningCraftDefaultRecipes();
    }

    public void init() {
    }

    public void postInit() {
    }

    public void loadComplete() {
    }
}
