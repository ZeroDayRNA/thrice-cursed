package thrice.cursed;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ThriceCursed implements ModInitializer {

    public static final Item TEST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Block COLDISH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TEST_BLOCK_2 = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    public static final Block cursed_wood = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));



    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tcursed", "colidsh_item"), TEST_ITEM);

        Registry.register(Registry.BLOCK, new Identifier("tcursed", "coldish_block"), COLDISH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("tcursed", "coldish_block"), new BlockItem(COLDISH_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","test_block"), TEST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("tcursed","test_block"), new BlockItem(TEST_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","test_block_2"), TEST_BLOCK_2);
        Registry.register(Registry.ITEM, new Identifier("tcursed","test_block_2"), new BlockItem(TEST_BLOCK_2, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","cursed_wood" ), cursed_wood);
        Registry.register(Registry.ITEM, new Identifier("tcursed","cursed_wood"), new BlockItem(cursed_wood, new FabricItemSettings().group(ItemGroup.MISC)));

        System.out.println("Hello Fabric world!");
    }
}