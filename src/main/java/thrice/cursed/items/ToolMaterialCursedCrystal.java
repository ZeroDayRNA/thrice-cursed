package thrice.cursed.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import thrice.cursed.ThriceCursed;

public class ToolMaterialCursedCrystal implements ToolMaterial{
    public static final ToolMaterialCursedCrystal INSTANCE = new ToolMaterialCursedCrystal();
    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4000;
    }

    @Override
    public float getAttackDamage() {
        return 100.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.TOTEM_OF_UNDYING);
    }
}
