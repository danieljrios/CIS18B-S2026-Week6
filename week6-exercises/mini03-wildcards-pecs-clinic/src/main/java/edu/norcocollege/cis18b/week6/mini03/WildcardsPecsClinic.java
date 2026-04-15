package edu.norcocollege.cis18b.week6.mini03;

import java.util.ArrayList;
import java.util.List;

/*
 * Demonstrates wildcard bounds using producer and consumer methods
*/
public class WildcardsPecsClinic {

    public static void main(String[] args) {
        List<Number> gradedScores = List.of(100, 85.5, 80);
        double total = WildcardUtils.sumAll(gradedScores);

        List<Number> practice = new ArrayList<>();
        WildcardUtils.addPracticeScores(practice);

        List<Integer> copySource = List.of(70, 75, 80);
        List<Number> copiedValues = new ArrayList<>();
        WildcardUtils.copyAll(copySource, copiedValues);

        System.out.printf("Total score: %.1f%n", total);
        System.out.println("After practice adds: " + practice);
        System.out.println("Copied values: " + copiedValues);
    }
}