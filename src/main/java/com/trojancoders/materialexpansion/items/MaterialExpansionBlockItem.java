package com.trojancoders.materialexpansion.items;

import com.trojancoders.materialexpansion.MaterialExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MaterialExpansionBlockItem extends BlockItem {
    public MaterialExpansionBlockItem(Block block) {
        super(block, new Item.Properties().tab(MaterialExpansion.MaterialExpansionMaterialGroup));
    }
}
