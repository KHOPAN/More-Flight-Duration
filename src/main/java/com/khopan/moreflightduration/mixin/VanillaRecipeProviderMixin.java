package com.khopan.moreflightduration.mixin;

import java.util.function.Consumer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.khopan.moreflightduration.recipe.RecipeSerializerRegistry;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.SpecialRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;

@Mixin(VanillaRecipeProvider.class)
public abstract class VanillaRecipeProviderMixin { // For data generator?
	@Inject(method="buildRecipes(Ljava/util/function/Consumer;)V", at=@At("TAIL"))
	private void buildRecipesMixin(Consumer<FinishedRecipe> writer, CallbackInfo info) {
		SpecialRecipeBuilder.special(RecipeSerializerRegistry.FIREWORK_ROCKET_UPGRADE).save(writer, "firework_rocket_upgrade");
	}
}
