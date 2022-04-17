package pl.bard.arrayminchallange;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        return number;
    }

    private static int[] readElements(int count) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scan.nextInt();
            scan.nextLine();
        }
        scan.close();
        return array;
    }

    private static int findMin(int[] array){
        OptionalInt value = Arrays.stream(array).min();
        return value.isPresent() ? value.getAsInt() : Integer.MAX_VALUE;
    }
}
