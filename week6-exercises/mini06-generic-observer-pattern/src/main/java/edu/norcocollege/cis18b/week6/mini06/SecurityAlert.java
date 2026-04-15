package edu.norcocollege.cis18b.week6.mini06;

/*
 * Represents a typed security alert payload for the observer demo.
 *
 * @param level severity level
 * @param message alert message
*/
public record SecurityAlert(String level, String message) {
}