package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print(">");
            int input = scanner.nextInt();
            if (input == 0) break;
            sum += input;
            System.out.println("누적 합:" + sum);
        }
    }
}
