package fr.akkun.newmeriamod;

import fr.akkun.newmeriamod.block.ModBlocks;
import fr.akkun.newmeriamod.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.Minecraft;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(NewmeriaMod.MOD_ID)
public class NewmeriaMod {
    public static final String MOD_ID = "newmeriamod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public NewmeriaMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.OBSIDIAN_STICK);
        }

        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.MARBLE);
            event.accept(ModBlocks.MARBLE_BRICKS);
            event.accept(ModBlocks.COBBLED_MARBLE);
            event.accept(ModBlocks.CHISELED_MARBLE_BRICKS);
            event.accept(ModBlocks.MOSSY_COBBLED_MARBLE);
            event.accept(ModBlocks.MOSSY_MARBLE_BRICKS);
            event.accept(ModBlocks.CRACKED_MARBLE_BRICKS);
        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.SPATULA);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = NewmeriaMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
