package com.khopan.moreflightduration.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.world.item.crafting.FireworkRocketRecipe;

@Mixin(FireworkRocketRecipe.class)
public abstract class FireworkRocketRecipeMixin {
	@ModifyConstant(method="matches(Lnet/minecraft/world/inventory/CraftingContainer;Lnet/minecraft/world/level/Level;)Z", constant=@Constant(intValue=3))
	private int matchesMixin(int value) {
		return Byte.MAX_VALUE;
	}
}
