package com.khopan.moreflightduration.recipe;

import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

public class FireworkRocketUpgradeRecipe extends CustomRecipe {
	public FireworkRocketUpgradeRecipe(ResourceLocation location, CraftingBookCategory category) {
		super(location, category);
	}

	@Override
	public boolean matches(CraftingContainer container, Level level) {
		return false;
	}

	@Override
	public ItemStack assemble(CraftingContainer container, RegistryAccess access) {
		return null;
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return width * height > 1;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return null;
	}
}
