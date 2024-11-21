package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[];
        int n = 0;
        int sum = 0;
        double average = 0;

        System.out.print("입력받을 숫자의 개수: ");
        n = scanner.nextInt();
        numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(">");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / numbers.length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
