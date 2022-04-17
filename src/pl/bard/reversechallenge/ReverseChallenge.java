package pl.bard.reversechallenge;

import java.util.Arrays;

public class ReverseChallenge {

    public static void reverseArray(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int tmp = array[i];
            array[i] = array[n-(i+1)];
            array[n-(i+1)] = tmp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
