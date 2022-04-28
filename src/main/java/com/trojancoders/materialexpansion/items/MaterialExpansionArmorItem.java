package com.trojancoders.materialexpansion.items;

import com.trojancoders.materialexpansion.MaterialExpansion;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class MaterialExpansionArmorItem extends ArmorItem {
    public MaterialExpansionArmorItem(IArmorMaterial material, EquipmentSlotType slot) {
        super(material, slot, new Item.Properties().tab(MaterialExpansion.MaterialExpansionArmorGroup));
    }
}
