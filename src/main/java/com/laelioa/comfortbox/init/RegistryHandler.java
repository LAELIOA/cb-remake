package com.laelioa.comfortbox.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;

public class RegistryHandler {
    public static class Blocks {
        private static final ArrayList<Block> BLOCKS = new ArrayList<>();

        public static void add(Block block) {
            BLOCKS.add(block);
        }

        public static ArrayList<Block> getBlocks() {
            return BLOCKS;
        }

        public static void registerBlocks() {
            ComfortBoxBlocks.register();
            ForgeRegistries.BLOCKS.registerAll(getBlocks().toArray(new Block[0]));
        }
    }

    public static class Items {
        private static final ArrayList<Item> ITEMS = new ArrayList<>();

        public static void add(Item item) {
            ITEMS.add(item);
        }

        public static ArrayList<Item> getItems() {
            return ITEMS;
        }

        public static void registerItems() {
            ForgeRegistries.ITEMS.registerAll(getItems().toArray(new Item[0]));
        }
    }

    public static class Models {
        public static void registerModel(Block block) {
            Item item = Item.getItemFromBlock(block);
            ModelResourceLocation resourceLocation;
            if (block.getRegistryName() != null) {
                resourceLocation = new ModelResourceLocation(block.getRegistryName(), "inventory");
                ModelLoader.setCustomModelResourceLocation(item, 0, resourceLocation);
            }
        }
    }
}
