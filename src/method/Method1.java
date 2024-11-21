package method;

public class Method1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum1 = add(a, b);
        System.out.println(a + " + " + b + " = " + sum1);

    }

    private static int add (int a, int b) {
        return (a + b);
    };
}
