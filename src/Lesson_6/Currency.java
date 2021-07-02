package Lesson_6;

abstract public class Currency {
    private double kursNBU;
    private double marga = 0.1;
    private Object IsFreeConverted;

    public Currency(double kursNBUEx) {
        this.kursNBU = kursNBUEx;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBUEy) {
        this.kursNBU = kursNBUEy;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double exchangeUAHToCurrency(double numberOfUAH) {
        double kursBuy = kursNBU * (1 + marga);
        double tempResult = numberOfUAH / kursBuy;
        System.out.println(String.format("For %s UAH you got %s %s by kurs %s", numberOfUAH, tempResult, getCurrencyName(), kursBuy));
        return tempResult;
    }

    public double exchangeCurrencyToUAH(double numberOfCurrency) {
        double kursSell = kursNBU * (1 - marga);
        double tempResult = numberOfCurrency * kursSell;
        System.out.println(String.format("For %s %s you got %s by kurs %s", numberOfCurrency, getCurrencyName(), tempResult, kursSell));
        return tempResult;
    }

    abstract String getCurrencyName();
}
