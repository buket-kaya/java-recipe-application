package recipeApp;

import java.util.ArrayList;
import java.util.List;

public class FavoritesManager {
    private List<Recipe> favoriteRecipes;

    public FavoritesManager() {
        favoriteRecipes = new ArrayList<>();
    }

    public void addToFavorites(Recipe recipe) {
        if (!favoriteRecipes.contains(recipe)) {
            favoriteRecipes.add(recipe);
            System.out.println("💖 Recipe added to favorites!");
        } else {
            System.out.println("⚠️ Recipe is already in favorites.");
        }
    }

    public void removeFromFavorites(Recipe recipe) {
        if (favoriteRecipes.remove(recipe)) {
            System.out.println("❌ Recipe removed from favorites.");
        } else {
            System.out.println("⚠️ Recipe not found in favorites.");
        }
    }

    public void listFavorites() {
        if (favoriteRecipes.isEmpty()) {
            System.out.println("💔 No favorite recipes found.");
        } else {
            System.out.println("⭐ Favorite Recipes:");
            for (Recipe r : favoriteRecipes) {
                System.out.println("\n" + r);
            }
        }
    }
}