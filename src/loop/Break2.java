package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++){
            sum += i;
            if (sum > 10) break;
        }
        System.out.println("sum = " + sum);
    }
}
