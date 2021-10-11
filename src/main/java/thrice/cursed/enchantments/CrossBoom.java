package thrice.cursed.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class CrossBoom extends Enchantment {
    public CrossBoom() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.CROSSBOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }
    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMaxLevel() {return 10;}

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            target.world.createExplosion(target, target.getX(), target.getY(), target.getZ(), 5 + 10 * level,true, Explosion.DestructionType.DESTROY);
        }
        }
    }

