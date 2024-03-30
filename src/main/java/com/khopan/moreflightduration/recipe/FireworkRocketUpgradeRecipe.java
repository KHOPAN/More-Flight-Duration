package com.khopan.moreflightduration.recipe;

import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

public class FireworkRocketUpgradeRecipe extends CustomRecipe {
	private static final Ingredient TNT_INGREDIENT = Ingredient.of(Items.TNT);

	public FireworkRocketUpgradeRecipe(ResourceLocation location, CraftingBookCategory category) {
		super(location, category);
	}

	@Override
	public boolean matches(CraftingContainer container, Level level) {
		if(container.getContainerSize() < 1) {
			return false;
		}

		return FireworkRocketUpgradeRecipe.TNT_INGREDIENT.test(container.getItem(0));
	}

	@Override
	public ItemStack assemble(CraftingContainer container, RegistryAccess access) {
		return new ItemStack(Items.DIAMOND, 1);
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return width * height > 1;
	}

	@Override
	public ItemStack getResultItem(RegistryAccess registryAccess) {
		return new ItemStack(Items.DIAMOND);
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return RecipeSerializerRegistry.FIREWORK_ROCKET_UPGRADE;
	}
}
