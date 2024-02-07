package git.mczph.interactweaks.mixin.jeitf;

import lykrast.jetif.compat.CompatFluxNetworks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CompatFluxNetworks.class, remap = false)
public abstract class DisableFluxNetworks {
    @Inject(method = "addRecipes", at = @At("HEAD"), cancellable = true)
    private void noFluxNetworks(CallbackInfo ci) {
        ci.cancel();
    }
}
