package edu.norcocollege.cis18b.week6.mini01;

// Adding comments to show understanding of the code since no "TO-DO's"

/*
 * Generic Box class that stores a value of any type
*/
public class Box<T> {

    // Stores the value of type T
    private T value;

    /*
     * Sets the value inside the box
    */
    public void set(T value) {
        this.value = value;
    }

    /*
     * Retrieves the stored value
    */
    public T get() {
        return value;
    }
}