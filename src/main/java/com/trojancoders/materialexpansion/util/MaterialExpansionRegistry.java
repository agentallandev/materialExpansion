package com.trojancoders.materialexpansion.util;

import com.trojancoders.materialexpansion.MaterialExpansion;
import com.trojancoders.materialexpansion.items.*;
import com.trojancoders.materialexpansion.blocks.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MaterialExpansionRegistry {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MaterialExpansion.MODID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MaterialExpansion.MODID);

    //Items

    //Dusts
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> CARBON_DUST = ITEMS.register("carbon_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> LITHIUM_DUST = ITEMS.register("lithium_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", ()-> new MaterialExpansionDustItem());
    public static final RegistryObject<Item> TITANIUM_ALLOY_DUST = ITEMS.register("titanium_alloy_dust", ()-> new MaterialExpansionDustItem());

    //Ingots
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ()-> new MaterialExpansionIngotItem());
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()-> new MaterialExpansionIngotItem());
    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot", ()-> new MaterialExpansionIngotItem());
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ()-> new MaterialExpansionIngotItem());
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ()-> new MaterialExpansionIngotItem());
    public static final RegistryObject<Item> TITANIUM_ALLOY_INGOT = ITEMS.register("titanium_alloy_ingot", ()-> new MaterialExpansionIngotItem());




    //Blocks
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = BLOCKS.register("lithium_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> NICKEL_BLOCK= BLOCKS.register("nickel_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> TITANIUM_ALLOY_BLOCK = BLOCKS.register("titanium_alloy_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));

    public static final RegistryObject<Block> ALUMINUM_ORE_BLOCK = BLOCKS.register("aluminum_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> LITHIUM_ORE_BLOCK = BLOCKS.register("lithium_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> NICKEL_ORE_BLOCK= BLOCKS.register("nickel_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));


    public static void initRegistries(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
