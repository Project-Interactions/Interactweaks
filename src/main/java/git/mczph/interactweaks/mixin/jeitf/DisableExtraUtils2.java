package git.mczph.interactweaks.mixin.jeitf;

import lykrast.jetif.compat.CompatExtraUtils2;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CompatExtraUtils2.class, remap = false)
public abstract class DisableExtraUtils2 {
    @Inject(method = "addRecipes", at = @At("HEAD"), cancellable = true)
    private void noExtraUtils2(CallbackInfo ci) {
        ci.cancel();
    }
}
