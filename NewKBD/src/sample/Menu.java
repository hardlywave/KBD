package sample;

import sample.databases.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void startMenu() {
        Menu menu = new Menu();
        System.out.println("1 - Food Stuff\n" +
                "2 - Recipe\n" +
                "3 - Providers\n" +
                "4 - Check Consignment by (date and provider)\n" +
                "5 - Dishes with min calories\n" +
                "6 - Dishes and Recipes list\n" +
                "7 - Exit\n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1: {
                try {
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\t" + "Food Staff" + "\t" + "Ingredients" + "\t\t" + "Recipe id" + "\t" + "Calories");
                    System.out.println("-----------------------------------------------------------------");
                    createFoodStuff();
                    System.out.println("-----------------------------------------------------------------");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("Error" + e);
                }
            }
            case 2: {
                try {
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\t" + "Recipe id" + "\t" + "Recipe name" + "\t\t" + "Description" + "\t\t" + "Author id");
                    System.out.println("-----------------------------------------------------------------");
                    creatRecipe();
                    System.out.println("-----------------------------------------------------------------");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    System.out.println("Error" + e);
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\t" + "Provider id" + "\t" + "Ingredients" + "\t\t" + "address" + "\t\t" + "Phone");
                    System.out.println("-----------------------------------------------------------------");
                    creatProvider();
                    System.out.println("-----------------------------------------------------------------");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    System.out.println("Error" + e);
                    e.printStackTrace();
                }
                break;
            }
            case 4:{
                try {
                    serchConsignment();
                    System.out.println("-----------------------------------------------------------------");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    System.out.println("Error" + e);
                    e.printStackTrace();
                }
                break;
            }
            case 5:{
                try {
                    searchMinCalories();
                    System.out.println("-----------------------------------------------------------------");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    System.out.println("Error" + e);
                    e.printStackTrace();
                }
                break;
            }
            case 6:{
                try {
                    searchFoodStuffRecipe();
                    System.out.println("-----------------------------------------------------------------");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    System.out.println("Error" + e);
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public void createFoodStuff() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        int i = 0;
        List<Foodstuff> foodstuffs = db.getFoodstuff();
        while (i < foodstuffs.size()) {
            String test = foodstuffs.get(i).getFoodStuffName();
            String test1 = foodstuffs.get(i).getIngredients();
            int test2 = foodstuffs.get(i).getRecipeId();
            int test3 = foodstuffs.get(i).getCaloriesFood();

            System.out.println("\t" + test + "\t" + test1 + "\t\t" + test2 + "\t\t\t" + test3);
            i++;
        }
        i = 0;
    }

    public void creatRecipe() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        int i = 0;
        List<Recipe> recipes = db.getRecipe();
        while (i < recipes.size()) {
            int test = recipes.get(i).getRecipeId();
            String test1 = recipes.get(i).getRecipeName();
            String test2 = recipes.get(i).getDescription();
            int test3 = recipes.get(i).getAuthorId();

            System.out.println("\t\t" + test + "\t\t" + test1 + "\t\t\t" + test2 + "\t\t\t\t" + test3);
            i++;
        }
        i = 0;
    }

    public void creatProvider() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        int i = 0;
        List<Provider> providers = db.getProvider();
        while (i < providers.size()) {
            int test = providers.get(i).getProviderId();
            String test1 = providers.get(i).getIngredients();
            String test2 = providers.get(i).getAddress();
            int test3 = providers.get(i).getPhone();

            System.out.println("\t\t" + test + "\t\t" + test1 + "\t\t\t" + test2 + "\t\t" + test3);
            i++;
        }
        i = 0;
    }

    public void serchConsignment() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        System.out.println("Enter the data(xx.xx.xxxx): ");
        String data = scanner.nextLine();
        System.out.println("Enter Provider id: ");
        String id = scanner.nextLine();
        List<Consignment> consignments = db.searchConsignment(data,id);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t" + "Date" + "\t" + "Provider id" + "\t\t" + "Ingredients" + "\t\t" + "Price");
        System.out.println("-----------------------------------------------------------------");
        while (i < consignments.size()) {
            String test = consignments.get(i).getDate();
            int test1 = consignments.get(i).getProviderId();
            String test2 = consignments.get(i).getIngredients();
            int test3 = consignments.get(i).getPrice();

            System.out.println(" " + test + "  \t" + test1 + "\t\t\t" + test2 + "\t\t" + test3);
            i++;
        }
        i = 0;
    }

    public void searchMinCalories() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        int i = 0;
        List<Foodstuff> foodstuffs = db.searchMinCalories();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t" + "Food Staff" + "\t" + "Ingredients" + "\t\t" + "Recipe id" + "\t" + "Calories");
        System.out.println("-----------------------------------------------------------------");
        while (i < foodstuffs.size()) {
            String test = foodstuffs.get(i).getFoodStuffName();
            String test1 = foodstuffs.get(i).getIngredients();
            int test2 = foodstuffs.get(i).getRecipeId();
            int test3 = foodstuffs.get(i).getCaloriesFood();

            System.out.println("\t" + test + "\t" + test1 + "\t\t" + test2 + "\t\t\t" + test3);
            i++;
        }
        i = 0;
    }

    public void searchFoodStuffRecipe() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        int i = 0;
        List<Foodstuff> foodstuffs = db.searchFoodStuffRecipe();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t" + "Date" + "\t" + "Provider id" + "\t\t" + "Ingredients" + "\t\t" + "Price");
        System.out.println("-----------------------------------------------------------------");
        while (i < foodstuffs.size()) {
            String test = foodstuffs.get(i).getFoodStuffName();
            String test1 = foodstuffs.get(i).getIngredients();
            int test2 = foodstuffs.get(i).getRecipeId();
            int test3 = foodstuffs.get(i).getCaloriesFood();

            System.out.println(" " + test + "  \t" + test1 + "\t\t\t" + test2 + "\t\t" + test3);
            i++;
        }
        i = 0;
    }
}
