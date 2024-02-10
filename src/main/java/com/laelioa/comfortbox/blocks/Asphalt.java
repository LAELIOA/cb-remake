package com.laelioa.comfortbox.blocks;

import com.laelioa.comfortbox.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Asphalt extends Block {
    public Asphalt() {
        super(Material.ROCK);
        setRegistryName(Reference.MODID, "asphalt");
        setUnlocalizedName("asphalt_unlocalized");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
