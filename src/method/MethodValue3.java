package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("before number = " + number);
        number = changeNumber(number);
        System.out.println("after number = " + number);
    }

    public static int changeNumber(int number) {
        return number * 2;
    }
}
