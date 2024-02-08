package git.mczph.interactweaks.mixin.qmd;

import lach_01298.qmd.recipe.QMDRecipeHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;


@Mixin(value=QMDRecipeHelper.class, remap = false)
public abstract class DisableMekCompat {

    @ModifyReturnValue(method = "needsExpanding", at = @At("RETURN"))
    private static boolean noMekCompat(boolean original) {
        return false;
    }
}
