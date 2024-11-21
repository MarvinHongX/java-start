package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식이름: ");
        String name = scanner.nextLine();
        System.out.print("음식가격: ");
        int price = scanner.nextInt();
        System.out.print("음식수량: ");
        int qty = scanner.nextInt();

        int amount = price * qty;
        System.out.println(name + "을(를) 주문하셨습니다. 총 가격은 " + amount + "원 입니다.");
    }
}
