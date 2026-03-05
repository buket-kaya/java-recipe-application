package recipeApp;

import java.util.LinkedList;

public class RecipeManager {
    private LinkedList<Recipe> recipeList;
    private RecipeSearcher searcher;

    public RecipeManager() {
        recipeList = new LinkedList<>();
        searcher = new RecipeSearcher();
    }

    
    public Recipe getRecipeByName(String name) {
        for (Recipe recipe : recipeList) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
        searcher.addRecipe(recipe);
    }
    
    public void listRecipesByCategory(String category) {
        boolean found = false;
        for (Recipe recipe : recipeList) {
            if (recipe.getCategory().equalsIgnoreCase(category)) {
                System.out.println(recipe);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No recipes found in this category.");
        }
    }


    public void listAllRecipes() {
        if (recipeList.isEmpty()) {
            System.out.println("No recipes available.");
        } else {
            for (Recipe recipe : recipeList) {
                System.out.println(recipe);
                System.out.println("--------------------------------------------------");
            }
        }
    }

    public Recipe searchRecipeByName(String name) {
        return searcher.searchByName(name);
    }
    
    public boolean deleteRecipe(String name) {
        Recipe toRemove = null;
        for (Recipe recipe : recipeList) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                toRemove = recipe;
                break;
            }
        }
        if (toRemove != null) {
            recipeList.remove(toRemove);
            return true;
        }
        return false;
    }

}
