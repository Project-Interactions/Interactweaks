package git.mczph.interactweaks.mixin.exu2;

import com.rwtema.extrautils2.items.DemonicIngotHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(value = DemonicIngotHandler.class, remap = false)
public abstract class UnregisterDemonicIngot {
    @Inject(method = "handleIngots", at = @At("HEAD"), cancellable = true)
    private void unregister(CallbackInfo ci) {
        ci.cancel();
    }
}

