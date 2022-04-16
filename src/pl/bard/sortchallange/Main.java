package pl.bard.sortchallange;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] test = {106, 26, 81, 5, 15};
        SortArrayChallenge.bubbleSort(test);
        System.out.println(Arrays.toString(test));

    }
}
