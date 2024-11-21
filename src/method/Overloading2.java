package method;

public class Overloading2 {
    public static void main(String[] args) {
        add(1, 2.0);
        add(1.0, 2);
    }
    public static void add(int a, double b) {
        System.out.println("1번 메소드 호출: " + (a + b));
    }
    public static void add(double a, int b) {
        System.out.println("2번 메소드 호출: " + (a + b));
    }
}
