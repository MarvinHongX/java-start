package method;

public class MethodeCasting2 {
    public static void main(String[] args) {
        int number = 10;
        printNumber(number); // 자동 형변환
    }
    public static void printNumber(double number) {
        System.out.println("number = " + number);
    }
}
