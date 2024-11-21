package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("before number = " + number);
        changeNumber(number);
        System.out.println("after number = " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("  before number = " + number);
        number *= 3;
        System.out.println("  after number = " + number);
    }
}

