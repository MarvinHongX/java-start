package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input;
        System.out.print(">");
        while ((input = scanner.nextInt()) != -1) {
            System.out.print(">");
            sum += input;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
