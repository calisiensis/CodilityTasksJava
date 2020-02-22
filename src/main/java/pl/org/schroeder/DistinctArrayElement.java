package pl.org.schroeder;

/*Codility - Task 6.1 - Distinct*/

import java.util.HashSet;
import java.util.Set;

public class DistinctArrayElement {

    public static int solution(int[] A) {

        Set<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {

            uniqueSet.add(A[i]);

        }

        return (uniqueSet.size());
    }
}
