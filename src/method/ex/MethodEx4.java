package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        BalanceManager manager = new BalanceManager();
        while (isRunning) {
            System.out.println();
            System.out.print("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료\n메뉴를 선택하세요:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("입금액: ");
                    int depositAmount = scanner.nextInt();
                    manager.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금액: ");
                    int withdrawAmount = scanner.nextInt();
                    manager.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("잔액: " + manager.getBalance());
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}

class BalanceManager {
    private int balance;

    public BalanceManager() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance = balance + amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + this.balance + "원");
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.balance = balance - amount;
        System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + this.balance + "원");
    }

}