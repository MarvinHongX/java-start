package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하세요('종료'를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) break;

            System.out.print("나이을 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // remove \n

            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }


    }
}
