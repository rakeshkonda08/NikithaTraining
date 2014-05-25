package com.masters.softwarerefactoring.chapter1.after;

/**
 * @author nikithaperumalla
 * @id 87312
 */
public class ChildrensPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
