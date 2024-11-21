package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(">");
            String str = scanner.nextLine();
            if (str.equals("exit")) break;
            System.out.println(str);
        }
    }
}
