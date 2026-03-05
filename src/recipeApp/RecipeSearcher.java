package recipeApp;

import java.util.HashMap;

public class RecipeSearcher {
    private HashMap<String, Recipe> recipeMap;

    public RecipeSearcher() {
        recipeMap = new HashMap<>();
    }

    public void addRecipe(Recipe recipe) {
        recipeMap.put(recipe.getName().toLowerCase(), recipe);
    }

    public Recipe searchByName(String name) {
        return recipeMap.get(name.toLowerCase());
    }

    public boolean exists(String name) {
        return recipeMap.containsKey(name.toLowerCase());
    }
}
