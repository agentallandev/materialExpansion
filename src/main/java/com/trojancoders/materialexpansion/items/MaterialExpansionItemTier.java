package com.trojancoders.materialexpansion.items;


import java.util.function.Supplier;

import com.trojancoders.materialexpansion.util.MaterialExpansionRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

public enum MaterialExpansionItemTier implements IItemTier {
    COPPER(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(MaterialExpansionRegistry.COPPER_INGOT.get());
    }),
    NICKEL(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(MaterialExpansionRegistry.NICKEL_INGOT.get());
    }),
    STEEL(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(MaterialExpansionRegistry.STEEL_INGOT.get());
    }),
    TITANIUM(0, 32, 12.0F, 0.0F, 22, () -> {
        return Ingredient.of(MaterialExpansionRegistry.TITANIUM_INGOT.get());
    }),
    ALUMINUM(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(MaterialExpansionRegistry.ALUMINUM_INGOT.get());
    }),
    TITANIUM_ALLOY(4, 2031, 9.0F, 4.0F, 15, () -> {
        return Ingredient.of(MaterialExpansionRegistry.TITANIUM_ALLOY_INGOT.get());
    }),
    EMERALD(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(Items.EMERALD);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    private MaterialExpansionItemTier(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_) {
        this.level = p_i48458_3_;
        this.uses = p_i48458_4_;
        this.speed = p_i48458_5_;
        this.damage = p_i48458_6_;
        this.enchantmentValue = p_i48458_7_;
        this.repairIngredient = new LazyValue<>(p_i48458_8_);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}