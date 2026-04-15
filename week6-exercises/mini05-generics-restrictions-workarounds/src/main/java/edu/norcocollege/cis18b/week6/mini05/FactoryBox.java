package edu.norcocollege.cis18b.week6.mini05;

import java.util.function.Supplier;

/*
 * Factory box that creates instances using a Supplier.
 *
 * @param <T> type created by the factory
 */
public class FactoryBox<T> {

    private final Supplier<T> supplier;

    /*
     * Creates a FactoryBox with the given supplier.
     *
     * @param supplier creates values of type T
    */
    public FactoryBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    /*
     * Creates and returns a value of type T.
     *
     * @return created value
    */
    public T create() {
        return supplier.get();
    }
}