package Lesson_6;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(26);
        Euro euro = new Euro(33);
        UZS UZS = new UZS(0.0001);
        Bitcoin BTC = new Bitcoin(994310.60);

        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(26);
        System.out.println(dollar.getKursNBU());

        System.out.println(dollar.getMarga());
        dollar.setMarga(0.11);
        System.out.println(dollar.getMarga());

        System.out.println((dollar.getMarga() * dollar.getKursNBU()) + dollar.getKursNBU());
        System.out.println("*** USD Currency ***");
        dollar.exchangeUAHToCurrency(1000);
        dollar.setKursNBU(25);
        dollar.exchangeUAHToCurrency(1000);
        dollar.setKursNBU(27);
        dollar.exchangeUAHToCurrency(1000);
        dollar.setMarga(0.14);
        dollar.exchangeUAHToCurrency(1000);
        dollar.exchangeCurrencyToUAH(100);

        System.out.println("*** EURO Currency ***");
        euro.exchangeUAHToCurrency(1000);
        euro.exchangeCurrencyToUAH(100);
        euro.setMarga(0.12);
        euro.exchangeCurrencyToUAH(100);

        System.out.println("*** UZS Currency ***");
        UZS.exchangeCurrencyToUAH(1000000);
        UZS.exchangeUAHToCurrency(100);
        UZS.setKursNBU(0.0026);
        UZS.exchangeUAHToCurrency(100);
        System.out.println("Is it hard to exchange UZS? " + UZS.freeToConvert());

if (BTC instanceof IsFreeConverted){
    System.out.println("Yes!");
} else {
    System.out.println("No!");
}
        BTC.exchangeUAHToCurrency(1100000);
        BTC.exchangeCurrencyToUAH(1);


    }
}

