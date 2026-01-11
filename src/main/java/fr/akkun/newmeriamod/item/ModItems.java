package fr.akkun.newmeriamod.item;

import fr.akkun.newmeriamod.NewmeriaMod;
import fr.akkun.newmeriamod.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NewmeriaMod.MOD_ID);

    public static final DeferredItem<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEWMERITE = ITEMS.register("newmerite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEER = ITEMS.register("peer",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEER)));


    public static final DeferredItem<Item> SPATULA = ITEMS.register("spatula",
            () -> new SwordItem(ModToolTiers.SPATULA, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SPATULA, 3, -2.4f))
            ));

    public static final DeferredItem<SwordItem> NEWMERITE_SWORD =
            ITEMS.register("newmerite_sword",
                    () -> new SwordItem(ModToolTiers.NEWMERITE, new Item.Properties()
                            .attributes(SwordItem.createAttributes(ModToolTiers.NEWMERITE, 3, -2.4f))
                    ));
    public static final DeferredItem<PickaxeItem> NEWMERITE_PICKAXE =
            ITEMS.register("newmerite_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.NEWMERITE, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(ModToolTiers.NEWMERITE, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<ShovelItem> NEWMERITE_SHOVEL =
            ITEMS.register("newmerite_shovel",
                    () -> new ShovelItem(ModToolTiers.NEWMERITE, new Item.Properties()
                            .attributes(ShovelItem.createAttributes(ModToolTiers.NEWMERITE, 1.5F, -3.0F))
                    ));
    public static final DeferredItem<AxeItem> NEWMERITE_AXE =
            ITEMS.register("newmerite_axe",
                    () -> new AxeItem(ModToolTiers.NEWMERITE, new Item.Properties()
                            .attributes(AxeItem.createAttributes(ModToolTiers.NEWMERITE, 5.0F, -3.0F))
                    ));
    public static final DeferredItem<HoeItem> NEWMERITE_HOE =
            ITEMS.register("newmerite_hoe",
                    () -> new HoeItem(ModToolTiers.NEWMERITE, new Item.Properties()
                            .attributes(HoeItem.createAttributes(ModToolTiers.NEWMERITE, -3.0F, 0.0F))
                    ));

    public static final DeferredItem<ArmorItem> NEWMERITE_HELMET = ITEMS.register("newmerite_helmet",
            () -> new ArmorItem(ModArmorMaterials.NEWMERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<ArmorItem> NEWMERITE_CHESTPLATE = ITEMS.register("newmerite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NEWMERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final DeferredItem<ArmorItem> NEWMERITE_LEGGINGS = ITEMS.register("newmerite_leggings",
            () -> new ArmorItem(ModArmorMaterials.NEWMERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final DeferredItem<ArmorItem> NEWMERITE_BOOTS = ITEMS.register("newmerite_boots",
            () -> new ArmorItem(ModArmorMaterials.NEWMERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(37))));


    public static final DeferredItem<HammerItem> WOODEN_HAMMER =
            ITEMS.register("wooden_hammer",
                    () -> new HammerItem(Tiers.WOOD, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(Tiers.WOOD, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<HammerItem> STONE_HAMMER =
            ITEMS.register("stone_hammer",
                    () -> new HammerItem(Tiers.STONE, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(Tiers.STONE, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<HammerItem> IRON_HAMMER =
            ITEMS.register("iron_hammer",
                    () -> new HammerItem(Tiers.IRON, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(Tiers.IRON, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<HammerItem> GOLDEN_HAMMER =
            ITEMS.register("golden_hammer",
                    () -> new HammerItem(Tiers.GOLD, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<HammerItem> DIAMOND_HAMMER =
            ITEMS.register("diamond_hammer",
                    () -> new HammerItem(Tiers.DIAMOND, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<HammerItem> NETHERITE_HAMMER =
            ITEMS.register("netherite_hammer",
                    () -> new HammerItem(Tiers.NETHERITE, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1.0F, -2.8F))
                    ));
    public static final DeferredItem<HammerItem> NEWMERITE_HAMMER =
            ITEMS.register("newmerite_hammer",
                    () -> new HammerItem(ModToolTiers.NEWMERITE, new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(ModToolTiers.NEWMERITE, 1.0F, -2.8F))
                    ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
