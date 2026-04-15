package edu.norcocollege.cis18b.week6.mini06;

/*
 * Generic subject contract for managing observers and sending notifications.
 *
 * @param <T> event payload type
*/
public interface Subject<T> {

    /**
     * Adds an observer to the subject.
     *
     * @param observer observer to subscribe
    */
    void subscribe(Observer<T> observer);

    /*
     * Removes an observer from the subject.
     *
     * @param observer observer to unsubscribe
    */
    void unsubscribe(Observer<T> observer);

    /*
     * Sends an event to all subscribed observers.
     *
     * @param event event payload
    */
    void notifyObservers(T event);
}