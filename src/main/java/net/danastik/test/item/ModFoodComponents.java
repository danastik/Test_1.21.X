package net.danastik.test.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).build();

}
