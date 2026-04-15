package edu.norcocollege.cis18b.week6.mini02;

/*
 * Here's a generic pair record that stores two related values
 *
 * @param left the left value
 * @param right the right value
 * @param <L> type of the left value
 * @param <R> type of the right value
 */
public record Pair<L, R>(L left, R right) {

    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}