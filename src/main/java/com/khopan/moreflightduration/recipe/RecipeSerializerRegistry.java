package com.khopan.moreflightduration.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;

public class RecipeSerializerRegistry {
	public static final RecipeSerializer<FireworkRocketUpgradeRecipe> FIREWORK_ROCKET_UPGRADE = RecipeSerializer.register("crafting_special_firework_rocket_upgrade", new SimpleCraftingRecipeSerializer<FireworkRocketUpgradeRecipe>(FireworkRocketUpgradeRecipe :: new));

	public static void load() {
		// Load the class
	}
}
