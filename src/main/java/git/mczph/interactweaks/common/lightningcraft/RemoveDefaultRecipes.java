package git.mczph.interactweaks.common.lightningcraft;

import sblectric.lightningcraft.recipes.LightningTransformRecipes;

public class RemoveDefaultRecipes {
    public static void removeLightningCraftDefaultRecipes() {
        LightningTransformRecipes.instance().getRecipeList().clear();
    }
}
