package edu.norcocollege.cis18b.week6.mini06;

/*
 * Generic observer contract for receiving updates of type T.
 *
 * @param <T> event payload type
*/
@FunctionalInterface
public interface Observer<T> {

    /*
     * Called when the subject publishes an event.
     *
     * @param event event payload
    */
    void onUpdate(T event);
}