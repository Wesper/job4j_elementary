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
        int result = value / 70;
        return result;
    }

    /**
     *
     * @param value in rubles
     * @return converted value in dollar
     */
    public static int rubleToDollar(int value) {
        int result = value / 60;
        return result;
    }

    /**
     *
     * @param args args
     */
    public static void main(String[] args) {

        /**
         * Amount of rubles
         */
        int input = 140;

        /**
         * Amount of euro
         */
        int expected = 2;

        /**
         * Converted value in euro
         */
        int output = rubleToEuro(input);

        /**
         * Validate calculation
         */
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        input = 180;
        expected = 3;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
