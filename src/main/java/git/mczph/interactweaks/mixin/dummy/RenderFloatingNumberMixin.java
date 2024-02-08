/*
Code from RLMixins by "questionable" fonnymunkey under MIT
https://github.com/fonnymunkey/RLMixins/blob/main/src/main/java/rlmixins/mixin/dummy/RenderFloatingNumberMixin.java
 */
package git.mczph.interactweaks.mixin.dummy;

import boni.dummy.client.RenderFloatingNumber;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(RenderFloatingNumber.class)
public abstract class RenderFloatingNumberMixin {

    @ModifyConstant(
            method = "doRender(Lboni/dummy/EntityFloatingNumber;DDDFF)V",
            constant = @Constant(floatValue = 2.0F),
            remap = false
    )
    private float dummyDoRender_constant(float constant) {
        return 1.0F;
    }
}
