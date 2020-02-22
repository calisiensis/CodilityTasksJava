package pl.org.schroeder;

import java.util.ArrayList;
import java.util.List;

/*Codility - task 1 - Binary Gap*/

public class BinaryGap {

    public static int solution(int N) {
        String binaryNumber = Integer.toBinaryString(N);
        int longestBinaryGap = 0;

        // this part of code is responsible for collecting ones into arrayList
        List<Integer> listOfOnes = new ArrayList<>();

        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '0') continue;
            listOfOnes.add(i);
        }

        // this part of code is responsible for looking for binary gaps

        // substracting 1 from a listOfOnes size is necessary for elimination of counting anything if oneList's size
        // is one and there is no binary gap
        for (int i = 0; i < listOfOnes.size() - 1; i++) {
            // substracting 1 is necessary for elimination of counting ones next to each other as having any gap
            int indicesDiff = listOfOnes.get(i + 1) - listOfOnes.get(i) - 1;
            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
        }
        return longestBinaryGap;
    }
}
