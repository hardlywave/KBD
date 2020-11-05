package sample.databases;

import java.sql.*;
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


    private void settingProperties() {
        p = new Properties();
        p.setProperty("user", "root");
        p.setProperty("password", "root");
        p.setProperty("useUnicode", "true");
        p.setProperty("characterEncoding", "cp1251");
    }


    private String addAp(String string) {
        return '\'' + string + '\'';
    }

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

    private String eqSearchConsignment(String date, String number){
        String result = Constant.SELECT_CONSIGNMENT +
            Constant.WHERE + Constant.CONSIGNMENT_DATE + Constant.EQUAL + addAp(date) +
            Constant.CONSIGNMENT_PROVIDER_ID + Constant.EQUAL + addAp(number);
        return result;
    }

    private String eqSearchFoodStuffRecipe(){
        String result = Constant.SELECT_FOODNAME_RECIPENAME + Constant.LEFT_JOIN_FOODSTUFF_RECIPE;
        return result;
    }

    private String eqSearchMinCalories(){
        String result = Constant.SELECT_SORT_MIN_CALORIES;
        return result;
    }

    private String whereAuthor(Author author) {
        String result = Constant.WHERE +
                Constant.AUTHOR_ID + Constant.EQUAL + author.getAutorId() + Constant.AND +
                Constant.AUTHOR_LASTNAME + Constant.EQUAL + addAp(author.getAuthorLastName()) + Constant.AND +
                Constant.AUTHOR_FIRSTNAME + Constant.EQUAL + addAp(author.getAuthorFirstName()) + Constant.AND +
                Constant.AUTHOR_COUNTRY + Constant.EQUAL + addAp(author.getAuthorCountry())+ Constant.AND +
                Constant.BIRTHDAY + Constant.EQUAL + addAp(author.getBirthday());
        return result;
    }

    private String whereConsignment(Consignment consignment) {
        String result = Constant.WHERE +
                Constant.DATE + Constant.EQUAL + addAp(consignment.getDate()) + Constant.AND +
                Constant.PROVIDER_ID + Constant.EQUAL + consignment.getProviderId() + Constant.AND +
                Constant.INGREDIENTS + Constant.EQUAL + addAp(consignment.getIngredients()) + Constant.AND +
                Constant.PRICE + Constant.EQUAL + consignment.getPrice();
        return result;
    }

    private String whereFoodstuff(Foodstuff foodstuff) {
        String result = Constant.WHERE +
                Constant.FOODSTUFF_NAME + Constant.EQUAL + addAp(foodstuff.getFoodStuffName()) + Constant.AND +
                Constant.INGREDIENTS + Constant.EQUAL + addAp(foodstuff.getIngredients()) + Constant.AND +
                Constant.RECIPE_ID + Constant.EQUAL + foodstuff.getRecipeId() + Constant.AND +
                Constant.CALORIES_FOOD + Constant.EQUAL + foodstuff.getCaloriesFood();
        return result;
    }

    private  String whereIngredients_info(Ingredients_info ingredients_info){
        String result = Constant.WHERE +
                Constant.INGREDIENTS + Constant.EQUAL + addAp(ingredients_info.getIngredients()) + Constant.AND +
                Constant.WEIGHT + Constant.EQUAL + ingredients_info.getWeight() + Constant.AND +
                Constant.METHOD_FOR_PREPARING + Constant.EQUAL + addAp(ingredients_info.getMethodForPreparing()) + Constant.AND +
                Constant.CALORIES + Constant.EQUAL + ingredients_info.getCalories();
        return result;
    }

    private String whereProvider(Provider provider){
        String result = Constant.WHERE +
                Constant.PROVIDER_ID + Constant.EQUAL + provider.getProviderId() + Constant.AND +
                Constant.INGREDIENTS + Constant.EQUAL + addAp(provider.getIngredients()) + Constant.AND +
                Constant.ADDRESS + Constant.EQUAL + addAp(provider.getAddress()) + Constant.AND +
                Constant.PHONE + Constant.EQUAL + provider.getPhone();
        return result;
    }

    private String whereRecipe(Recipe recipe){
        String result = Constant.WHERE +
                Constant.RECIPE_ID + Constant.EQUAL + recipe.getRecipeId() + Constant.AND +
                Constant.RECIPE_NAME + Constant.EQUAL + addAp(recipe.getRecipeName()) + Constant.AND +
                Constant.DESCRIPTION + Constant.EQUAL + addAp(recipe.getDescription()) + Constant.AND +
                Constant.AUTHOR_ID + Constant.EQUAL + recipe.getAuthorId();
        return result;
    }
}

