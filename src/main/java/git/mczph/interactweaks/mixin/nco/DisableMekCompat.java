package git.mczph.interactweaks.mixin.nco;

import nc.recipe.RecipeHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zone.rong.mixinextras.injector.ModifyReturnValue;


@Mixin(value=RecipeHelper.class, remap = false)
public abstract class DisableMekCompat {

    @ModifyReturnValue(method = "fluidNeedsExpanding", at = @At("RETURN"))
    private static boolean noMekCompat(boolean original) {
        return false;
    }
}
