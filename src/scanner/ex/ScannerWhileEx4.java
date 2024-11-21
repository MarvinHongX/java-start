package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int totalAmount = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 종료");
            System.out.print(">");
            input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.print("상품명: ");
                String name = scanner.nextLine();
                System.out.print("상품가격: ");
                int price = scanner.nextInt();
                System.out.print("상품수량: ");
                int qty = scanner.nextInt();
                scanner.nextLine();

                int amount = price * qty;
                totalAmount += amount;
                System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + qty + ", 합계: " + amount);
            } else if (input.equals("2")) {
                System.out.println("총 비용: " + totalAmount);
                totalAmount = 0;
            } else if (input.equals("3")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
