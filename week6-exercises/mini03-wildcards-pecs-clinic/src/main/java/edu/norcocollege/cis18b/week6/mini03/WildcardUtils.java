package edu.norcocollege.cis18b.week6.mini03;

import java.util.List;

/*
 * Utility methods demonstrating wildcard bounds and PECS.
*/
public final class WildcardUtils {

    private WildcardUtils() {
        // Prevent instantiation of utility class
    }

    /*
     * Sums all numeric values in the list.
     * PECS: this list is a producer of Number values, so use "? extends Number".
     *
     * Parameters:
     * @param values list of numbers or subclasses of Number
     * @return total as a double
    */
    public static double sumAll(List<? extends Number> values) {
        double total = 0.0;
        for (Number value : values) {
            total += value.doubleValue();
        }
        return total;
    }

    /*
     * Adds practice Integer scores to the destination list
     * PECS: this list is a consumer of Integer values, uses "? super Integer".
     *
     * @param values destination list that can accept Integer values
    */
    public static void addPracticeScores(List<? super Integer> values) {
        values.add(70);
        values.add(75);
        values.add(80);
    }

    /*
     * Copies all values from a source list into a target list.
     * Source produces values, target consumes values.
     *
     * Parameter:
     * @param source source list
     * @param target destination list
     * @param <T> element type
    */
    public static <T> void copyAll(List<? extends T> source, List<? super T> target) {
        target.addAll(source);
    }
}