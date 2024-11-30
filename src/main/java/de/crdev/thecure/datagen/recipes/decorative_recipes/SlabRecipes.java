package de.crdev.thecure.datagen.recipes.decorative_recipes;

import de.crdev.thecure.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;

import java.util.function.Consumer;

public class SlabRecipes {
    public static void generateShapelessRecipes(Consumer<RecipeJsonProvider> exporter) {

    }

    public static void generateShapedRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create( ModBlocks.ROSE_GOLD_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("bbb")
                .pattern("   ")

                .input('b', ModBlocks.ROSE_GOLD_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ROSE_GOLD_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ROSE_GOLD_BRICKS))
                .offerTo(exporter);
    }
}

