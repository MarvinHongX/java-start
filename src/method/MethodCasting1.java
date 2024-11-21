package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;

//        printNumber(number); // java: incompatible types: possible lossy conversion from double to int
        printNumber((int) number); // 명시적 형변환
    }

    public static void printNumber(int number) {
        System.out.println(number);
    }
}
