package sample.databases;

public class Constant {
    public static final String Author = "author";
    public static final String Consignment = "consignment";
    public static final String Foodstuff = "foodstuff";
    public static final String Ingredients_info = "ingredients_info";
    public static final String Provider = "provider";
    public static final String Recipe = "recipe";

    public static final String SELECT_AUTHOR = "SELECT author_id, author_lastname, author_firstname, author_country, birthday FROM author";
    public static final String SELECT_CONSIGNMENT = "SELECT date, provider_id, ingredients, price FROM consignment";
    public static final String SELECT_FOODSTUFF = "SELECT foodstuff_name, ingredients, recipe_id FROM consignment";
    public static final String SELECT_INGREDIENTS_INFO = "SELECT ingredients, weight, method_for_preparing, calories FROM ingredients_info";
    public static final String SELECT_PROVIDER = "SELECT provider_id, ingredients, address, phone FROM provider";
    public static final String SELECT_RECIPE = "SELECT recipe_id, recipe_name, description, author_id";


    public static final String LEFT_JOIN = "LEFT JOIN ";
    public static final String ON = " ON ";
    public static final String INSERT = "INSERT INTO ";
    public static final String DELETE = "DELETE FROM ";
    public static final String WHERE = " WHERE ";
    public static final String AND = " AND ";
    public static final String UPDATE = "UPDATE ";
    public static final String SET = " SET ";

    public static final String COMMA = ", ";
    public static final String EQUAL = " = ";
    public static final String SEMICOLON = ";";
    public static final String LEFT_BRACKET = "(";
    public static final String RIGHT_BRACKET = ")";


}
