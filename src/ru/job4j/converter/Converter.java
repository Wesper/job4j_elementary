package ru.job4j.converter;

/**
 * Converter rubles to euro or dollars
 * @author Belyanko Artem
 * @version 1.0
 */
public class Converter {
    /**
     *
     * @param value in rubles
     * @return converted value in euro
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     *
     * @param value in rubles
     * @return converted value in dollar
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     *
     * @param args args
     */
    public static void main(String[] args) {

        /**
         * Amount of rubles
         */
        int in = 140;

        /**
         * Amount of euro
         */
        int expected = 2;

        /**
         * Converted value in euro
         */
        int out = rubleToEuro(in);

        /**
         * Validate calculation
         */
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
