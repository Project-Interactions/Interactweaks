package git.mczph.interactweaks.mixin.buildinggadgets;

import com.direwolf20.buildinggadgets.common.items.gadgets.GadgetCopyPaste;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GadgetCopyPaste.class, remap = false)
public abstract class DisableCopyPasteUndo {
    @Inject(method = "undoBuild", at = @At("HEAD"), cancellable = true)
    private void disableUndo(CallbackInfo ci) {
        ci.cancel();
    }
}
