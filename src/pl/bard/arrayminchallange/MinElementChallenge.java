package pl.bard.arrayminchallange;

import java.util.*;

public class MinElementChallenge {


    public static int[] readIntegers(int count) {
        Random random = new Random();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    public static int[] readIntegers(int count, Scanner scan) {
        int[] array = new int[count];
        int index = 0;
        while (index < count) {
            if (scan.hasNextInt()) {
                array[index] = scan.nextInt();
                index++;
            } else {
                scan.nextLine();
            }

        }
        return array;
    }

    public static int findMin(int[] array) {
        OptionalInt val = Arrays.stream(array).min();
        return val.isPresent() ? val.getAsInt() : Integer.MAX_VALUE;
    }
}
