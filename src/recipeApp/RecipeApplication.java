package recipeApp;

import java.util.Scanner;

public class RecipeApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager recipeManager = new RecipeManager();
        FavoritesManager favoritesManager = new FavoritesManager();

       

        
        recipeManager.addRecipe(new Recipe("Spaghetti", "Pasta, Tomato Sauce, Ground Beef",
                "Boil pasta; Prepare sauce; Mix together", "Medium", 4,"Dinner"));
        recipeManager.addRecipe(new Recipe(
        	    "Menemen",
        	    "Eggs, Green peppers, Tomatoes, Olive oil, Salt, Black pepper",
        	    "Chop the green peppers and tomatoes; Heat olive oil in a pan; Add green peppers and cook until soft; Add tomatoes and simmer until they release juice; Crack the eggs into the pan and mix gently; Cook until the eggs are set; Season with salt and pepper",
        	    "Easy",
        	    2,
        	    "Breakfast"
        	    
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Shish Kebab",
        	    "Beef cubes, Onion, Garlic, Olive oil, Yogurt, Paprika, Salt, Black pepper, Wooden skewers",
        	    "Cut beef into cubes; Prepare marinade with yogurt, olive oil, garlic, and spices; Mix beef with marinade and rest for at least 2 hours; Thread beef onto skewers; Grill on medium-high heat until fully cooked",
        	    "Medium",
        	    4,
        	    "Main"
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Turkish Manti",
        	    "Flour, Egg, Water, Salt, Ground beef, Onion, Yogurt, Garlic, Butter, Paprika, Dried mint",
        	    "Prepare dough with flour, eggs, water, and salt; Rest dough and roll out thin; Mix beef with chopped onion and spices; Cut dough into small squares and fill with meat mixture; Fold into dumplings; Boil in salted water until cooked; Serve with garlic yogurt and butter-paprika sauce on top",
        	    "Hard",
        	    4,
        	    "Main"
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Turkish Rice Pilaf",
        	    "Rice, Butter, Vermicelli or orzo, Salt, Chicken broth or water",
        	    "Rinse rice until water is clear; Melt butter in a pot; Add vermicelli and toast until golden; Add rice and stir for 2 minutes; Add hot chicken broth and salt; Cover and simmer until water is absorbed; Rest with lid on before serving",
        	    "Easy",
        	    3,
        	    "Main"
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Revani",
        	    "Semolina, Flour, Sugar, Eggs, Yogurt, Baking powder, Lemon zest, Water, Lemon juice",
        	    "Prepare syrup by boiling water, sugar, and lemon juice; Let it cool; Mix eggs and sugar until fluffy; Add yogurt, semolina, flour, baking powder, and lemon zest; Pour into greased baking dish and bake until golden; Pour cooled syrup over hot cake and let it soak",
        	    "Medium",
        	    6,
        	    "Dessert"
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Fried Eggs with Turkish Sausage",
        	    "Eggs, Turkish sausage (sucuk), Butter",
        	    "Slice the Turkish sausage; Heat butter in a pan; Add the sausage slices and cook until slightly crispy; Crack eggs over the sausage; Cook until the eggs are done to your preference",
        	    "Easy",
        	    2,
        	    "Breakfast"
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Turkish Lentil Soup",
        	    "Red lentils, Onion, Carrot, Potato, Tomato paste, Butter, Salt, Cumin, Water",
        	    "Chop onion, carrot, and potato; In a pot, melt butter and sauté the vegetables; Add tomato paste and stir; Add red lentils and water; Bring to boil and simmer until everything is soft; Blend until smooth; Add salt and cumin to taste",
        	    "Medium",
        	    4,
        	    "Soup"
        	));
        recipeManager.addRecipe(new Recipe(
        	    "Turkish Rice Pudding (Sütlaç)",
        	    "Milk, Rice, Sugar, Water, Cornstarch, Vanilla extract",
        	    "Boil rice in water until soft; Add milk and cook further while stirring; Mix cornstarch with a bit of cold milk and add to the pot; Add sugar and vanilla; Simmer until thickened; Pour into bowls and let cool; Optionally sprinkle with cinnamon",
        	    "Easy",
        	    4,
        	    "Dessert"
        	));

        

        







        recipeManager.addRecipe(new Recipe("Omelette", "Eggs, Salt, Butter",
                "Beat eggs; Pour into pan; Cook until done", "Easy", 2,"Breakfast"));


        boolean running = true;

        while (running) {
            System.out.println("\n=== 📖 Recipe Application ===");
            System.out.println("1. 📋 List All Recipes");
            System.out.println("2. 🔍 Search Recipe by Name");
            System.out.println("3. ➕ Add New Recipe");
            System.out.println("4. 🗑️ Delete Recipe");
            System.out.println("5. 💖 Add Recipe to Favorites");
            System.out.println("6. ⭐ View Favorite Recipes");
            System.out.println("7. 🍽️ List Recipes by Category");
            System.out.println("8. ❌ Exit");
            

            System.out.print("Choose an option (1-8): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    recipeManager.listAllRecipes();
                    break;
                case 2:
                    System.out.print("Enter recipe name to search: ");
                    String searchName = scanner.nextLine();
                    Recipe found = recipeManager.searchRecipeByName(searchName);
                    if (found != null) {
                        System.out.println("\n✅ Recipe Found:\n" + found);
                    } else {
                        System.out.println("❌ Recipe not found.");
                    }
                    break;
                case 3:
                	System.out.print("Enter recipe name: ");
                	String name = scanner.nextLine();
                	System.out.print("Enter ingredients (comma separated): ");
                	String ingredients = scanner.nextLine();
                	System.out.print("Enter instructions (separate steps with ';'): ");
                	String instructions = scanner.nextLine();
                	System.out.print("Enter difficulty (Easy / Medium / Hard): ");
                	String difficulty = scanner.nextLine();
                	System.out.print("How many servings is this recipe for? ");
                	int servings = scanner.nextInt();
                	scanner.nextLine(); 
                	System.out.print("Enter recipe category (Breakfast / Soup / Dessert / Main): ");
                	String category = scanner.nextLine();


                	Recipe newRecipe = new Recipe(name, ingredients, instructions, difficulty, servings, category);

                	recipeManager.addRecipe(newRecipe);
                	System.out.println("✅ Recipe added successfully!");

                    break;
                
                
                case 4:
                    System.out.print("Enter the name of the recipe to delete: ");
                    String deleteName = scanner.nextLine();
                    boolean deleted = recipeManager.deleteRecipe(deleteName);
                    if (deleted) {
                        System.out.println("✅ Recipe deleted successfully.");
                    } else {
                        System.out.println("❌ Recipe not found. Nothing deleted.");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter recipe name to add to favorites: ");
                    String favName = scanner.nextLine();
                    Recipe recipeToFav = recipeManager.getRecipeByName(favName);
                    if (recipeToFav != null) {
                        favoritesManager.addToFavorites(recipeToFav);
                    } else {
                        System.out.println("❌ Recipe not found.");
                    }
                    break;

                case 6:
                    favoritesManager.listFavorites();
                    break;   
                case 7:
                    System.out.print("Enter category (Breakfast / Soup / Dessert / Main): ");
                    String searchCategory = scanner.nextLine();
                    recipeManager.listRecipesByCategory(searchCategory);
                    break;
    
               
               

                case 8:
                    System.out.println("👋 Exiting... Goodbye!");
                    running = false;
                    break;
    
    
                default:
                    System.out.println("⚠️ Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
