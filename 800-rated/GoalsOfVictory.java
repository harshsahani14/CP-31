import java.util.Scanner;

public class GoalsOfVictory {

    public static void main(String[] args) {

        // Implementation goes here

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int count = 0;

            for (int i = 0; i < n - 1; i++) {
                int goals = sc.nextInt();
                count += goals;
            }

            count *= -1;

            System.out.println(count);

        }
    }
}
