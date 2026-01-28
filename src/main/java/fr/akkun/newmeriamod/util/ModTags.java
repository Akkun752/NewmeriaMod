package fr.akkun.newmeriamod.util;

import fr.akkun.newmeriamod.NewmeriaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_ENDERITE_TOOL = createTag("needs_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTag("incorrect_for_enderite_tool");

        public static final TagKey<Block> NEEDS_PALADIUM_TOOL = createTag("needs_paladium_tool");
        public static final TagKey<Block> INCORRECT_FOR_PALADIUM_TOOL = createTag("incorrect_for_paladium_tool");

        public static final TagKey<Block> NEEDS_SPATULA = createTag("needs_spatula");
        public static final TagKey<Block> INCORRECT_FOR_SPATULA = createTag("incorrect_for_spatula");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(NewmeriaMod.MOD_ID, name));
        }

    }

    public static class Items {

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(NewmeriaMod.MOD_ID, name));
        }

    }
}
