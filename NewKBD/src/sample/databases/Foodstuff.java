package sample.databases;

public class Foodstuff {
    private String foodStuffName;
    private String ingredients;
    private int recipeId;

    public String getFoodStuffName() {
        return foodStuffName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public Foodstuff(String foodStuffName, String ingredients, int recipeId){
        this.foodStuffName = foodStuffName;
        this.ingredients = ingredients;
        this.recipeId = recipeId;
    }
}
