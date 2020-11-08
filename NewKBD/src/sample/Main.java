package sample;

import sample.databases.*;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Menu\n" + "2 - End\n");
        int a = scanner.nextInt();
        boolean b = true;
        int i = 0;
        while (b) {
            switch (a) {
                case 1: {
                    Menu menu = new Menu();
                    menu.startMenu();
                }
                case 2:{
                    System.out.println("You have closed the programme. :D");
                    b = false;
                    break;
                }
            }
        }
    }
}