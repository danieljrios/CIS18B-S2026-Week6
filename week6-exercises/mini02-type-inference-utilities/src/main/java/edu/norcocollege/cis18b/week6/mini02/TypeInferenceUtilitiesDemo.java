package edu.norcocollege.cis18b.week6.mini02;

/*
 * Demonstrates generic helper methods and Java type inference
*/
public class TypeInferenceUtilitiesDemo {

    /*
     * Factory method that creates a Pair
    */
    public static <L, R> Pair<L, R> pair(L left, R right) {
        return new Pair<>(left, right);
    }

    /*
     * Returns the second of two values of the same type
    */
    public static <T> T chooseSecond(T first, T second) {
        return second;
    }

    /*
     * Extension challemge method implemented:
     * Returns the first non-null value, or null if both are null
     */
    public static <T> T chooseNonNull(T first, T second) {
        if (first != null) {
            return first;
        }
        return second;
    }

    public static void main(String[] args) {

        // Type arguments are inferred automatically from the arguments here
        Pair<String, Integer> studentScore = pair("Ada", 98);

        // Java infers T as String
        String secondName = chooseSecond("Ada", "Grace");

        // Explicit type arguments are able to improve readability when null is involved,
        // b/c they make the intended type clear to the reader
        String explicitValue = TypeInferenceUtilitiesDemo.<String>chooseSecond(null, "fallback");

        System.out.println("Pair: " + studentScore);
        System.out.println("Second name: " + secondName);
        System.out.println("Explicit value: " + explicitValue);
    }
}