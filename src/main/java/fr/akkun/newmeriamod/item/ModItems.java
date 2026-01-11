package fr.akkun.newmeriamod.item;

import fr.akkun.newmeriamod.NewmeriaMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NewmeriaMod.MOD_ID);

    public static final DeferredItem<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPATULA = ITEMS.register("spatula",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEWMERITE = ITEMS.register("newmerite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEER = ITEMS.register("peer",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEER)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
