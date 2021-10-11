package thrice.cursed.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.world.World;

public class CombustionEnchantments extends Enchantment {
    public CombustionEnchantments() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
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
            World world = user.world;
            for(int i=0; i < level; i++) {
                TntEntity tntEntity = EntityType.TNT.create(world);
                tntEntity.setFuse(10 + i);
                tntEntity.setPosition(target.getPos().x , target.getPos().y + 2 * i, target.getPos().z);

                world.spawnEntity(tntEntity);
            }
        }
    }
}