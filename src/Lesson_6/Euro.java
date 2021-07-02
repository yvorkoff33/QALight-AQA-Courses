package Lesson_6;

public class Euro extends Currency{

    public Euro (int kursNBUEx){
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }
}
