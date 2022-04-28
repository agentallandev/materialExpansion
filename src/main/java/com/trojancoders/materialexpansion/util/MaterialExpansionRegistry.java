package com.trojancoders.materialexpansion.util;

import com.trojancoders.materialexpansion.MaterialExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class MaterialExpansionRegistry {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MaterialExpansion.MODID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MaterialExpansion.MODID);




    public static void initRegistries(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
