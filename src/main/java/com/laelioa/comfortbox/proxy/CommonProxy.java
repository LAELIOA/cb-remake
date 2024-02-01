package com.laelioa.comfortbox.proxy;

import com.laelioa.comfortbox.init.RegistryHandler;

public abstract class CommonProxy {
    public void preInit() {
        RegistryHandler.Blocks.registerBlocks();
        RegistryHandler.Items.registerItems();
    }

    public void init() {}

    public void postInit() {}
}
