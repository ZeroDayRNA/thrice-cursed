package thrice.cursed.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class empowered_crystal extends Item {
    public empowered_crystal(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
