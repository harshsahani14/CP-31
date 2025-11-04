import java.util.Scanner;

public class TargetPractice {

    public static void main(String[] args) {

        int score[][] = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 },
                { 1, 2, 3, 4, 4, 4, 4, 3, 2, 1 },
                { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 },
                { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 },
                { 1, 2, 3, 4, 4, 4, 4, 3, 2, 1 },
                { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            char board[][] = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String row = sc.next();
                board[i] = row.toCharArray();
            }

            int totalScore = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (board[i][j] == 'X') {
                        totalScore += score[i][j];
                    }
                }
            }
            System.out.println(totalScore);
        }
    }
}
