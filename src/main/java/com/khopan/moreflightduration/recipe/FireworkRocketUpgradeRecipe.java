package com.khopan.moreflightduration.recipe;

import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
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
	private static final Ingredient FIREWORK_ROCKET_INGREDIENT = Ingredient.of(Items.FIREWORK_ROCKET);
	private static final Ingredient GUNPOWDER_INGREDIENT = Ingredient.of(Items.GUNPOWDER);

	public FireworkRocketUpgradeRecipe(ResourceLocation location, CraftingBookCategory category) {
		super(location, category);
	}

	@Override
	public boolean matches(CraftingContainer container, Level level) {
		ItemStack fireworkRocket = null;
		int fireworkRocketCount = 0;
		int gunpowderCount = 0;

		for(int i = 0; i < container.getContainerSize(); i++) {
			ItemStack stack = container.getItem(i);

			if(stack == null || stack.isEmpty()) {
				continue;
			}

			if(FireworkRocketUpgradeRecipe.FIREWORK_ROCKET_INGREDIENT.test(stack)) {
				if(fireworkRocket != null && !ItemStack.isSameItemSameTags(fireworkRocket, stack)) {
					return false;
				}

				fireworkRocket = stack;
				fireworkRocketCount++;
			} else if(FireworkRocketUpgradeRecipe.GUNPOWDER_INGREDIENT.test(stack)) {
				gunpowderCount++;
			} else {
				return false;
			}
		}

		if((fireworkRocketCount != 1 && fireworkRocketCount != 3) || gunpowderCount < 1) {
			return false;
		}

		CompoundTag tag = fireworkRocket.getTag();

		if(tag.contains("Fireworks")) {
			CompoundTag fireworks = tag.getCompound("Fireworks");

			if(fireworks.contains("Flight") && fireworks.getByte("Flight") + gunpowderCount * (fireworkRocketCount == 1 ? 3 : 1) > Byte.MAX_VALUE) {
				return false;
			}
		}

		return true;
	}

	@Override
	public ItemStack assemble(CraftingContainer container, RegistryAccess access) {
		return new ItemStack(Items.FIREWORK_ROCKET, 1);
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return width * height > 1;
	}

	@Override
	public ItemStack getResultItem(RegistryAccess registryAccess) {
		return new ItemStack(Items.FIREWORK_ROCKET);
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return RecipeSerializerRegistry.FIREWORK_ROCKET_UPGRADE;
	}
}
