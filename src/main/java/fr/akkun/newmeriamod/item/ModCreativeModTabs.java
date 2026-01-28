package fr.akkun.newmeriamod.item;

import fr.akkun.newmeriamod.NewmeriaMod;
import fr.akkun.newmeriamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewmeriaMod.MOD_ID);

    public static final Supplier<CreativeModeTab> NEWMERIA_TAB = CREATIVE_MODE_TAB.register("newmeria_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.PEER.get()))
                    .title(Component.translatable("creativetab.newmeriamod.newmeria_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PEER);
                        output.accept(ModItems.OBSIDIAN_STICK);
                        output.accept(ModItems.SPATULA);

                        output.accept(ModItems.ENDERITE_SCRAP);
                        output.accept(ModBlocks.ENDER_ANCIENT_DEBRIS);
                        output.accept(ModItems.ENDERITE_INGOT);
                        output.accept(ModItems.ENDERITE_SWORD);
                        output.accept(ModItems.ENDERITE_PICKAXE);
                        output.accept(ModItems.ENDERITE_SHOVEL);
                        output.accept(ModItems.ENDERITE_AXE);
                        output.accept(ModItems.ENDERITE_HOE);
                        output.accept(ModItems.ENDERITE_HELMET);
                        output.accept(ModItems.ENDERITE_CHESTPLATE);
                        output.accept(ModItems.ENDERITE_LEGGINGS);
                        output.accept(ModItems.ENDERITE_BOOTS);
                        output.accept(ModBlocks.ENDERITE_BLOCK);

                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.STONE_HAMMER);
                        output.accept(ModItems.IRON_HAMMER);
                        output.accept(ModItems.GOLDEN_HAMMER);
                        output.accept(ModItems.DIAMOND_HAMMER);
                        output.accept(ModItems.NETHERITE_HAMMER);
                        output.accept(ModItems.ENDERITE_HAMMER);

                        output.accept(ModBlocks.MARBLE);
                        output.accept(ModBlocks.COBBLED_MARBLE);
                        output.accept(ModBlocks.MARBLE_BRICKS);
                        output.accept(ModBlocks.CHISELED_MARBLE_BRICKS);
                        output.accept(ModBlocks.MOSSY_COBBLED_MARBLE);
                        output.accept(ModBlocks.MOSSY_MARBLE_BRICKS);
                        output.accept(ModBlocks.CRACKED_MARBLE_BRICKS);
                        output.accept(ModBlocks.MARBLE_STAIRS);
                        output.accept(ModBlocks.MARBLE_SLAB);
                        output.accept(ModBlocks.MARBLE_PRESSURE_PLATE);
                        output.accept(ModBlocks.MARBLE_BUTTON);
                        output.accept(ModBlocks.MARBLE_WALL);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
