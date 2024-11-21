package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print(">");
            numbers[i] = scanner.nextInt();
            if (i == 0) {
                maxValue = minValue = numbers[i];
            } else {
                maxValue = (numbers[i] > maxValue) ? numbers[i] : maxValue;
                minValue = (numbers[i] < minValue) ? numbers[i] : minValue;
            }
        }

        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);
    }
}
