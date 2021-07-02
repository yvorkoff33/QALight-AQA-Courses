package Lesson_6;

import java.util.HashMap;
import java.util.Map;

public class ListOfCurrency {
    static HashMap<String, Currency> currencyHashMap = new HashMap<>();

    public static void addCurrency(Currency currency) {
        currencyHashMap.put(currency.getCurrencyName(), currency);

    }

    public static HashMap<String, Currency> getCurrencyHashMap(){
        return currencyHashMap;
    }
}
