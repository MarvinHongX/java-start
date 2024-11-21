package array.ex;

import java.util.Scanner;

public class ProductManagerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        ProductManager manager = new ProductManager();

        while (isRunning) {
            System.out.println();
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    manager.addProduct(scanner);
                    break;
                case 2:
                    manager.showProducts();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }

        }
        scanner.close();
    }
}

class ProductManager {
    private String[] productNames;
    private int[] productPrices;
    private int productCount;

    public ProductManager() {
        this.productNames = new String[1];
        this.productPrices = new int[1];
        this.productCount = 0;
    }

    // 상품 등록 메서드
    public void addProduct(Scanner scanner) {
        System.out.print("상품 이름: ");
        String name = scanner.nextLine();
        System.out.print("상품 가격: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        if (productCount == productNames.length) {
            // 배열 확장
            String[] newProductNames = new String[productCount + 1];
            int[] newProductPrices = new int[productCount + 1];

            System.arraycopy(productNames, 0, newProductNames, 0, productCount);
            System.arraycopy(productPrices, 0, newProductPrices, 0, productCount);

            productNames = newProductNames;
            productPrices = newProductPrices;
        }

        productNames[productCount] = name;
        productPrices[productCount] = price;
        productCount++;
        System.out.println("상품이 등록되었습니다.");
    }

    // 상품 목록 표시 메서드
    public void showProducts() {
        if (productCount == 0) {
            System.out.println("등록된 상품이 없습니다.");
            return;
        }
        System.out.println("상품 목록:");
        for (int i = 0; i < productCount; i++) {
            System.out.println((i + 1) + ". " + productNames[i] + " - " + productPrices[i] + "원");
        }
    }
}