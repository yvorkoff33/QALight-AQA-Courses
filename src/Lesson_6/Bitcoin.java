package Lesson_6;

public class Bitcoin extends Currency {

    public Bitcoin(double kursNBUEx) {
        super(kursNBUEx);
    }


    @Override
    String getCurrencyName() {
        return "BTC";
    }

    @Override
    public double exchangeCurrencyToUAH(double numberOfUAH){
        System.out.println("*** BTC Currency ***");
        System.out.println(String.format("Операция запрещена нацбанком, вы не можете обменять ваши %s UAH", numberOfUAH));
        return numberOfUAH;
    }

    @Override
    public double exchangeUAHToCurrency(double numberOfCurrency){
        System.out.println("*** BTC Currency ***");
        System.out.println(String.format("Операция запрещена нацбанком, вы не можете обменять ваши %s BTC", numberOfCurrency));
        return numberOfCurrency;
    }
}
