package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        int intValue = scanner.nextInt();

        String result = intValue % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result + "입니다.");
    }
}
