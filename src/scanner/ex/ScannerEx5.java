package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++) {
            if (i != num1) System.out.print(", ");
            System.out.print(i);

        }
    }
}
