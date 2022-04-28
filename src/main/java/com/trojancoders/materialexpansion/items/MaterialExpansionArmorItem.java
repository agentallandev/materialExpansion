package com.trojancoders.materialexpansion.items;

import com.trojancoders.materialexpansion.MaterialExpansion;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class MaterialExpansionArmorItem extends ArmorItem {
    public MaterialExpansionArmorItem(IArmorMaterial material, EquipmentSlotType slot) {
        super(material, slot, new Item.Properties().tab(MaterialExpansion.MaterialExpansionArmorGroup));
    }
}
