package pl.bard.arrayminchallange;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of values in array");
        int count = scan.nextInt();
        scan.nextLine();
        int[] val = MinElementChallenge.readIntegers(count, scan);
        System.out.println(MinElementChallenge.findMin(val));
    }
}
