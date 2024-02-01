package com.laelioa.comfortbox.proxy;

import com.laelioa.comfortbox.init.RegistryHandler;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
        RegistryHandler.Blocks.getBlocks().forEach(RegistryHandler.Models::registerModels);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
