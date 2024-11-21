package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
//        int[] students = new int[] {90, 80, 70, 60, 50};
        int[] students = {90, 80, 70, 60, 50};
        int sum = 0;
        double average = 0;

        for (int student : students) {
            sum += student;
        }
        average = (double) sum / students.length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
