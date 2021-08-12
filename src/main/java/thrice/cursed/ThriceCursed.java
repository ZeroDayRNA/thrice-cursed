package thrice.cursed;

import com.terraformersmc.terraform.wood.block.TerraformDoorBlock;
import com.terraformersmc.terraform.wood.block.TerraformStairsBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.AbstractBlock.Settings;
import thrice.cursed.entity.StomperEntity;


public class ThriceCursed implements ModInitializer {
    public static PillarBlock createLog(){
        return new PillarBlock(FabricBlockSettings.of(Material.WOOD, (state)->{
            return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.BROWN : MapColor.GREEN;
        }).strength(2.0f).sounds(BlockSoundGroup.WOOD));
    }
    public static final EntityType<StomperEntity> STOMPER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("tcursed","stomper"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StomperEntity::new).dimensions(EntityDimensions.fixed(0.75f,0.75f)).build()
    );
    public static final EntityModelLayer MODEL_STOMPER_LAYER = new EntityModelLayer(new Identifier("tcursed","stomper"), "Stomper");


    public static final Item TEST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Block COLDISH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TEST_BLOCK_2 = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    public static final Block CURSED_WOOD = createLog();
    public static final Block CURSED_PLANK = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block CURSED_STAIR = new TerraformStairsBlock(CURSED_PLANK, Settings.copy(Blocks.OAK_STAIRS));
    public static final Block CURSED_HALF = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
    public static final Block CURSED_DOOR = new TerraformDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f));



    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tcursed", "colidsh_item"), TEST_ITEM);

        Registry.register(Registry.BLOCK, new Identifier("tcursed", "coldish_block"), COLDISH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("tcursed", "coldish_block"), new BlockItem(COLDISH_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","test_block"), TEST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("tcursed","test_block"), new BlockItem(TEST_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","test_block_2"), TEST_BLOCK_2);
        Registry.register(Registry.ITEM, new Identifier("tcursed","test_block_2"), new BlockItem(TEST_BLOCK_2, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","cursed_wood" ), CURSED_WOOD);
        Registry.register(Registry.ITEM, new Identifier("tcursed","cursed_wood"), new BlockItem(CURSED_WOOD, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","cursed_plank" ), CURSED_PLANK);
        Registry.register(Registry.ITEM, new Identifier("tcursed","cursed_plank"), new BlockItem(CURSED_PLANK, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","cursed_stair" ), CURSED_STAIR);
        Registry.register(Registry.ITEM, new Identifier("tcursed","cursed_stair"), new BlockItem(CURSED_STAIR, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));

        FabricDefaultAttributeRegistry.register(STOMPER, StomperEntity.createMobAttributes());

        Registry.register(Registry.BLOCK, new Identifier("tcursed","cursed_half" ), CURSED_HALF);
        Registry.register(Registry.ITEM, new Identifier("tcursed","cursed_half"), new BlockItem(CURSED_HALF, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("tcursed","cursed_door" ), CURSED_DOOR);
        Registry.register(Registry.ITEM, new Identifier("tcursed","cursed_door"), new BlockItem(CURSED_DOOR, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.REDSTONE)));


        System.out.println("Hello Fabric world!");
    }
}
