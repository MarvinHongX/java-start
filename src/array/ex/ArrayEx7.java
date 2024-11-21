package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번째 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "국어" : (j == 1 ? "영어" : "수학");
                System.out.print(subject + "점수: ");
                scores[i][j] = scanner.nextInt();
                scores[i][3] += scores[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            double average = (double) scores[i][3] / 3;
            System.out.println((i + 1) + "번째 학생의 총점 " + scores[i][3] + ", 평균: " + average);
        }
    }
}
