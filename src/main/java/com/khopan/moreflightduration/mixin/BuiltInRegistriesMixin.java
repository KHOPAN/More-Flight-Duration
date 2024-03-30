package com.khopan.moreflightduration.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.khopan.moreflightduration.recipe.FireworkRocketUpgradeRecipe;

import net.minecraft.core.registries.BuiltInRegistries;

@Mixin(BuiltInRegistries.class)
public abstract class BuiltInRegistriesMixin {
	@Inject(method="bootStrap()V", at=@At("HEAD"))
	private static void bootStrapMixin(CallbackInfo info) {
		FireworkRocketUpgradeRecipe.load();
	}
}
