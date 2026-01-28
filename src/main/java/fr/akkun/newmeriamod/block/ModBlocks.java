package fr.akkun.newmeriamod.block;

import fr.akkun.newmeriamod.NewmeriaMod;
import fr.akkun.newmeriamod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NewmeriaMod.MOD_ID);

    public static final DeferredBlock<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COBBLED_MARBLE = registerBlock("cobbled_marble",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CHISELED_MARBLE_BRICKS = registerBlock("chiseled_marble_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOSSY_COBBLED_MARBLE = registerBlock("mossy_cobbled_marble",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOSSY_MARBLE_BRICKS = registerBlock("mossy_marble_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CRACKED_MARBLE_BRICKS = registerBlock("cracked_marble_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ENDERITE_BLOCK = registerBlock("enderite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(65.0F, 1500.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ENDER_ANCIENT_DEBRIS = registerBlock("ender_ancient_debris",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(35.0F, 1400.0F).requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)));

    public static final DeferredBlock<Block> PALADIUM_ORE = registerBlock("paladium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.0f, 6.0f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> PALADIUM_BLOCK = registerBlock("paladium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.5f, 7.0f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
