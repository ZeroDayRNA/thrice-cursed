package thrice.cursed;

import com.terraformersmc.terraform.wood.block.TerraformButtonBlock;
import com.terraformersmc.terraform.wood.block.TerraformDoorBlock;
import com.terraformersmc.terraform.wood.block.TerraformPressurePlateBlock;
import com.terraformersmc.terraform.wood.block.TerraformStairsBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.*;
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
    public static final String MOD_ID = "tcursed";

    public static PillarBlock createLog(){
        return new PillarBlock(FabricBlockSettings.of(Material.WOOD, (state)->{
            return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.BROWN : MapColor.GREEN;
        }).strength(2.3f).sounds(BlockSoundGroup.WOOD));
    }
    public static final EntityType<StomperEntity> STOMPER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID,"stomper"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StomperEntity::new).dimensions(EntityDimensions.fixed(0.75f,0.75f)).build()
    );

    public static final Item TEST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Block COLDISH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TEST_BLOCK_2 = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    public static final Block CURSED_WOOD = createLog();
    public static final Block CURSED_PLANK = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.3f));
    public static final Block CURSED_STAIR = new TerraformStairsBlock(CURSED_PLANK, Settings.copy(Blocks.OAK_STAIRS));
    public static final Block CURSED_HALF = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(2.3f));
    public static final Block CURSED_DOOR = new TerraformDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(2.3f));
    public static final Block CURSED_BUTTON = new TerraformButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(2.3f));
    public static final Block CURSED_PRESSURE_PLATE = new TerraformPressurePlateBlock(FabricBlockSettings.of(Material.WOOD).strength(2.3f));
    public static final Block CURSED_FENCE = new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(2.3f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "colidsh_item"), TEST_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "coldish_block"), COLDISH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "coldish_block"), new BlockItem(COLDISH_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"test_block"), TEST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"test_block"), new BlockItem(TEST_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"test_block_2"), TEST_BLOCK_2);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"test_block_2"), new BlockItem(TEST_BLOCK_2, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_wood" ), CURSED_WOOD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_wood"), new BlockItem(CURSED_WOOD, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_WOOD, 5,5);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_plank" ), CURSED_PLANK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_plank"), new BlockItem(CURSED_PLANK, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_PLANK, 5,20);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_stair" ), CURSED_STAIR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_stair"), new BlockItem(CURSED_STAIR, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_STAIR, 5,20);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_half" ), CURSED_HALF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_half"), new BlockItem(CURSED_HALF, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.BUILDING_BLOCKS)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_HALF, 5,20);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_door" ), CURSED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_door"), new BlockItem(CURSED_DOOR, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.REDSTONE)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_DOOR, 5,20);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_button" ), CURSED_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_button"), new BlockItem(CURSED_BUTTON, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.REDSTONE)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_BUTTON, 5,20);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_pressure_plate" ), CURSED_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_pressure_plate"), new BlockItem(CURSED_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.REDSTONE)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_PRESSURE_PLATE, 5,20);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cursed_fence" ), CURSED_FENCE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cursed_fence"), new BlockItem(CURSED_FENCE, new FabricItemSettings().group(ItemGroup.MISC).group(ItemGroup.DECORATIONS)));
        FlammableBlockRegistry.getDefaultInstance().add(CURSED_PRESSURE_PLATE, 5,20);


        FabricDefaultAttributeRegistry.register(STOMPER, StomperEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(STOMPER, StomperEntity.createMobAttributes());


        System.out.println("Hello Fabric world!");
    }
}
