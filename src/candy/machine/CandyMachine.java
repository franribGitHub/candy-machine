package candy.machine;

//Frankie Ribas

import java.util.Scanner;

public class CandyMachine {
    
    private static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Welcome to the Computer Candy Machine!\nAll candy provided is virtual.\n\nHow much money do ya got? > $");
        double money = kb.nextDouble();
        kb.nextLine();
        System.out.println("$" + money + ", that's all?\nWell, lemme tell ya what we got here.");
        store(money);
    }
    
    public static void store(double money) {
        System.out.println("\nA    $0.50  Twix");
        System.out.println("B    $0.75  More Twix");
        System.out.println("C    $1.00  Twix Remastered");
        System.out.println("D    $0.60  New Twix");
        System.out.println("E    $1.50  Twix Deluxe Edition");
        System.out.print("\nSo, what'll ya have? > ");
        String choice = kb.nextLine();
        if (choice.equals("A")) {
            purchase(money, 0.5);
        } else if (choice.equals("B")) {
            purchase(money, 0.75);
        } else if (choice.equals("C")) {
            purchase(money, 1.0);
        } else if (choice.equals("D")) {
            purchase(money, 0.6);
        } else {
            purchase(money, 1.5);
        }
    }
    
    public static void purchase(double money, double price) {
        if (money >= price) {
            System.out.println("\nThanks for purchasing candy through us.");
            System.out.println("Please take your candy, and your $" + (money - price) + " change!");
        } else {
            System.out.println("\nYou're broke. Take your $" + money + " and go elsewhere.");
        }
    }
    
}
