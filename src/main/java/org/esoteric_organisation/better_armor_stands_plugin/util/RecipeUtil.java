package org.esoteric_organisation.better_armor_stands_plugin.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Recipe;

import java.util.Iterator;

public class RecipeUtil {
    public static void removeRecipe(Material resultItemType){
        Iterator<Recipe> recipeIterator = Bukkit.getServer().recipeIterator();

        while(recipeIterator.hasNext()){
            Recipe recipe = recipeIterator.next();

            if (recipe.getResult().getType().equals(resultItemType)) {
                recipeIterator.remove();
            }
        }
    }
}
