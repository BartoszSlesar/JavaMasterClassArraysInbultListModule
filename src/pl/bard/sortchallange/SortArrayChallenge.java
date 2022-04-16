package pl.bard.sortchallange;

public class SortArrayChallenge {

    public static void bubbleSort(int[] number) {
        int n = number.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (number[j-1] < number[j]) {
                    int tmp = number[j-1];
                    number[j-1] = number[j];
                    number[j] = tmp;
                }
            }
        }

    }


}

