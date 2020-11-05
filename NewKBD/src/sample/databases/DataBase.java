package sample.databases;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DataBase {
    private String url = "jdbc:mysql://localhost:3306/kbd2?useSSL=false";
    private Properties p;

    private List<Author> author;
    private List<Consignment> consignment;
    private List<Foodstuff> foodstuff;
    private List<Ingredients_info> ingredients_info;
    private List<Provider> provider;
    private List<Recipe> recipe;

    public List<Author> getAuthor() {
        return author;
    }

    public List<Consignment> getConsignment() {
        return consignment;
    }

    public List<Foodstuff> getFoodstuff() {
        return foodstuff;
    }

    public List<Ingredients_info> getIngredients_info() {
        return ingredients_info;
    }

    public List<Provider> getProvider() {
        return provider;
    }

    public List<Recipe> getRecipe() {
        return recipe;
    }




}

