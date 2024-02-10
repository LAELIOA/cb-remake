package com.laelioa.comfortbox.init;

import com.laelioa.comfortbox.blocks.Asphalt;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ComfortBoxBlocks {
    public static final Block ASPHALT;

    static {
        ASPHALT = new Asphalt();
    }

    public static void register() {
        registerBlock(ASPHALT);
    }

    private static void registerBlock(Block block) {
        Item itemBlock = new ItemBlock(block);
        if (block.getRegistryName() != null) {
            itemBlock.setRegistryName(block.getRegistryName());
        }
        RegistryHandler.Blocks.add(block);
        RegistryHandler.Items.add(itemBlock);
    }
}
