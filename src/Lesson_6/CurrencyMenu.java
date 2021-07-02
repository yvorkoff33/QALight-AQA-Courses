package Lesson_6;

public class CurrencyMenu extends Menu {

    public static void printCurrencyMenu() {
        System.out.println(" ");
        System.out.println("Choose currency: ");
        System.out.println("1. Dollar ");
        System.out.println("2. Euro ");
        System.out.println("3. BTC ");
        System.out.println("100. For Exit ");
        System.out.println("Enter your choice: ");
    }

    public static Currency setCurrency(int currencyNumber) {

        Currency tempCurrecny;
        switch (currencyNumber) {
            case 1:
                tempCurrecny = ListOfCurrency.currencyHashMap.get("USD");
                break;
            case 2:
                tempCurrecny = ListOfCurrency.currencyHashMap.get("EUR");
                break;
            case 3:
                tempCurrecny = ListOfCurrency.currencyHashMap.get("BTC");
                break;
            default:
                System.out.println("Default currency = USD");
                tempCurrecny = ListOfCurrency.currencyHashMap.get("USD");

        }
        return tempCurrecny;
    }
}
