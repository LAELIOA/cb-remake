package com.laelioa.comfortbox.init;

import com.laelioa.comfortbox.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ComfortBoxBlocks {
    public static final Block TEST;

    static {
        TEST = new Block(Material.ROCK)
                .setRegistryName(Reference.MODID, "test")
                .setUnlocalizedName("test_unlocalised")
                .setCreativeTab(CreativeTabs.MISC);
        registerBlock(TEST);
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
