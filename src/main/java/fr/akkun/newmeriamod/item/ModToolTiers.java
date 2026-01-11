package fr.akkun.newmeriamod.item;

import fr.akkun.newmeriamod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier NEWMERITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_NEWMERITE_TOOL,
            2031, 8.0F, 3.0F, 15, () -> Ingredient.of(ModItems.NEWMERITE));
    public static final Tier SPATULA = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SPATULA,
            512, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.IRON_INGOT));
}
