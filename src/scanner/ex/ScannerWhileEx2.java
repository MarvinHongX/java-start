package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("상품의 가격을 입력하세요(-1 입력시 종료): ");
            int price = scanner.nextInt();
            if (price == -1) break;
            
            System.out.print("상품의 수량을 입력하세요: ");
            int qty = scanner.nextInt();
            
            int amount = price * qty;
            System.out.println("amount = " + amount);
        }
    }
}
