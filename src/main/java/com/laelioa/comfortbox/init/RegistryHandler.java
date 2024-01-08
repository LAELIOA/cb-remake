package com.laelioa.comfortbox.init;

import com.laelioa.comfortbox.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

public class RegistryHandler {
    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Blocks {
        private static final ArrayList<Block> BLOCKS = new ArrayList<>();

        public static void add(Block block) {
            BLOCKS.add(block);
        }

        public static ArrayList<Block> getBlocks() {
            return BLOCKS;
        }

        @SubscribeEvent
        public static void onBlockRegister(RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
        }
    }

    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Items {
        private static final ArrayList<Item> ITEMS = new ArrayList<>();

        public static void add(Item item) {
            ITEMS.add(item);
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
        }
    }

    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Models {
        @SubscribeEvent
        public static void onModelRegister(ModelRegistryEvent event) {
            Blocks.getBlocks().forEach(Models::registerModel);
        }

        public static void registerModel(Block block) {
            Item item = Item.getItemFromBlock(block);
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getUnlocalizedName(), "inventory"));
        }
    }
}
