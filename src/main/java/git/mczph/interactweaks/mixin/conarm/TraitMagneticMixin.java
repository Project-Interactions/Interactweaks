/*
Code from Sledgehammer by LX_Gaming under APL2.0
 */

package git.mczph.interactweaks.mixin.conarm;

import c4.conarm.common.armor.traits.TraitMagnetic;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.vecmath.Vector3d;
import java.util.List;

@Mixin(value = TraitMagnetic.class, remap = false)
public abstract class TraitMagneticMixin {
    
    /**
     * @author LX_Gaming
     * @reason https://github.com/SlimeKnights/TinkersConstruct/issues/3857
     */
    @SuppressWarnings("DuplicatedCode")
    @Overwrite
    public void onAbilityTick(int level, World world, EntityPlayer player) {
        double x = player.posX;
        double y = player.posY;
        double z = player.posZ;
        double range = 1.8D + (level - 1) * 0.3F;
        float strength = 0.07F;
        
        List<EntityItem> items = player.getEntityWorld().getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(x - range, y - range, z - range, x + range, y + range, z + range));
        int pulled = 0;
        for (EntityItem item : items) {
            if (!item.isEntityAlive() || item.cannotPickup() || item.getItem().isEmpty()) {
                continue;
            }
            
            Vector3d vec = new Vector3d(x, y, z);
            vec.sub(new Vector3d(item.posX, item.posY, item.posZ));
            
            if (vec.lengthSquared() <= 0.05) {
                continue;
            }
            
            vec.normalize();
            vec.scale(strength);
            
            item.motionX += vec.x;
            item.motionY += vec.y;
            item.motionZ += vec.z;
            
            if (++pulled >= 200) {
                break;
            }
        }
    }
}