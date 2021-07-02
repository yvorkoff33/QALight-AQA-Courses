package Lesson_6;

public class Dollar extends Currency implements IsFreeConverted{

    public Dollar(int kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "USD" ;
    }

    @Override
    public boolean freeToConvert() {
        return true;
    }
}
