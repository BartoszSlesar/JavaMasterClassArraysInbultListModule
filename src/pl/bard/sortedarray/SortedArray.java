package pl.bard.sortedarray;

import java.util.Scanner;

public class SortedArray {
    private static Scanner scan = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] returnedArray = new int[number];
        for (int i = 0; i < number; i++) {
            if (scan.hasNextInt()) {
                returnedArray[i] = scan.nextInt();
            }
            scan.nextLine();
        }
        return returnedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int n = array.length;
        int[] copyArray = array.clone();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (copyArray[j - 1] < copyArray[j]) {
                    int tmp = copyArray[j - 1];
                    copyArray[j - 1] = copyArray[j];
                    copyArray[j] = tmp;
                }
            }
        }
        return copyArray;
    }

    public static void main(String[] args) {
       getIntegers(5);
    }
}
