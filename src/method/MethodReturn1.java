package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        System.out.println(odd(2));
        System.out.println(odd(1));
    }

    public static boolean odd(int number) {
        return (number % 2 == 1);
    }
}