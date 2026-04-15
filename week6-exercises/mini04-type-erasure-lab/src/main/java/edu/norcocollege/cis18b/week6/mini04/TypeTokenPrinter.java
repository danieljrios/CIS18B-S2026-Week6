package edu.norcocollege.cis18b.week6.mini04;

/*
 * Utility class showing how Class<T> tokens preserve some type information at runtime
*/
public final class TypeTokenPrinter {

    private TypeTokenPrinter() {
        // Prevent instantiation of utility class
    }

    /*
     * Returns the simple name of the class represented by the token.
     *
     * Parameter desc:
     * @param token runtime class token
     * @param <T> represented type
     * @return simple class name
    */
    public static <T> String simpleNameOf(Class<T> token) {
        return token.getSimpleName();
    }
}