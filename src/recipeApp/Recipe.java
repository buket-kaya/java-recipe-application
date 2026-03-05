package recipeApp;

public class Recipe {
    private String name;
    private String ingredients;
    private String instructions;
    private String difficulty;
    private int servings;
    private String category;

    public Recipe(String name, String ingredients, String instructions, String difficulty, int servings, String category ) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.difficulty = difficulty;
        this.servings = servings;
        this.category = category;
       
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getDifficulty() {
        return difficulty;
    }
    
    public int getServings() {
    	return servings;
    }
    
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        StringBuilder formattedInstructions = new StringBuilder();
        String[] steps = instructions.split(";");
        for (int i = 0; i < steps.length; i++) {
            formattedInstructions.append("   ➤ Step ").append(i + 1).append(": ").append(steps[i].trim()).append("\n");
        }

        
        String coloredDifficulty;
        switch (difficulty.toLowerCase()) {
            case "easy":
                coloredDifficulty = AnsiColors.GREEN + "Easy" + AnsiColors.RESET;
                break;
            case "medium":
                coloredDifficulty = AnsiColors.YELLOW + "Medium" + AnsiColors.RESET;
                break;
            case "hard":
                coloredDifficulty = AnsiColors.RED + "Hard" + AnsiColors.RESET;
                break;
            default:
                coloredDifficulty = difficulty; // Bilinmeyen durum
        }

        

        return "🍽️ " + name + " (" + coloredDifficulty + ")\n" +
                "👥 Servings: " + servings + "\n" +
                "📂 Category: " + category + "\n" +
                "📝 Ingredients: " + ingredients + "\n" +
                formattedInstructions.toString(); // Burada adımları ekliyoruz
}
    }

