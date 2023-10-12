package net.itshamza.mcmobvote.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties RAW_CRAB_LEG = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .meat().build();

    public static final FoodProperties COOKED_CRAB_LEG = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f)
            .meat().build();
}
