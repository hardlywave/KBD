package sample;

import sample.databases.*;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 0;
        while (true) {
            switch (a) {
                case 1: {
/*                    List<Author> authors = db.getAuthor();
                    while (i < authors.size()) {
                        int test = authors.get(i).getAutorId();
                        String test1 = authors.get(i).getAuthorLastName();
                        String test2 = authors.get(i).getAuthorFirstName();
                        String test3 = authors.get(i).getAuthorCountry();
                        String test4 = authors.get(i).getBirthday();

                        System.out.println(test + " " +test1 + " " + test2 + " " + test3 + " " + test4);
                        i++;
                    }
                    break;*/
                    Menu menu = new Menu();
                    menu.startMenu();
                }
//                case 2: {...}
                default: {
                    break;
                }
            }
        }
    }
/*    public void createFoodStuff() throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        int i = 0;
        List<Foodstuff> foodstuffs = db.getFoodstuff();
        while (i < foodstuffs.size()) {
            String test = foodstuffs.get(i).getFoodStuffName();
            String test1 = foodstuffs.get(i).getIngredients();
            int test2 = foodstuffs.get(i).getRecipeId();
            int test3 = foodstuffs.get(i).getCaloriesFood();

            System.out.println(test + "\t" + test1 + "\t" + test2 + "\t" + test3);
            i++;
        }
        return;
    }*/
}