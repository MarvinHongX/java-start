package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for-each (단축: iter)
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each 사용 할 수 없는 경우, 증가하는 index 값 필요할 때
        for (int i = 0; i < numbers.length; i++){
            System.out.println(i + "번의 결과는 " + numbers[i]);
        }

    }
}
