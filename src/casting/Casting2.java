package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // java: incompatible types: possible lossy conversion from double to int
        intValue = (int) doubleValue;
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);
    }
}
