package Lesson_6;

import java.util.Scanner;

public class MenuActions extends Menu {

    public static void printActionsMenu(Currency workingCurrency) {
        String currencyName = workingCurrency.getCurrencyName();
        System.out.println();
        System.out.println("Choose action for " + workingCurrency.getCurrencyName() + " : ");
        System.out.println(String.format("1 :Change %s to UAH ", currencyName));
        System.out.println(String.format("2 :Change UAH to %s ", currencyName));
        System.out.println("3 :Change kurs NBU ");
        System.out.println("4 :Show kurs NBU ");
        System.out.println("100: Exit from menu");
        System.out.println("Your choice : ");
    }

    public static void doActionsWithCurrency(Currency workingCurrency, int menuNumber) {
        String currencyName = workingCurrency.getCurrencyName();
        System.out.println(String.format("You work with %s", currencyName));
        switch (menuNumber) {
            case (1):
                System.out.println(String.format("Enter number of %s", currencyName));
                int numberOfCurrency = Menu.getNumberOfCurrencyFromConsole();
                workingCurrency.exchangeCurrencyToUAH(numberOfCurrency);
                break;
            case (2):
//                System.out.println("Enter number of UAH");
                System.out.println(String.format("Enter number of %s ", currencyName));
                int numberOfUAH = Menu.getNumberOfCurrencyFromConsole();
                workingCurrency.exchangeCurrencyToUAH(numberOfUAH);
                break;
            case (3):
                System.out.println("Enter new kurs NBU: ");
                Scanner scanner = new Scanner(System.in);
                double newKursNBU = scanner.nextDouble();
                workingCurrency.setKursNBU(newKursNBU);
                break;
            case (4):
                System.out.println(String.format("Kurs NBU: %s", workingCurrency.getKursNBU()));
                break;
            default:
                System.out.println(String.format("No action with number %s", menuNumber));
                System.out.println("Enter valid number");
        }
    }
}
