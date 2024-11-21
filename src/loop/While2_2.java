package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int endNum = 3;

        while (i < endNum) {
            sum += ++i;
            System.out.println("sum = " + sum);
        }
    }
}
