package com.trojancoders.materialexpansion.util;

import com.trojancoders.materialexpansion.MaterialExpansion;
import com.trojancoders.materialexpansion.items.*;
import com.trojancoders.materialexpansion.blocks.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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

    public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = ITEMS.register("aluminum_block_item", ()-> new MaterialExpansionBlockItem(ALUMINUM_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block_item", ()-> new MaterialExpansionBlockItem(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> LITHIUM_BLOCK_ITEM = ITEMS.register("lithum_block_item", ()-> new MaterialExpansionBlockItem(LITHIUM_BLOCK.get()));
    public static final RegistryObject<Item> NICKEL_BLOCK_ITEM = ITEMS.register("nickel_block_item", ()-> new MaterialExpansionBlockItem(NICKEL_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block_item", ()-> new MaterialExpansionBlockItem(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block_item", ()-> new MaterialExpansionBlockItem(TITANIUM_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_ALLOY_BLOCK_ITEM = ITEMS.register("titanium_alloy_block_item", ()-> new MaterialExpansionBlockItem(TITANIUM_ALLOY_BLOCK.get()));
    public static final RegistryObject<Item> ALUMINUM_ORE_BLOCK_ITEM = ITEMS.register("aluminum_block_item", ()-> new MaterialExpansionBlockItem(ALUMINUM_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_ORE_BLOCK_ITEM = ITEMS.register("copper_block_item", ()-> new MaterialExpansionBlockItem(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> LITHIUM_ORE_BLOCK_ITEM = ITEMS.register("lithum_block_item", ()-> new MaterialExpansionBlockItem(LITHIUM_BLOCK.get()));
    public static final RegistryObject<Item> NICKEL_ORE_BLOCK_ITEM = ITEMS.register("nickel_block_item", ()-> new MaterialExpansionBlockItem(NICKEL_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK_ITEM = ITEMS.register("titanium_block_item", ()-> new MaterialExpansionBlockItem(TITANIUM_BLOCK.get()));

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


    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () ->  new SwordItem(MaterialExpansionItemTier.COPPER, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.COPPER, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.COPPER, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(MaterialExpansionItemTier.COPPER, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register("nickel_sword", () ->  new SwordItem(MaterialExpansionItemTier.NICKEL, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register("nickel_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.NICKEL, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.NICKEL, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register("nickel_axe", () -> new AxeItem(MaterialExpansionItemTier.NICKEL, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () ->  new SwordItem(MaterialExpansionItemTier.STEEL, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.STEEL, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.STEEL, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(MaterialExpansionItemTier.STEEL, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () ->  new SwordItem(MaterialExpansionItemTier.TITANIUM, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.TITANIUM, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.TITANIUM, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(MaterialExpansionItemTier.TITANIUM, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", () ->  new SwordItem(MaterialExpansionItemTier.ALUMINUM, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.ALUMINUM, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.ALUMINUM, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", () -> new AxeItem(MaterialExpansionItemTier.ALUMINUM, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_SWORD = ITEMS.register("titanium_alloy_sword", () ->  new SwordItem(MaterialExpansionItemTier.TITANIUM_ALLOY, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_SHOVEL = ITEMS.register("titanium_alloy_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.TITANIUM_ALLOY, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_PICKAXE = ITEMS.register("titanium_alloy_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.TITANIUM_ALLOY, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_AXE = ITEMS.register("titanium_alloy_axe", () -> new AxeItem(MaterialExpansionItemTier.TITANIUM_ALLOY, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->  new SwordItem(MaterialExpansionItemTier.EMERALD, 3, -2.4F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->  new ShovelItem(MaterialExpansionItemTier.EMERALD, 1.5F, -3.0F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->  new PickaxeItem(MaterialExpansionItemTier.EMERALD, 1, -2.8F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(MaterialExpansionItemTier.EMERALD, 6.0F, -3.1F, (new Item.Properties()).tab(MaterialExpansion.MaterialExpansionToolGroup)));

    public static final RegistryObject<Item> BATTERY = ITEMS.register("battery", MaterialExpansionMaterialItem::new);
    public static final RegistryObject<Item> LIGHT_BULB = ITEMS.register("light_bulb", MaterialExpansionMaterialItem::new);
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire", MaterialExpansionMaterialItem::new);
    public static final RegistryObject<Item> FUEL_CANISTER = ITEMS.register("fuel_canister", MaterialExpansionMaterialItem::new);
    public static final RegistryObject<Item> THRUSTERS = ITEMS.register("thrusters", MaterialExpansionMaterialItem::new);
    public static final RegistryObject<Item> JETPACK = ITEMS.register("jetpack", MaterialExpansionMaterialItem::new);
    public static final RegistryObject<Item> SPRINGS = ITEMS.register("springs", MaterialExpansionMaterialItem::new);


    public static void initRegistries(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
