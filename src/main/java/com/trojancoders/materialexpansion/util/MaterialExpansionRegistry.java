package com.trojancoders.materialexpansion.util;

import com.trojancoders.materialexpansion.MaterialExpansion;
import com.trojancoders.materialexpansion.items.*;
import com.trojancoders.materialexpansion.blocks.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
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
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> CARBON_DUST = ITEMS.register("carbon_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> LITHIUM_DUST = ITEMS.register("lithium_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_alloy_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", MaterialExpansionDustItem::new);
    public static final RegistryObject<Item> TITANIUM_ALLOY_DUST = ITEMS.register("titanium_alloy_dust", MaterialExpansionDustItem::new);

    //Ingots
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", MaterialExpansionIngotItem::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", MaterialExpansionIngotItem::new);
    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot", MaterialExpansionIngotItem::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", MaterialExpansionIngotItem::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", MaterialExpansionIngotItem::new);
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", MaterialExpansionIngotItem::new);
    public static final RegistryObject<Item> TITANIUM_ALLOY_INGOT = ITEMS.register("titanium_alloy_ingot", MaterialExpansionIngotItem::new);




    //Blocks
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = BLOCKS.register("lithium_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> NICKEL_BLOCK= BLOCKS.register("nickel_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> TITANIUM_ALLOY_BLOCK = BLOCKS.register("titanium_alloy_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.METAL)));

    public static final RegistryObject<Block> ALUMINUM_ORE_BLOCK = BLOCKS.register("aluminum_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> LITHIUM_ORE_BLOCK = BLOCKS.register("lithium_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> NICKEL_ORE_BLOCK= BLOCKS.register("nickel_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore_block", ()-> new MaterialExpansionBlock(AbstractBlock.Properties.of(Material.STONE)));


    //Armor
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.COPPER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.COPPER, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.COPPER, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.COPPER, EquipmentSlotType.FEET));
    public static final RegistryObject<Item> NICKEL_HELMET = ITEMS.register("nickel_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.NICKEL, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> NICKEL_CHESTPLATE = ITEMS.register("nickel_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.NICKEL, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> NICKEL_LEGGINGS = ITEMS.register("nickel_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.NICKEL, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> NICKEL_BOOTS = ITEMS.register("nickel_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.NICKEL, EquipmentSlotType.FEET));
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.STEEL, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.STEEL, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.STEEL, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.STEEL, EquipmentSlotType.FEET));
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM, EquipmentSlotType.FEET));
    public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.ALUMINUM, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.ALUMINUM, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.ALUMINUM, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.ALUMINUM, EquipmentSlotType.FEET));
    public static final RegistryObject<Item> TITANIUM_ALLOY_HELMET = ITEMS.register("titanium_alloy_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM_ALLOY, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> TITANIUM_ALLOY_CHESTPLATE = ITEMS.register("titanium_alloy_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM_ALLOY, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> TITANIUM_ALLOY_LEGGINGS = ITEMS.register("titanium_alloy_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM_ALLOY, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> TITANIUM_ALLOY_BOOTS = ITEMS.register("titanium_alloy_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.TITANIUM_ALLOY, EquipmentSlotType.FEET));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.EMERALD, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.EMERALD, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.EMERALD, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", ()-> new MaterialExpansionArmorItem(MaterialExpansionArmorMaterial.EMERALD, EquipmentSlotType.FEET));

    public static void initRegistries(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
