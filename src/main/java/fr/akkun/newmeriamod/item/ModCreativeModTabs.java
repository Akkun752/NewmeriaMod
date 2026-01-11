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
                    .icon(() -> new ItemStack(ModItems.NEWMERITE.get()))
                    .title(Component.translatable("creativetab.newmeriamod.newmeria_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PEER);
                        output.accept(ModItems.OBSIDIAN_STICK);
                        output.accept(ModItems.SPATULA);

                        output.accept(ModItems.NEWMERITE);
                        output.accept(ModItems.NEWMERITE_SWORD);
                        output.accept(ModItems.NEWMERITE_PICKAXE);
                        output.accept(ModItems.NEWMERITE_SHOVEL);
                        output.accept(ModItems.NEWMERITE_AXE);
                        output.accept(ModItems.NEWMERITE_HOE);
                        output.accept(ModItems.NEWMERITE_HELMET);
                        output.accept(ModItems.NEWMERITE_CHESTPLATE);
                        output.accept(ModItems.NEWMERITE_LEGGINGS);
                        output.accept(ModItems.NEWMERITE_BOOTS);
                        output.accept(ModBlocks.NEWMERITE_BLOCK);
                        output.accept(ModBlocks.NEWMERITE_ORE);

                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.STONE_HAMMER);
                        output.accept(ModItems.IRON_HAMMER);
                        output.accept(ModItems.GOLDEN_HAMMER);
                        output.accept(ModItems.DIAMOND_HAMMER);
                        output.accept(ModItems.NETHERITE_HAMMER);
                        output.accept(ModItems.NEWMERITE_HAMMER);

                        output.accept(ModBlocks.MARBLE);
                        output.accept(ModBlocks.COBBLED_MARBLE);
                        output.accept(ModBlocks.MARBLE_BRICKS);
                        output.accept(ModBlocks.CHISELED_MARBLE_BRICKS);
                        output.accept(ModBlocks.MOSSY_COBBLED_MARBLE);
                        output.accept(ModBlocks.MOSSY_MARBLE_BRICKS);
                        output.accept(ModBlocks.CRACKED_MARBLE_BRICKS);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
