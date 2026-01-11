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
                        output.accept(ModItems.NEWMERITE);
                        output.accept(ModItems.OBSIDIAN_STICK);
                        output.accept(ModItems.SPATULA);
                        output.accept(ModBlocks.NEWMERITE_BLOCK);
                        output.accept(ModBlocks.NEWMERITE_ORE);
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
