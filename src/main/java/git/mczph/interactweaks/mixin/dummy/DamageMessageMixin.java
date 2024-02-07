/*
Code from RLMixins by fonnymunkey
https://github.com/fonnymunkey/RLMixins/blob/main/src/main/java/rlmixins/mixin/dummy/RenderFloatingNumberMixin.java
 */
package git.mczph.interactweaks.mixin.dummy;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(targets = "boni.dummy.network.DamageMessage$MessageHandlerClient$1")
public abstract class DamageMessageMixin {

    @ModifyConstant(
            method = "run",
            constant = @Constant(floatValue = 2.0F),
            remap = false
    )
    private static float dummyDamageMessage_constant(float constant) {
        return 1.0F;
    }
}